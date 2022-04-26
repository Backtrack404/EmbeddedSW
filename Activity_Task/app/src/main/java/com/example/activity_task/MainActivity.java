package com.example.activity_task;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        onClickButtonListner();
    }

    private void onClickButtonListner() {
        Button button_sbm = (Button) findViewById(R.id.button);
        button_sbm.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent("com.example.activity_task.secondActivity");
                startActivity(myIntent);
            }
        });
    }
}