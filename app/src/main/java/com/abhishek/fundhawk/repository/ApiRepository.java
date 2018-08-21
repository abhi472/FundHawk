package com.abhishek.fundhawk.repository;

import com.abhishek.fundhawk.model.MutualFundResult.MutualFundResultBody;
import com.abhishek.fundhawk.model.SearchPostBody;
import com.abhishek.fundhawk.model.SearchResult.SearchResultBody;

import io.reactivex.Observable;
import io.reactivex.Single;

public interface ApiRepository {

    Single<MutualFundResultBody> getMutualFunds(String authKey, String key);

    Observable<SearchResultBody> searchFunds(String authKey, SearchPostBody searchBody);

}
