package com.coolweather.android.log;

import android.util.Log;

/**
 * Created by qi on 2017/2/22.
 */

public class LogUtil {
    public static final String TAG = "LOG";
    public static final int INVISIBLE = 1;
    public static void loge(String logName,Object log,boolean flag){
        if (flag){
            Log.e(TAG, logName+" : " +log);
        }
    }
}
