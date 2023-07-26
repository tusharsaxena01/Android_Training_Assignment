package com.example.assignments;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Assignments_main extends AppCompatActivity {

    Button btnAssignment2, btnAssignment3,btnAssignment4,btnAssignment5,btnAssignment6,btnAssignment7,btnAssignment8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_assignments_main);

        btnAssignment2 = findViewById(R.id.btn_Assignment2);

        btnAssignment2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Assignments_main.this, Assignment2_main.class);
                startActivity(intent);
            }
        });

        btnAssignment3 = findViewById(R.id.btn_Assignment3);

        btnAssignment3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Assignments_main.this, Assignment3_main.class);
                startActivity(intent);
            }
        });
        btnAssignment4 = findViewById(R.id.btn_Assignment4);

        btnAssignment4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Assignments_main.this, Assignment4_main.class);
                startActivity(intent);
            }
        });
        btnAssignment5 = findViewById(R.id.btn_Assignment5);

        btnAssignment5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Assignments_main.this, Assignment5_main.class);
                startActivity(intent);
            }
        });

        btnAssignment6 = findViewById(R.id.btn_Assignment6);

        btnAssignment6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Assignments_main.this, Assignment6_main.class);
                startActivity(intent);
            }
        });

        btnAssignment7 = findViewById(R.id.btn_Assignment7);

        btnAssignment7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Assignments_main.this, Assignment7_main.class);
                startActivity(intent);
            }
        });


        btnAssignment8 = findViewById(R.id.btn_Assignment8);

        btnAssignment8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Assignments_main.this, Assignment8_main.class);
                startActivity(intent);
            }
        });


    }
}