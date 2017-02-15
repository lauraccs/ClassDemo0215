package com.example.lauraccs.laurademo0.util;

import android.util.Log;

/**
 * Created by lauraccs on 2/9/17.
 */

public class UtilLog {

    private static boolean Debug = false;

    public static void setDebug(boolean b){
        Debug = b;

    }

    public static void logD(String key, String value){
        if(Debug){
            Log.d(key, value);
        }
    }
}
