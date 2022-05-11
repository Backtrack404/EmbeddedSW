package com.example.callmyfriend;

import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Build;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ResourceCursorTreeAdapter;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void call(View v){
        int id = v.getId();
        LinearLayout layout = (LinearLayout) v.findViewById(id);
        String tag = (String) layout.getTag();

        Resources res = getResources();

        int id_tel = res.getIdentifier("tel"+tag, "string", getPackageName());

        String tel = res.getString(id_tel);

        Uri number = Uri.parse("tel:"+tel);

        Intent intent = new Intent(Intent.ACTION_DIAL, number);
        startActivity(intent);
    }
}