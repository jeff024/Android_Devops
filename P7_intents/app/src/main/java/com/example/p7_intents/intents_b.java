package com.example.p7_intents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class intents_b extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intents_b);


        Bundle A_data = getIntent().getExtras();
        if (A_data == null) {
            TextView text = (TextView) findViewById(R.id.textView2);
            text.setText("@string/b_value");
            return;
        }
        String in = A_data.getString("intents_A message");
        final TextView text = findViewById(R.id.textView2);
        if (in.equals("")) {
            in = "Intents_B";
        }
        text.setText(in);

    }

    public void onclick(View view) {
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }
}
