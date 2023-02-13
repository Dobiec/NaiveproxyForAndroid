package com.skiturbo.naivecore;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.net.URL;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button gainShizukuPermit;
    private Button naiveStart;

    private Uri uri = Uri.parse("https://github.com/klzgrad/naiveproxy/releases/latest");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gainShizukuPermit = (Button) findViewById(R.id.button2);
        gainShizukuPermit.setOnClickListener(this);
        naiveStart = (Button) findViewById(R.id.button3);
        naiveStart.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.button2:
                Intent startIntent = new Intent(this,shizukuPermit.class);
                startService(startIntent);
                break;
            case R.id.button3:
                Intent naive = new Intent(this,NaiveCore.class);
                startService(naive);
                break;
            case R.id.textView:
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
        }
    }
}