package com.abhishek.fundhawk.ui;

import android.arch.lifecycle.ViewModel;
import android.databinding.ObservableField;
import android.util.Log;
import android.util.Pair;

import com.abhishek.fundhawk.model.SearchPostBody;
import com.abhishek.fundhawk.model.SearchResult.SearchResult;
import com.abhishek.fundhawk.repository.ApiRepository;
import com.abhishek.fundhawk.repository.ApiRepositoryHelper;
import com.abhishek.fundhawk.utils.SingleLiveEvent;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.inject.Inject;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.schedulers.Schedulers;
import io.reactivex.subjects.PublishSubject;

public class SearchActivityViewModel extends ViewModel {

    private ApiRepository repository;
    public ObservableField<String> infoText = new ObservableField<>();
    public ObservableField<Boolean> isTyped = new ObservableField<>(false);
    public ObservableField<Boolean> isTyping = new ObservableField<>(false);
    public ObservableField<Boolean> listVisibility = new ObservableField<>(false);
    public ObservableField<Boolean> contentVisibility = new ObservableField<>(true);
    private CompositeDisposable disposable;
    private PublishSubject<String> subject;
    private List<SearchResult> searchResultList;
    SingleLiveEvent<List<String>> successCommand = new SingleLiveEvent<>();
    SingleLiveEvent<ArrayList<SearchResult>> updateAdapter = new SingleLiveEvent<>();
    SingleLiveEvent<String> clearText = new SingleLiveEvent<>();
    SingleLiveEvent<String> errorToast = new SingleLiveEvent<>();




    private ArrayList<SearchResult> selectedResults = new ArrayList<>();


    @Inject
    public SearchActivityViewModel(ApiRepositoryHelper repository) {
        this.repository = repository;
        subject = PublishSubject.create();
        disposable = new CompositeDisposable();
        SearchPostBody body = new SearchPostBody();
        body.setOffset(0);
        body.setRows(2);
        disposable.add(subject
                .doOnEach(stringNotification -> {
                    if (stringNotification.getValue().length() < 3) {
                        isTyping.set(false);
                        isTyped.set(true);
                    }
                })
                .debounce(300,
                        TimeUnit.MILLISECONDS)
                .filter(s -> s.length() >= 3)
                .switchMap(s -> {
                    body.setSearch(s);
                    return repository.searchFunds("", body)
                            .subscribeOn(Schedulers.io());
                })
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(searchResultBody -> {
                    isTyping.set(false);
                    isTyped.set(true);
                    if (searchResultBody.getData().getSearchResults().size() != 0) {
                        if (searchResultList != null)
                            searchResultList.clear();
                        searchResultList = searchResultBody.getData().getSearchResults();
                        listVisibility.set(true);
                        successCommand.setValue(getNames(searchResultList));
                    }

                }, throwable -> {
                    isTyping.set(false);
                    isTyped.set(true);

                })
        );

    }

    private ArrayList<String> getNames(List<SearchResult> searchResults) {

        ArrayList<String> searchResult = new ArrayList<>();

        for (SearchResult result : searchResults) {
            searchResult.add(result.getName());
        }
        return searchResult;
    }


    public void onTextChanged(CharSequence s, int start, int before, int count) {

        isTyping.set(true);
        isTyped.set(false);


        subject.onNext(s.toString());

    }

    @Override
    protected void onCleared() {
        disposable.dispose();
        super.onCleared();
    }

    public void onItemSelected(int k) {
        selectedResults.add(searchResultList.get(k));
        updateAdapter.setValue(selectedResults);

    }

    public void onClearClick() {
        clearText.setValue("");
    }

    public void onCompareClick() {
        if(selectedResults.size() <= 1) {
            errorToast.setValue("Select atlease two funds to compare");
        } else if(selectedResults.size() >= 4) {
            errorToast.setValue("You can compare maximum of three funds at a time");

        }

    }

}
