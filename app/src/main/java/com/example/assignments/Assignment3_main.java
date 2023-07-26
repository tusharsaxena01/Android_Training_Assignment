package com.example.assignments;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class Assignment3_main extends AppCompatActivity {


    CheckBox cbAndroid, cbJava, cbFlutter, cbTC;

    Button btnNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_assignment3_main);

        cbAndroid = findViewById(R.id.cbAndroid);
        cbJava = findViewById(R.id.cbJava);
        cbFlutter = findViewById(R.id.cbFlutter);
        cbTC = findViewById(R.id.cbTC);
        btnNext = findViewById(R.id.btnNext);

        cbTC.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnNext.setEnabled(true);
            }
        }));

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int total=0;

                if(cbAndroid.isChecked()){
                    total+=1000;
                }
                if(cbJava.isChecked()){
                    total+=5000;
                }
                if(cbFlutter.isChecked()){
                    total+=6000;
                }

                String message = "Registration Successful, Total Amount= "+total;
                Toast.makeText(Assignment3_main.this, message, Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(Assignment3_main.this, ThankYouActivity.class);
                startActivity(intent);

            }
        });


    }
}