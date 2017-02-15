package com.example.lauraccs.laurademo0.util;

import android.content.Context;

/**
 * Created by lauraccs on 2/9/17.
 */

public class UtilDensity {

    public static int dip2px(Context context, float dpValue){
        final float scale = context.getResources().getDisplayMetrics().density;
        return (int) (dpValue * scale + 0.5f);
    }

    public static int px2dip(Context context, float pxValue){
        final float scale = context.getResources().getDisplayMetrics().density;
        return (int) (pxValue/scale + 0.5f);
    }
}
