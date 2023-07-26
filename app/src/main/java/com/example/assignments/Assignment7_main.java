package com.example.assignments;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.assignments.databinding.ActivityAssignment7MainBinding;
import com.example.assignments.databinding.DialogAssignment7Binding;

public class Assignment7_main extends AppCompatActivity {

    ActivityAssignment7MainBinding binding;
    AlertDialog dialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityAssignment7MainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showInput("+");
            }
        });
        binding.btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showInput("-");
            }
        });
        binding.btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showInput("*");
            }
        });
        binding.btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showInput("/");
            }
        });
        binding.btnMod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showInput("%");
            }
        });
    }

    void showInput(String operation){

        DialogAssignment7Binding inputDialog = DialogAssignment7Binding.inflate(getLayoutInflater());

        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setView(inputDialog.getRoot());

        dialog = builder.create();
        dialog.show();

        inputDialog.ivCloseBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });

        inputDialog.btnCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int num1 = Integer.parseInt(inputDialog.etNum1.getText().toString());
                int num2 = Integer.parseInt(inputDialog.etNum2.getText().toString());

                int result=0;
                switch(operation){
                    case "+":
                        result = num1+num2;
                        break;
                    case "-":
                        result = num1-num2;
                        break;
                    case "*":
                        result = num1*num2;
                        break;
                    case "/":
                        result = num1/num2;
                        break;
                    case "%":
                        result = num1%num2;
                        break;
                }

                Toast.makeText(Assignment7_main.this, "Result: "+result, Toast.LENGTH_LONG).show();

                dialog.dismiss();

            }
        });

    }

}