package com.example.widgetcheckbox;

import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import java.util.zip.CheckedOutputStream;

public class MainActivity extends AppCompatActivity {

    private CheckBox checkBoxDog, checkBoxCat, checkBoxCow;
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addListenerOnButton();
        addListenerToCheckBox();
    }

    private void addListenerToCheckBox() {

        checkBoxDog = (CheckBox)findViewById(R.id.checkBoxDog);
        checkBoxDog.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if(((CheckBox)view).isChecked()) {
                            Toast.makeText(MainActivity.this, "Dog is selected", Toast.LENGTH_SHORT).show();
                        } else {
                            Toast.makeText(MainActivity.this, "Dog is unselected", Toast.LENGTH_SHORT).show();
                        }
                    }
                }
        );

        checkBoxCat = (CheckBox)findViewById(R.id.checkBoxCat);
        checkBoxCat.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if(((CheckBox)view).isChecked()) {
                            Toast.makeText(MainActivity.this, "Cat is selected", Toast.LENGTH_SHORT).show();
                        } else {
                            Toast.makeText(MainActivity.this, "Cat is unselected", Toast.LENGTH_SHORT).show();
                        }
                    }
                }
        );

        checkBoxCow = (CheckBox) findViewById(R.id.checkBoxCow);
        checkBoxCow.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if(((CheckBox)view).isChecked()){
                            Toast.makeText(MainActivity.this, "Cow is selected", Toast.LENGTH_SHORT).show();
                        } else {
                            Toast.makeText(MainActivity.this, "Cow is unselected", Toast.LENGTH_SHORT).show();
                        }
                    }
                }
        );
    }

    private void addListenerOnButton() {
        checkBoxDog = (CheckBox) findViewById(R.id.checkBoxDog);
        checkBoxCat = (CheckBox) findViewById(R.id.checkBoxCat);
        checkBoxCow = (CheckBox) findViewById(R.id.checkBoxCow);
        button = (Button) findViewById(R.id.button);

        button.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick(View view) {
                        StringBuffer result = new StringBuffer();
                        result.append(" Dog: ").append(checkBoxDog.isChecked());
                        result.append(" Cat: ").append(checkBoxCat.isChecked());
                        result.append(" Cow: ").append(checkBoxCow.isChecked());

                        Toast.makeText(MainActivity.this, result.toString(), Toast.LENGTH_SHORT).show();
                    }
                }
        );
    }
}