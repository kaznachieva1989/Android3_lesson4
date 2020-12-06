package com.example.android3_lesson4.data.network;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class SashService {

    private SashService() {
    }

    private static final String BASE_URL = "http://android-3-mocker.herokuapp.com/";
    private static SashApi sashApi;


    public static SashApi getInstance() {
        if (sashApi == null) {
            sashApi = buildRetrofit();
        }
        return sashApi;
    }

    private static SashApi buildRetrofit() {
        return new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build().create(SashApi.class);
    }
}
