package com.skiturbo.naivecore;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

import java.io.IOException;

public class NaiveProxy extends Service {
    Runtime runtime = Runtime.getRuntime();
    public NaiveProxy() {
    }
    private String LOCAL = "/data/data/com.skiturbo.naivecore/lib/libnaive.so";
    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }

    @Override
    public void onCreate(){
        super.onCreate();
        try {
            Process runNaiveCore = runtime.exec(LOCAL);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}