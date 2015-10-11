package com.example.haisun.myapplication3;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.util.Log;

/**
 * Created by HaiSun on 2015/10/10.
 */
public class MyService extends Service {

    private DownLoadBinder mBinder = new DownLoadBinder();
    class DownLoadBinder extends Binder {
    public void startDownLoad(){
        Log.d("MyService","startDownLoad executed");
    }
    public int getProgress(){
        Log.d("MyService","getProgress executed");
        return 0;
    }

}
    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return mBinder;
    }

    @Override
    public void onCreate() {
        super.onCreate();
//        Notification notification = new Notification(R.drawable.ic_launcher,
//                "Notification comes", System.currentTimeMillis());
//        Intent notificationIntent = new Intent(this,MainActivity.class);
//        PendingIntent pendingIntent = PendingIntent.getActivity(this,0,notificationIntent,0);
//        notification.setLatestEventInfo(this,"This is title","This is content",pendingIntent);
//        startForeground(1,notification);
        Log.d("MyService","onCreate executed");
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Log.d("MyService","onStartCommand executed");
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                //具体逻辑
//                stopSelf();
//            }
//        }).start();
        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public void onDestroy() {
        Log.d("MyService","onDestroy executed");
        super.onDestroy();
    }
}
