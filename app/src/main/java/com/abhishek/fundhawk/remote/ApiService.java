package com.abhishek.fundhawk.remote;

import io.reactivex.Single;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface ApiService {

    @GET("v1/mf")
    Single<Object> getMutualFunds(@Header("Authorization") String authKey,
                                  @Query("key") String key);

    @POST
    Single<Object> searchFunds(@Header("Authorization") String authKey,
                               @Body Object searchBody);
}
