package com.example.gesture;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GestureDetectorCompat;

import android.os.Bundle;

import android.widget.TextView;
import android.view.MotionEvent;
import android.view.GestureDetector;

public class MainActivity extends AppCompatActivity implements
        GestureDetector.OnGestureListener,
        GestureDetector.OnDoubleTapListener{

    //private static final String DEBUG_TAG = "Gestures";
    private GestureDetectorCompat mDetector;

    private TextView text;
    private TextView head;

    // Called when the activity is first created.
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Instantiate the gesture detector with the
        // application context and an implementation of
        // GestureDetector.OnGestureListener
        mDetector = new GestureDetectorCompat(this,this);
        // Set the gesture detector as the double tap
        // listener.
        //mDetector.setOnDoubleTapListener(this);


        text = (TextView)findViewById(R.id.text);
        head = findViewById(R.id.head);

    }

    @Override
    public boolean onTouchEvent(MotionEvent event){
        if (this.mDetector.onTouchEvent(event)) {
            return true;
        }
        return super.onTouchEvent(event);
    }

    @Override
    public boolean onDown(MotionEvent event) {
//        Log.d(DEBUG_TAG,"onDown: " + event.toString());
        head.setText("OnDown");
        text.setText(event.toString());
        return true;
    }

    @Override
    public boolean onFling(MotionEvent event1, MotionEvent event2,
                           float velocityX, float velocityY) {
        // Log.d(DEBUG_TAG, "onFling: " + event1.toString() + event2.toString());
        head.setText("OnFling");
        text.setText(event1.toString() + event2.toString());
        return true;
    }

    @Override
    public void onLongPress(MotionEvent event) {
        // Log.d(DEBUG_TAG, "onLongPress: " + event.toString());
        head.setText("onLongPress: " );

        text.setText(event.toString());
    }

    @Override
    public boolean onScroll(MotionEvent event1, MotionEvent event2, float distanceX,
                            float distanceY) {
        //Log.d(DEBUG_TAG, "onScroll: " + event1.toString() + event2.toString());
        head.setText("onScroll: ");

        text.setText(event1.toString() + event2.toString());
        return true;
    }

    @Override
    public void onShowPress(MotionEvent event) {
        //Log.d(DEBUG_TAG, "onShowPress: " + event.toString());
        head.setText("onShowPress: ");
        text.setText(event.toString());

    }

    @Override
    public boolean onSingleTapUp(MotionEvent event) {
       // Log.d(DEBUG_TAG, "onSingleTapUp: " + event.toString());
        head.setText("onSingleTapUp: ");
        text.setText(event.toString());

        return true;
    }

    @Override
    public boolean onDoubleTap(MotionEvent event) {
        //Log.d(DEBUG_TAG, "onDoubleTap: " + event.toString());
        head.setText("onDoubleTap: ");
        text.setText(event.toString());

        return true;
    }

    @Override
    public boolean onDoubleTapEvent(MotionEvent event) {
       // Log.d(DEBUG_TAG, "onDoubleTapEvent: " + event.toString());
        head.setText("onDoubleTapEvent: ");
        text.setText(event.toString());

        return true;
    }

    @Override
    public boolean onSingleTapConfirmed(MotionEvent event) {
        //Log.d(DEBUG_TAG, "onSingleTapConfirmed: " + event.toString());
        head.setText("onSingleTapConfirmed: ");
        text.setText(event.toString());

        return true;
    }
}