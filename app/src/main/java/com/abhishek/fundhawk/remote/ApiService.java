package com.abhishek.fundhawk.remote;

import com.abhishek.fundhawk.model.MutualFundResult.MutualFundResultBody;
import com.abhishek.fundhawk.model.SearchPostBody;
import com.abhishek.fundhawk.model.SearchResult.SearchResultBody;

import io.reactivex.Single;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface ApiService {

    @GET("v1/mf")
    Single<MutualFundResultBody> getMutualFunds(@Header("Authorization") String authKey,
                                                @Query("key") String key);

    @POST
    Single<SearchResultBody> searchFunds(@Header("Authorization") String authKey,
                                         @Body SearchPostBody searchBody);
}
