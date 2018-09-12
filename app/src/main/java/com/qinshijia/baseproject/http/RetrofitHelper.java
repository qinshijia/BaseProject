package com.qinshijia.baseproject.http;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.fastjson.FastJsonConverterFactory;

/**
 * Created by qinshijia on 2018/9/11.
 */
public class RetrofitHelper {

    private Retrofit.Builder mBuilder;
    private BiyingServices mBiyingServices;

    public RetrofitHelper() {
        mBuilder =  new Retrofit.Builder()
                .addConverterFactory(FastJsonConverterFactory.create())//解析方法
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())//新的配置
                .client(OkHttpClientFactory.INSTANCE.getOkHttpClient());
    }

    /**
     * 获取接口
     */
    public BiyingServices biyingService() {
        if (mBiyingServices == null) {
            Retrofit retrofit = mBuilder.baseUrl(HTTPConstant.BIYING_BASE_URL).build();
            mBiyingServices = retrofit.create(BiyingServices.class);
        }
        return mBiyingServices;
    }
}
