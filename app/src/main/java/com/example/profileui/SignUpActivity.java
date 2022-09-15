package com.example.profileui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class SignUpActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        TextView backtoSignIn = (TextView) findViewById(R.id.backtoSignIn);
        backtoSignIn.setOnClickListener(v -> {
            finish();
        });
    }
}