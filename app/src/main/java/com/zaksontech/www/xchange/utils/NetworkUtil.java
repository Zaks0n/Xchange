package com.zaksontech.www.xchange.utils;

import android.content.Context;
import android.net.ConnectivityManager;

import static android.content.Context.CONNECTIVITY_SERVICE;


public final class NetworkUtil {
    //Util class, cant be instantiated from outside the class
    private NetworkUtil() {
    }

    public static boolean isNetworkConnected(Context context) {
        ConnectivityManager manager = (ConnectivityManager)
                context.getSystemService(CONNECTIVITY_SERVICE);
        boolean isNetworkAvailable = manager.getActiveNetworkInfo() != null;
        return isNetworkAvailable && manager.getActiveNetworkInfo().isConnected();
    }
}
