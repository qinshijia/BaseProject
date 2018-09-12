package com.qinshijia.baseproject;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.jakewharton.rxbinding2.view.RxView;
import com.qinshijia.baseproject.databinding.ActivityMainBinding;
import com.qinshijia.baseproject.http.HTTPConstant;
import com.qinshijia.baseproject.http.HTTPHelper;
import com.qinshijia.baseproject.util.LogUtil;

import java.util.concurrent.TimeUnit;

import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;

public class MainActivity extends BaseActivity {

    private ActivityMainBinding mBinding;
    private int mImageIndex = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding = DataBindingUtil.setContentView(this, com.qinshijia.baseproject.R.layout.activity_main);
        initData(mImageIndex);
        initEvent();
    }

    private void initData(int index) {
        Disposable disposable = Observable.just(index)
                .filter(i -> i >= 0)    //图片小于0则不需要处理
                .flatMap(i -> HTTPHelper.getInstance().getImages(index))// 请求图片信息
                .subscribe(o -> {
                    String imageUrl = HTTPConstant.BIYING_BASE_URL + o.getImages().get(0).getUrl(); // 加载图片
                    LogUtil.d("image url is %s", imageUrl);
                    Glide.with(this)
                            .load(imageUrl)
                            .into(mBinding.image);
                },e -> Toast.makeText(this,"加载图片失败",Toast.LENGTH_SHORT).show());
        addDisposable(disposable);
    }

    private void initEvent() {
        Disposable preDisposable = RxView.clicks(mBinding.pre) //上一张
                .throttleFirst(2, TimeUnit.SECONDS)
                .subscribe(o -> initData(--mImageIndex));
        Disposable nextDisposable = RxView.clicks(mBinding.next) // 下一张
                .throttleFirst(2, TimeUnit.SECONDS)
                .subscribe(o -> initData(++mImageIndex));
        addDisposable(preDisposable);
        addDisposable(nextDisposable);
    }
}
