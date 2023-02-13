package com.skiturbo.naivecore;

import android.app.Service;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.IBinder;
import android.widget.TextView;
import android.widget.Toast;

import rikka.shizuku.Shizuku;

public class shizukuPermit extends Service {
    public shizukuPermit() {
    }

    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }
    @Override
    public void onCreate() {
        super.onCreate();
//        if (Shizuku.checkSelfPermission() != PackageManager.PERMISSION_GRANTED)
//            Shizuku.requestPermission(0);
        try{
            if (Shizuku.checkSelfPermission() != PackageManager.PERMISSION_GRANTED)
                Shizuku.requestPermission(0);
        } catch (Exception e) {
            if (e.getClass() == IllegalStateException.class)
                Toast.makeText(this, "shizuku NOT pass", Toast.LENGTH_SHORT).show();
        }
    }
}