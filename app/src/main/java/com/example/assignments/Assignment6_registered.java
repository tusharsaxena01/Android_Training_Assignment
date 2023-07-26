package com.example.assignments;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class Assignment6_registered extends AppCompatActivity {

    ListView lvRegistered;
    SharedPreferences sp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_assignment6_registered);

        lvRegistered=findViewById(R.id.lvRegistered);
        sp = getSharedPreferences("data", 0);

        ArrayList<Users> users = new ArrayList<Users>();
        int userCount = sp.getInt("userCount", 0);
        for(int i=0;i<=userCount;i++){
            String name = sp.getString("name"+i, "");
            String email = sp.getString("email"+i, "");
            String password = sp.getString("password"+i, "");
            Users user = new Users(name, email, password);

            users.add(user);

        }

        UsersAdapter adapter = new UsersAdapter(this, R.layout.users_layout, users);

        Log.e("Check", users.get(1).name+ " "+ users.get(1).email+ " "+ users.get(1).password);

        lvRegistered.setAdapter(adapter);

        lvRegistered.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Users user = users.get(position);
                sp.edit()
                        .remove(user.name)
                        .remove(user.email)
                        .remove(user.password)
                        .apply();
                Toast.makeText(Assignment6_registered.this, "Deleted "+user.name, Toast.LENGTH_SHORT).show();
            }
        });


    }
}