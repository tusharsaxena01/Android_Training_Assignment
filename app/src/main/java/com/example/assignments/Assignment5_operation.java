package com.example.assignments;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Assignment5_operation extends AppCompatActivity {

    TextView tvOperationHeader, tvResult;
    EditText et_num1, et_num2;
    Button btn_operation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_assignment5_operation);

        tvOperationHeader = findViewById(R.id.tvOperationHeader);
        tvResult = findViewById(R.id.tv_Output);

        et_num1 = findViewById(R.id.et_num1);
        et_num2 = findViewById(R.id.et_num2);

        btn_operation = findViewById(R.id.btnOperation);

        Intent in = getIntent();

        String operation = in.getStringExtra("operation");

        tvOperationHeader.setText(operation);

        btn_operation.setText(operation);

        btn_operation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int num1 = Integer.parseInt(et_num1.getText().toString());
                int num2 = Integer.parseInt(et_num2.getText().toString());
                int result=0;
                if(operation.equals("Addition")){
                    result=num1+num2;
                }
                if(operation.equals("Subtraction")){
                    result=num1-num2;
                }
                if(operation.equals("Multiplication")){
                    result=num1*num2;
                }
                if(operation.equals("Division")){
                    result=num1/num2;
                }
                if(operation.equals("Modulus")){
                    result=num1%num2;
                }

                tvResult.setText("Result: "+result);
            }
        });

    }
}