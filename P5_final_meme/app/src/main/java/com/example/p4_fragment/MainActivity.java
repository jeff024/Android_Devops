package com.example.p4_fragment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements top_frag.toplisener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void create_meme(String top, String bottom) {
        bot_frag bott = (bot_frag) getSupportFragmentManager().findFragmentById(R.id.fragment2);
        bott.setmeme(top, bottom);
    }
}
