package com.example.assignments;

import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class UsersAdapter extends ArrayAdapter<Users> {
    Context context;
    int resource;
    List<Users> objects;
    public UsersAdapter(@NonNull Context context, int resource, @NonNull List<Users> objects) {
        super(context, resource, objects);

        this.context = context;
        this.resource = resource;
        this.objects = objects;

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View view = LayoutInflater.from(context).inflate(resource, null, false);

        TextView tvName;
        TextView tvEmail;
        TextView tvPassword;

        tvName = view.findViewById(R.id.tvName);
        tvEmail = view.findViewById(R.id.tvEmail);
        tvPassword = view.findViewById(R.id.tvPassword);

        Users user = objects.get(position);

        tvName.setText(user.name);
        tvEmail.setText(user.email);
        tvPassword.setText(user.password);

        return view;
    }

    @Override
    public int getCount() {
        return objects.size();
    }
}
