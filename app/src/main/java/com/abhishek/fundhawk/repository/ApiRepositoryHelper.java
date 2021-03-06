package com.abhishek.fundhawk.repository;

import com.abhishek.fundhawk.model.MutualFundResult.MutualFundResultBody;
import com.abhishek.fundhawk.model.SearchPostBody;
import com.abhishek.fundhawk.model.SearchResult.SearchResultBody;
import com.abhishek.fundhawk.remote.ApiServiceHelper;

import javax.inject.Inject;

import io.reactivex.Observable;
import io.reactivex.Single;

public class ApiRepositoryHelper implements ApiRepository {

    private ApiServiceHelper apiServiceHelper;

    @Inject
    public ApiRepositoryHelper (ApiServiceHelper apiServiceHelper) {
        this.apiServiceHelper = apiServiceHelper;
    }

    @Override
    public Observable<MutualFundResultBody> getMutualFunds(String authKey, String key) {
        return apiServiceHelper.getMutualFunds(authKey, key);
    }

    @Override
    public Observable<SearchResultBody> searchFunds(String authKey, SearchPostBody searchBody) {
        return apiServiceHelper.searchFunds(authKey, searchBody);
    }
}
