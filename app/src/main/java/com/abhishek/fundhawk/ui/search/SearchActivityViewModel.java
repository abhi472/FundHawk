package com.abhishek.fundhawk.ui.search;

import android.arch.lifecycle.ViewModel;
import android.databinding.ObservableField;
import android.text.SpannableString;
import android.text.style.RelativeSizeSpan;
import android.util.Log;
import android.util.Pair;

import com.abhishek.fundhawk.model.SearchPostBody;
import com.abhishek.fundhawk.model.SearchResult.SearchResult;
import com.abhishek.fundhawk.model.SelectedFunds;
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
    public ObservableField<SpannableString> infoText = new ObservableField<>();
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
    public ObservableField<String> errorText = new ObservableField<>();

    SingleLiveEvent<String> errorToast = new SingleLiveEvent<>();
    SingleLiveEvent<ArrayList<SelectedFunds>> transitActivity = new SingleLiveEvent<>();
    private ArrayList<SearchResult> selectedResults = new ArrayList<>();
    private int size = 0;
    private SpannableString baseString;


    @Inject
    public SearchActivityViewModel(ApiRepositoryHelper repository) {
        baseString = new SpannableString("List empty \n Please enter at least three characters in the search bar to begin search");
        baseString.setSpan(new RelativeSizeSpan(2.0f), 0, 10, 1);
        infoText.set(baseString);
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
                    } else {
                        SpannableString errorString = new SpannableString("No results \n No mutual funds found for the search query");
                        errorString.setSpan(new RelativeSizeSpan(2.0f), 0, 10, 1);
                        infoText.set(errorString);
                        errorText.set("No results found");
                        contentVisibility.set(true);
                    }

                }, throwable -> {
                    isTyping.set(false);
                    isTyped.set(true);
                    infoText.set(new SpannableString("Some error occurred"));
                    contentVisibility.set(true);

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
        if (contentVisibility.get()) {
            contentVisibility.set(false);
        }
        selectedResults.add(searchResultList.get(k));
        updateAdapter.setValue(selectedResults);
        size++;
        if (selectedResults.size() == 3) {
            startComparisonActivity();

        }


    }

    public void onClearClick() {
        clearText.setValue("");
    }

    public void onCompareClick() {
        if (size <= 1) {
            errorToast.setValue("Select atlease two funds to compare");
        } else if (size >= 4) {
            errorToast.setValue("You can compare maximum of three funds at a time");
        } else {
            startComparisonActivity();
        }

    }

    private void startComparisonActivity() {
        ArrayList<SelectedFunds> listKeys = new ArrayList<>();
        for (SearchResult result : selectedResults) {
            SelectedFunds fund = new SelectedFunds(result.getName(),
                    result.getSchemeKey());
            listKeys.add(fund);
        }
        transitActivity.setValue(listKeys);
    }

    public void dataUpdated(int size) {
        this.size = size;
        if (size == 0) {
            infoText.set(baseString);
            contentVisibility.set(true);
        }


    }
}
