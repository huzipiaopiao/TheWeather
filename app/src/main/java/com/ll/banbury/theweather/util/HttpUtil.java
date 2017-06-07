package com.ll.banbury.theweather.util;

import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by banbury on 2017/6/7.
 */
public class HttpUtil {

    public static void sendOkHttpRequset(String address, Callback callback) {
        OkHttpClient okHttpClient = new OkHttpClient();
        Request build = new Request.Builder().url(address).build();
        okHttpClient.newCall(build).enqueue(callback);
    }
}
