package com.example.assignments;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Assignment6_login extends AppCompatActivity {

    EditText etEmail, etPassword;
    Button btnRegister, btnLogin;

    SharedPreferences sp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_assignment6_login);


        etEmail = findViewById(R.id.etEmail);
        etPassword = findViewById(R.id.etPassword);

        btnLogin = findViewById(R.id.btnLogin);
        btnRegister = findViewById(R.id.btnRegister);

        sp = getSharedPreferences("data", 0);


        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Assignment6_login.this, Assignment6_main.class);
                startActivity(intent);
            }
        });

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String inputEmail = etEmail.getText().toString();
                String inputPassword = etPassword.getText().toString();

                int userCount = sp.getInt("userCount", 0);
                for(int i=0;i<=userCount;i++) {
                    String registeredName = sp.getString("name" + i, "");
                    String registeredEmail = sp.getString("email" + i, "");
                    String registeredPassword = sp.getString("password" + i, "");

                    if (inputEmail.equals(registeredEmail) && inputPassword.equals(registeredPassword)) {
                        Toast.makeText(Assignment6_login.this, "Login Successful", Toast.LENGTH_SHORT).show();
                        Toast.makeText(Assignment6_login.this, "Welcome " + registeredName, Toast.LENGTH_SHORT).show();
                        break;
                    } else {
                        if(i==userCount) {
                            Toast.makeText(Assignment6_login.this, "Invalid Details", Toast.LENGTH_SHORT).show();
                            break;
                        }
                    }
                }

            }
        });

    }
}