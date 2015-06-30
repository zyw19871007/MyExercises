package com.shadow.zyw.sdu.services;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.os.RemoteException;
import android.support.v4.app.INotificationSideChannel;
import android.util.Log;

/**
 * Created by shadow on 2015/6/30.
 */
public class MyService extends Service{
    private MyBinder myBinder = new MyBinder();
    MyAidlService.Stub myAidlService = new MyAidlService.Stub() {
        @Override
        public void basicTypes(int anInt, long aLong, boolean aBoolean, float aFloat, double aDouble, String aString) throws RemoteException {

        }

        @Override
        public int plus(int a, int b) throws RemoteException {
            return a+b;
        }
    };
    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Log.d("test", "on startcommand");
        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d("test", "on destroy");
    }

    @Override
    public void onCreate() {
        super.onCreate();
        Log.d("test", "on create");

        Log.d("test", "thread id" + Thread.currentThread().getId());
        //创建前台service
//        Notification notification = new Notification.Builder(this).setContentTitle("title").setContentText("this is lall").setSmallIcon(R.mipmap.ic_launcher).build();
        Notification.Builder builder = new Notification.Builder(this).setContentTitle("title").setContentText("this is lall").setSmallIcon(R.mipmap.ic_launcher);
        PendingIntent pendingIntent = PendingIntent.getActivity(this, 0, new Intent(this, MainActivity.class), 0);
//        notification.contentIntent = pendingIntent;
//        startForeground(1,notification);
        builder.setContentIntent(pendingIntent);
        startForeground(1,builder.build());

        //sleep
//        try {
//            Thread.sleep(60000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
    }

    @Override
    public IBinder onBind(Intent intent) {
        return myAidlService;
    }

    class MyBinder extends Binder {
        public void startDownload() {
            Log.d("test", "downloading");
        }
    }
}
