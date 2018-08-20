package com.abhishek.fundhawk.remote;

import javax.inject.Inject;
import javax.inject.Singleton;

import io.reactivex.Single;

@Singleton
public class ApiServiceHelper implements ApiService {

    private final ApiService service;

    @Inject
    public ApiServiceHelper(ApiService service) {
        this.service = service;
    }

    @Override
    public Single<Object> getMutualFunds(String authKey, String key) {
        return service.getMutualFunds(authKey, key);
    }

    @Override
    public Single<Object> searchFunds(String authKey, Object searchBody) {
        return service.searchFunds(authKey, searchBody);
    }
}
