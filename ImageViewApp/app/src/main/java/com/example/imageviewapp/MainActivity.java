package com.example.imageviewapp;

import android.media.Image;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.constraintlayout.utils.widget.ImageFilterView;

public class MainActivity extends AppCompatActivity {
    private static ImageView imgView;
    private static Button buttonSbm;

    private SeekBar seekBar;
    private TextView textView;
    private int current_image_index;

    int[] images = {R.drawable.and_image1, R.drawable.and_image2, R.mipmap.ic_launcher};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonClick();
    }

    public void buttonClick(){
        imgView = (ImageView) findViewById(R.id.imageView);

        buttonSbm = (Button) findViewById(R.id.button);

        buttonSbm.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        current_image_index++;
                        current_image_index = current_image_index % images.length;
                        imgView.setImageResource(images[current_image_index]);
                    }
                }
        );
    }
}