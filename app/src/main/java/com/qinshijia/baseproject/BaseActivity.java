package com.qinshijia.baseproject;

import android.app.Activity;

import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;

/**
 * Created by qinshijia on 2018/9/11.
 */
public class BaseActivity extends Activity {
    protected CompositeDisposable mCompositeDisposable;

    @Override
    protected void onPause() {
        super.onPause();
        clearDisposable();
    }

    /**
     * 新增订阅
     * @param disposable
     */
    protected void addDisposable(Disposable disposable) {
        if (mCompositeDisposable == null) {
            mCompositeDisposable = new CompositeDisposable();
        }
        mCompositeDisposable.add(disposable);
    }

    /**
     * 清除所有订阅，
     */
    private void clearDisposable() {
        if (mCompositeDisposable != null) {
            mCompositeDisposable.clear();
        }
    }
}
