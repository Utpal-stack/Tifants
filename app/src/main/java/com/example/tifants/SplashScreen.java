package com.example.tifants;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.WindowManager;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        getSupportActionBar().hide();
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);

        Thread td = new Thread(){

            public void run(){
                try {
                    sleep(3200);
                }
                catch (Exception ex){
                    ex.printStackTrace();
                }
                finally {
                    Intent intent = new Intent(SplashScreen.this, loginActivity.class);
                    startActivity(intent);
                    finish();
                }
            }
        };
        td.start();
    }
}