package com.example.poeticalworks;

import android.content.Intent;
import android.widget.LinearLayout;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void displayPoem1(View v){
        int id = v.getId();
        LinearLayout layout = (LinearLayout)v.findViewById(id);
        String tag = (String)layout.getTag();

        Intent it = new Intent(this, Poem.class);
        it.putExtra("it_tag", tag);
        startActivity(it);
    }
}