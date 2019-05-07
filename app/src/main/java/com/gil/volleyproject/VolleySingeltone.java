package com.gil.volleyproject;

import android.content.Context;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;

public class VolleySingeltone {

    private static VolleySingeltone mInstance;
    private RequestQueue mRequestQueue;

    private VolleySingeltone(Context context){
        mRequestQueue = Volley.newRequestQueue(context.getApplicationContext());
    }

    public static synchronized VolleySingeltone getInstance (Context context){
        if (mInstance == null){
            mInstance = new VolleySingeltone(context);
        }
        return mInstance;
    }

    public RequestQueue getRequestQueue(){
        return mRequestQueue;
    }
}
