package com.example.alertdialog;

import android.content.DialogInterface;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private static Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        onButtonClickListener();
    }

    private void onButtonClickListener() {
        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick(View view) {
                        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
//                        builder.setCancelable(false); // (false)배경 터치 또는 뒤로가기로 창을 취소할 수 없음
                        builder.setMessage("Do you want to Close this APP!!!").setCancelable(false).setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int which) {
                                finish();
                            }
                        }).setNegativeButton("No", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int which) {
                                dialogInterface.cancel();
                            }
                        });
                        AlertDialog alert = builder.create();
                        alert.setTitle("Alert!!!");
                        alert.show();
                    }
                }
        );
    }
}