package com.example.uiloginsignup;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class LoginUserActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.loginuser);


        Button btnBack = findViewById(R.id.button3);


        btnBack.setOnClickListener(v -> {
            Intent intent = new Intent(LoginUserActivity.this, MainActivity.class);
            startActivity(intent);
            finish();
        });
    }
}
