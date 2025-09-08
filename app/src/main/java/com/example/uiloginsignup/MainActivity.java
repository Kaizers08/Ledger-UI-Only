package com.example.uiloginsignup;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {



     //view
     TextView email, password;

     //pass
     Button forgotpass, createnew, login;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // hanapinyungLoginbutn
        Button btnLogin = findViewById(R.id.btnLogin);

        // kapagnaclick,pupuntasaLoginUserActivity
        btnLogin.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, LoginUserActivity.class);
            startActivity(intent);
        });

        //for text
        email = findViewById(R.id.editTextTextEmailAddress5);
        password = findViewById(R.id.editTextTextPassword3);


        //btns
        forgotpass = findViewById(R.id.forgetpasscode);
        login = findViewById(R.id.button2);

    }
}
