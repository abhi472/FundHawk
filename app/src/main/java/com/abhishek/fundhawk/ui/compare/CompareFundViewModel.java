package com.abhishek.fundhawk.ui.compare;

import android.arch.lifecycle.ViewModel;
import android.databinding.ObservableField;
import android.util.Log;
import android.util.SparseArray;

import com.abhishek.fundhawk.model.ComparisonBody;
import com.abhishek.fundhawk.model.MutualFundResult.MutualFund;
import com.abhishek.fundhawk.model.SearchResult.SearchResult;
import com.abhishek.fundhawk.repository.ApiRepository;
import com.abhishek.fundhawk.repository.ApiRepositoryHelper;
import com.abhishek.fundhawk.utils.SingleLiveEvent;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;

import javax.inject.Inject;

import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Action;
import io.reactivex.schedulers.Schedulers;

public class CompareFundViewModel extends ViewModel {

    private ApiRepository repository;

    public ObservableField<Boolean> listVisibility = new ObservableField<>(true);

    public ObservableField<Boolean> progressVisibility = new ObservableField<>(true);

    public ObservableField<Boolean> errorVisibility = new ObservableField<>(true);

    private CompositeDisposable disposable = new CompositeDisposable();

    private ArrayList<ComparisonBody> comparisonBodies = new ArrayList<>();

    private String[] titles = {"NAV",
            "RISKOMETER",
            "LAST YEAR",
            "LAST 3 YEARS",
            "LAST 5 YEARS",
            "SCHEME TYPE",
            "SCHEME CATEGORY",
            "BENCHMARK TYPE",
            "HIGHEST 1Yr RET(%)",
            "MIN SUBSCRIPTION",
            "MIN ADDITION SUBSCRIPTION",
            "LOCK IN",
            "EXPENSES (%)",
            "SCHEME AUM(in Crs)",
            "AMC AUM (in Crs)"
    };

    SingleLiveEvent<ArrayList<ComparisonBody>> updateAdapter = new SingleLiveEvent<>();


    private ArrayList<MutualFund> mutualFunds = new ArrayList<>();

    @Inject
    public CompareFundViewModel(ApiRepositoryHelper apiRepository) {
        this.repository = apiRepository;
        setUpComparisonBody();
    }

    private void setUpComparisonBody() {
        for (int i = 0; i < titles.length; i++) {
            ComparisonBody body = new ComparisonBody();
            body.setTitle(titles[i]);
            body.setValues(new ArrayList<>());
            comparisonBodies.add(body);
        }
    }

    public void init(ArrayList<String> keys) {


        disposable.add(Observable
                .fromIterable(keys)
                .concatMap(s -> repository.getMutualFunds("Token a41d2b39e3b47412504509bb5a1b66498fb1f43a", s))
                .doOnNext(mutualFundResultBody ->
                        mutualFunds.add(mutualFundResultBody.getData().getMutualFund()))
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .doOnComplete(this::getComparableObjects)
                .subscribe(mutualFundResultBody -> {
                }, throwable -> {
                    progressVisibility.set(false);
                }));
    }

    private void getComparableObjects() {

        for (MutualFund fund : mutualFunds) {
            comparisonBodies.get(0).getValues().add(String.valueOf(fund.getNav()));
            comparisonBodies.get(1).getValues().add(String.valueOf(fund.
                    getDetails()
                    .getRiskometer()));
            comparisonBodies.get(2).getValues().add(String.valueOf(fund
                    .getDetails()
                    .getYoyReturn()));
            comparisonBodies.get(3).getValues().add(String.valueOf(fund
                    .getDetails()
                    .getReturn3yr()));
            comparisonBodies.get(4).getValues().add(String.valueOf(fund
                    .getDetails()
                    .getReturn5yr()));
            comparisonBodies.get(5).getValues().add(String.valueOf(fund
                    .getDetails()
                    .getSchemeType()));
            comparisonBodies.get(6).getValues().add(String.valueOf(fund
                    .getDetails()
                    .getCategory()));
            comparisonBodies.get(7).getValues().add(String.valueOf(fund
                    .getDetails()
                    .getBenchmarkText()));
            comparisonBodies.get(8).getValues().add(String.format(Locale.getDefault(),
                    "%.2f\n%s - %s",
                    fund.getBestReturn().getPercentChange(),
                    fund.getBestReturn().getFromdate(),
                    fund.getBestReturn().getTodate()));
            comparisonBodies.get(9).getValues().add(String.valueOf(fund
                    .getDetails()
                    .getMinimumSubscription()));
            comparisonBodies.get(10).getValues().add(String.valueOf(fund
                    .getDetails()
                    .getMinimumAdditionSubscription()));
            comparisonBodies.get(11).getValues().add(String.valueOf(fund
                    .getDetails()
                    .getExitLoadText()));
            comparisonBodies.get(12).getValues().add(String.valueOf(fund
                    .getExpenseRatio()));
            comparisonBodies.get(13).getValues().add(String.valueOf(fund
                    .getDetails()
                    .getAssetAum()));
            comparisonBodies.get(14).getValues().add(String.valueOf(fund
                    .getDetails()
                    .getAmc()
                    .getAum()));

        }

        updateAdapter.setValue(comparisonBodies);
        listVisibility.set(true);
        progressVisibility.set(false);
    }


}
