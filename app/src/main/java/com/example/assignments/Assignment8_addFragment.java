package com.example.assignments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.assignments.databinding.Assignment8AddFragmentLayoutBinding;

public class Assignment8_addFragment extends Fragment {

    Assignment8AddFragmentLayoutBinding binding;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        binding = Assignment8AddFragmentLayoutBinding.inflate(inflater, container, false);

        binding.btnCal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num1 = Integer.parseInt(binding.etNum1.getText().toString());
                int num2 = Integer.parseInt(binding.etNum2.getText().toString());

                int result = num1 + num2;

                binding.tvResult.setText("Result: "+result);
            }
        });

        return binding.getRoot();
    }
}
