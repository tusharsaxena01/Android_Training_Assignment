package com.example.assignments;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.example.assignments.databinding.ActivityAssignment8MainBinding;

public class Assignment8_main extends AppCompatActivity {

    ActivityAssignment8MainBinding binding;
    Assignment8_addFragment addFragment = new Assignment8_addFragment();
    Assignment8_subFragment subFragment = new Assignment8_subFragment();
    Assignment8_mulFragment mulFragment = new Assignment8_mulFragment();
    Assignment8_divFragment divFragment = new Assignment8_divFragment();
    Assignment8_modFragment modFragment = new Assignment8_modFragment();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityAssignment8MainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getSupportFragmentManager()
                        .beginTransaction()
                        .remove(subFragment)
                        .remove(mulFragment)
                        .remove(divFragment)
                        .remove(modFragment)
                        .add(R.id.fragMain, addFragment)
                        .commit();
            }
        });
        binding.btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getSupportFragmentManager()
                        .beginTransaction()
                        .remove(addFragment)
                        .remove(mulFragment)
                        .remove(divFragment)
                        .remove(modFragment)
                        .add(R.id.fragMain, subFragment)
                        .commit();
            }
        });
        binding.btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getSupportFragmentManager()
                        .beginTransaction()
                        .remove(addFragment)
                        .remove(subFragment)
                        .remove(divFragment)
                        .remove(modFragment)
                        .add(R.id.fragMain, mulFragment)
                        .commit();
            }
        });
        binding.btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getSupportFragmentManager()
                        .beginTransaction()
                        .remove(addFragment)
                        .remove(mulFragment)
                        .remove(subFragment)
                        .remove(modFragment)
                        .add(R.id.fragMain, divFragment)
                        .commit();
            }
        });
        binding.btnMod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getSupportFragmentManager()
                        .beginTransaction()
                        .remove(addFragment)
                        .remove(mulFragment)
                        .remove(divFragment)
                        .remove(subFragment)
                        .add(R.id.fragMain, modFragment)
                        .commit();
            }
        });

    }
}