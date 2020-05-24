package com.example.p9_sendboardcast;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendBroadcast(View view) {
        Intent i = new Intent();
        i.setAction("com.example.p9_sendboardcast");
        // i.addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
        i.addFlags(Intent.FLAG_INCLUDE_STOPPED_PACKAGES);
        i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        sendBroadcast(i);
        i.start
    }
}
