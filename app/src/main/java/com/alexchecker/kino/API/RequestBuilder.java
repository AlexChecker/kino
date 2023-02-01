package com.alexchecker.kino.API;

import com.google.gson.Gson;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RequestBuilder {
    private static String URL="https://kinopoiskapiunofficial.tech/";
    private static Retrofit retrofit = null;

    public static Retrofit buildRequest()
    {
        OkHttpClient okhttp = new OkHttpClient.Builder().build();

        retrofit = new Retrofit.Builder().baseUrl(URL).addConverterFactory(GsonConverterFactory.create()).client(okhttp).build();
        return retrofit;
    }
}
