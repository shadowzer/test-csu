package com.example.services;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class BaseService {
    private static Retrofit.Builder retrofit;

    public static Retrofit.Builder getRetrofit() {
        if (retrofit == null) {
            retrofit = new Retrofit.Builder();
        }
        return retrofit;
    }
}
