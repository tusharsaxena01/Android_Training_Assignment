package com.example.assignments;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Assignment2_mod extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_assignment2_mod);
        EditText et_num1 = findViewById(R.id.et_num1);
        EditText et_num2 = findViewById(R.id.et_num2);
        TextView tv_Output = findViewById(R.id.tv_Output);
        Button btn = findViewById(R.id.btnMod);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String input1 = et_num1.getText().toString();
                String input2 = et_num2.getText().toString();
                int num1 = Integer.parseInt(input1);
                int num2 = Integer.parseInt(input2);

                int result = num1 % num2;

                tv_Output.setText("Result: "+result);

            }
        });
    }
}