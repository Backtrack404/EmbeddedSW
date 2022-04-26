package com.example.text1;

import android.content.res.Resources;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("시 목록1");
    }
    public void displayPoem1(View view) {
        int displayPoem1ID;
        Resources res = getResources();
        displayPoem1ID = view.getId();
        LinearLayout layout = (LinearLayout) view.findViewById(displayPoem1ID);
        String tag = (String) layout.getTag();

        int id_title = res.getIdentifier("title01", "string", getPackageName());
        String title = res.getString(id_title);

        int id_author = res.getIdentifier("author01", "string", getPackageName());
        String author = res.getString(id_author);

        int id_body = res.getIdentifier("body01", "string", getPackageName());
        String body = res.getString(id_body);

        String msg = title + "/" + author + "\n" + body;
        Toast.makeText(this, msg, Toast.LENGTH_LONG).show();
    }

    public void displayPoem2(View view){
        int displayPoem2ID;
        Resources res = getResources();
        displayPoem2ID = view.getId();
        LinearLayout layout = (LinearLayout) view.findViewById(displayPoem2ID);
        String tag = (String) layout.getTag();

        int id_title = res.getIdentifier("title02", "string", getPackageName());
        String title = res.getString(id_title);

        int id_author = res.getIdentifier("author02", "string", getPackageName());
        String author = res.getString(id_author);

        int id_body = res.getIdentifier("body02", "string", getPackageName());
        String body = res.getString(id_body);

        String msg = title + "/" + author + "\n" + body;
        Toast.makeText(this, msg, Toast.LENGTH_LONG).show();
    }
}