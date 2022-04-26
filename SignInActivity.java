package com.example.bookkart;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.example.bookkart.databinding.ActivitySignInBinding;
import com.example.bookkart.databinding.ActivitySignUpBinding;

public class SignInActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivitySignInBinding binding = ActivitySignInBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.signInButton.setOnClickListener(v -> {
            startActivity(new Intent(this, AdminActivity.class));
            finish();
        });
        binding.goToSignUp.setOnClickListener(v -> {
            startActivity(new Intent(this, SignUpActivity.class));
            finish();
        });
    }
}