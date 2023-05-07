package com.example.evidencemanagement.dept;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.evidencemanagement.R;
import com.example.evidencemanagement.databinding.ActivityDepartmentDashboardBinding;

public class DepartmentDashboard extends AppCompatActivity {

    private ActivityDepartmentDashboardBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityDepartmentDashboardBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

    }
}