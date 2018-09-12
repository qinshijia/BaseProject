package com.qinshijia.baseproject.http;


import com.qinshijia.baseproject.http.bean.BiyingResponse;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Query;

/**
 * Created by qinshijia on 2018/9/11.
 */
public interface BiyingServices {

    @Headers("Content-Type:application/json")
    @GET("HPImageArchive.aspx")
    Observable<BiyingResponse> getImages(@Query("format") String format, @Query("idx") int index, @Query("n") int num);
}
