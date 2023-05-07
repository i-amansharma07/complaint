package com.example.evidencemanagement.user;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.evidencemanagement.R;
import com.example.evidencemanagement.databinding.ActivityUserDashboardBinding;

public class UserDashboard extends AppCompatActivity {

    private ActivityUserDashboardBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityUserDashboardBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());







    }
}