package com.example.a40_18078281_nguyenhuuthang;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;

import androidx.annotation.Nullable;

public class MyService extends Service {
    private MyBinder mBinder = new MyBinder();
    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return mBinder;
    }

    public class MyBinder extends Binder {
        MyService getService(){
            return  MyService.this;
        }
    }
    public Double TinhTong (double a, double b, double c, double d) {
        return  a+b+c+d;
    }
}
