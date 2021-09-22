package com.bbbond.qjs_jni;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.bbbond.qjs_jni.databinding.ActivityMainBinding;
import com.bbbond.quickjs.QuickJS;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.sampleText.setOnClickListener(view -> {
            binding.sampleText.setText(new QuickJS().version());
        });
    }
}