package com.example.haisun.myapplication3;

import android.app.IntentService;
import android.content.Intent;
import android.util.Log;

/**
 * Created by HaiSun on 2015/10/11.
 */
public class MyIntenService extends IntentService {
    @Override
    protected void onHandleIntent(Intent intent) {
        //打印当前线程Id
        Log.d("MyIntentService","Thread id is" + Thread.currentThread().getId());

    }

    public MyIntenService() {
        super("MyIntentService");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d("MyIntentService","onDestroy executed");
        
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public void onCreate() {
        super.onCreate();
    }
}
