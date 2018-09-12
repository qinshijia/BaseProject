package com.qinshijia.baseproject.http;


import com.qinshijia.baseproject.http.bean.BiyingResponse;

import io.reactivex.Observable;
import io.reactivex.ObservableTransformer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;

/**
 * Created by qinshijia on 2018/9/11.
 */
public class HTTPHelper {

    private RetrofitHelper mRetrofitHelper;

    private HTTPHelper(){
        mRetrofitHelper = new RetrofitHelper();
    }

    private static class HolderClass {
        private final static HTTPHelper instance = new HTTPHelper();
    }

    public static HTTPHelper getInstance() {
        return HolderClass.instance;
    }

    public Observable<BiyingResponse> getImages(int index) {
        return mRetrofitHelper.biyingService().getImages("js",index,1)
                .compose(applySchedulers());
    }

    //在后台线程做网络操作，在主线程更新
    private <T> ObservableTransformer<T, T> applySchedulers() {
        return observable -> observable.subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .unsubscribeOn(Schedulers.io());
    }
}
