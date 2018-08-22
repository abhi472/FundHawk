package com.abhishek.fundhawk.remote;

import com.abhishek.fundhawk.model.MutualFundResult.MutualFundResultBody;
import com.abhishek.fundhawk.model.SearchPostBody;
import com.abhishek.fundhawk.model.SearchResult.SearchResultBody;

import javax.inject.Inject;
import javax.inject.Singleton;

import io.reactivex.Observable;
import io.reactivex.Single;

@Singleton
public class ApiServiceHelper implements ApiService {

    private final ApiService service;

    @Inject
    public ApiServiceHelper(ApiService service) {
        this.service = service;
    }

    @Override
    public Observable<MutualFundResultBody> getMutualFunds(String authKey, String key) {
        return service.getMutualFunds(authKey, key);
    }

    @Override
    public Observable<SearchResultBody> searchFunds(String authKey, SearchPostBody searchBody) {
        return service.searchFunds(authKey, searchBody);
    }
}
