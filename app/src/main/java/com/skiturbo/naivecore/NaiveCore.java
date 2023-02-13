package com.skiturbo.naivecore;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

import java.io.IOException;
import java.io.OutputStream;

import rikka.shizuku.Shizuku;

public class NaiveCore extends Service {
    public NaiveCore() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }
    public void onCreate() {
        super.onCreate();
        Process p = Shizuku.newProcess(new String[]{"sh"}, null,null);
        OutputStream out = p.getOutputStream();
        try {
            out.write(("cp /storage/emulated/0/Download/naiveproxy/naive /data/local/tmp/naiveproxy;" +
                    "cp /storage/emulated/0/Download/naiveproxy/config.json /data/local/tmp/;" +
                    "chmod 0755 /data/local/tmp/naiveproxy;" +
                    "/data/local/tmp/naiveproxy /data/local/tmp/config.json" +"\n").getBytes());
            out.flush();
            out.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            out.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            out.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}