package com.example.assignments;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class Assignment5_main extends AppCompatActivity {

    ListView lvMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_assignment5_main);

        ArrayList<String> operations = new ArrayList<>();
        operations.add("Addition");
        operations.add("Subtraction");
        operations.add("Multiplication");
        operations.add("Division");
        operations.add("Modulus");

        lvMain = findViewById(R.id.lvMain);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1,
                operations);

        lvMain.setAdapter(adapter);

        Intent intent = new Intent(Assignment5_main.this, Assignment5_operation.class);

        lvMain.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                intent.putExtra("operation", operations.get(position));
                Toast.makeText(Assignment5_main.this, "Opening "+operations.get(position), Toast.LENGTH_SHORT).show();
                startActivity(intent);
            }
        });
    }
}