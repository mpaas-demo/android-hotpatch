package com.mpaas.demo;

import android.content.Context;

import com.alipay.mobile.framework.quinoxless.QuinoxlessApplicationLike;
import com.alipay.mobile.framework.quinoxless.QuinoxlessFramework;


public class MyApplication extends QuinoxlessApplicationLike {

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
    }

    @Override
    public void onCreate() {
        super.onCreate();
    }

    @Override
    public void onMPaaSFrameworkInitFinished() {

    }
}
