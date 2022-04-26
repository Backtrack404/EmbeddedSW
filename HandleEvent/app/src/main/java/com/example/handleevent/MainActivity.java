package com.example.handleevent;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import static android.view.View.*;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        View vw = new View(this);
        vw.setOnTouchListener(TouchListener);
        setContentView(vw);
    }

    public class TouchListenerClass implements OnTouchListener {
        public boolean onTouch(View v, MotionEvent event){
            if(event.getAction() == MotionEvent.ACTION_DOWN){
                Toast.makeText(MainActivity.this, "Touch Event Received", Toast.LENGTH_SHORT).show();

                return true;
            }
            return false;
        }
    }
    TouchListenerClass TouchListener = new TouchListenerClass();
}