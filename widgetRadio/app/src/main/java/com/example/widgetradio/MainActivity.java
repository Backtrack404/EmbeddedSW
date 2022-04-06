package com.example.widgetradio;

import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private static RadioGroup radioGroup;
    private static RadioButton radioButton;
    private static Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        onClickListenerButton();
    }

    private void onClickListenerButton() {
        radioGroup = (RadioGroup) findViewById(R.id.animals);
        button = (Button) findViewById(R.id.button);

        button.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick(View view) {
                        int seleted_id = radioGroup.getCheckedRadioButtonId();
                        radioButton = (RadioButton) findViewById(seleted_id);
                        Toast.makeText(MainActivity.this, radioButton.getText(),Toast.LENGTH_SHORT).show();
                    }
                }
        );
    }
}