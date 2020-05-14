package com.example.event_lisener;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


class num {
    private static int a = 0;

    public static int getA() {
        return a;
    }

    public static void setA(int a) {
        num.a = a;
    }
}

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button my_button = (Button)findViewById(R.id.butt_click);

        //int i = 0;
        my_button.setOnClickListener(

                new Button.OnClickListener() {


                    @Override
                    public void onClick(View v) {
                        num.setA(num.getA() + 1);
                        int i = num.getA();
                        TextView my_text = (TextView)findViewById(R.id.textView2);
                        my_text.setText("You have clicked " + i + " times");
                    }

                }
        );



    }
}
