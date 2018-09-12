package com.qinshijia.baseproject.http;


import com.qinshijia.baseproject.util.LogUtil;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;

/**
 * 维护全局唯一一个OkHttpClient，官方推荐做法
 */

public enum OkHttpClientFactory {

    INSTANCE;

    private OkHttpClient mOkHttpClient;

    public OkHttpClient getOkHttpClient() {
        if (null == mOkHttpClient) {
            synchronized (OkHttpClientFactory.class) {
                if (mOkHttpClient == null) {
                    OkHttpClient.Builder builder = new OkHttpClient().newBuilder()
                            .connectTimeout(20, TimeUnit.SECONDS)
                            .readTimeout(20, TimeUnit.SECONDS);
                    if (LogUtil.SHOW_LOG) { // 显示http请求日志
                        HttpLoggingInterceptor loggingInterceptor = new HttpLoggingInterceptor();
                        loggingInterceptor.setLevel(HttpLoggingInterceptor.Level.HEADERS);
                        builder.addInterceptor(loggingInterceptor);
                    }
                    mOkHttpClient = builder.build();
                }
            }
        }

        return mOkHttpClient;
    }


}
