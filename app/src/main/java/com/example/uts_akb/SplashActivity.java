package com.example.uts_akb;

import android.app.Activity;
import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;

import com.wang.avi.AVLoadingIndicatorView;

public class SplashActivity extends Activity {
    //22 Mei 2019 - Riffal Utama - 10116652 - AKB-13//
    private LinearLayout lv_loading;
    private AVLoadingIndicatorView avi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        lv_loading = (LinearLayout) findViewById(R.id.lv_loading);
        avi = (AVLoadingIndicatorView) findViewById(R.id.avi);
        avi.setIndicator("BallClipRotateMultipleIndicator");

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(SplashActivity.this, MainActivity.class);
                startActivity(i);
                finish();
            }
        },5000);
    }
}
