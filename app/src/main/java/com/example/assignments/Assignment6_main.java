package com.example.assignments;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Assignment6_main extends AppCompatActivity {

    EditText etName, etEmail, etPassword;
    Button btnRegister, btnLogin, btnRegistered;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_assignment6_main);

        etName = findViewById(R.id.etName);
        etEmail = findViewById(R.id.etEmail);
        etPassword = findViewById(R.id.etPassword);

        btnLogin = findViewById(R.id.btnLogin);
        btnRegister = findViewById(R.id.btnRegister);
        btnRegistered = findViewById(R.id.btnRegistered);

        SharedPreferences sp;

        sp = getSharedPreferences("data",0);

        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = etName.getText().toString();
                String email = etEmail.getText().toString();
                String password = etPassword.getText().toString();
                int userCount = sp.getInt("userCount", 0);

                sp.edit()
                        .putString("name"+userCount,name)
                        .putString("email"+userCount, email)
                        .putString("password"+userCount, password)
                        .putInt("userCount", userCount+1)
                        .apply();

                Toast.makeText(Assignment6_main.this, "Registration Successful", Toast.LENGTH_SHORT).show();

            }
        });

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Assignment6_main.this, Assignment6_login.class);
                startActivity(intent);
            }
        });

        btnRegistered.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Assignment6_main.this, Assignment6_registered.class);
                startActivity(intent);
            }
        });

    }
}