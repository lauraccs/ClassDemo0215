package com.example.lauraccs.laurademo0;

import android.app.Application;

import com.example.lauraccs.laurademo0.util.UtilLog;

/**
 * Created by lauraccs on 2/9/17.
 */

public class LauraApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        UtilLog.setDebug(true);
    }
}
