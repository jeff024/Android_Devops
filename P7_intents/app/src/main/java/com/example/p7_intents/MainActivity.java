package com.example.p7_intents;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.content.Intent;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onclick(View view) {
        Intent i = new Intent(this, intents_b.class);

        final EditText in = (EditText) findViewById(R.id.editText);
        String input = in.getText().toString();
        if (input == null) {
            input = "Intents_B";
        }
        i.putExtra("intents_A message", input);

        startActivity(i);
    }
}
