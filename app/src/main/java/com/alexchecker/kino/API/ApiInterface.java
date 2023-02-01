package com.alexchecker.kino.API;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.HEAD;
import retrofit2.http.Headers;

public interface ApiInterface {

    @GET("api/v2.2/films/top?type=TOP_AWAIT_FILMS&page=1")
    @Headers({"X-API-KEY: 70672cf8-5c83-4518-ad9f-ea78a8a51d63","accept: application/json"})
    Call<TopHundred> getTopHundred();
}
