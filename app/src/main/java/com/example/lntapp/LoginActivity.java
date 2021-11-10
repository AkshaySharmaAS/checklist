package com.example.lntapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    private ImageButton bn1,bn2,bn3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_SECURE, WindowManager.LayoutParams.FLAG_SECURE);
        setContentView(R.layout.activity_login);
        getSupportActionBar().hide();
        bn1=findViewById(R.id.es);
        bn2=findViewById(R.id.ita);
        bn3=findViewById(R.id.adm);
        bn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i= new Intent(LoginActivity.this,ESLogin.class);
                Toast.makeText(LoginActivity.this,"Electrician or Supervisor Log in",Toast.LENGTH_SHORT);
                startActivity(i);
            }
        });
        bn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1= new Intent(LoginActivity.this,ITActivity.class);
                Toast.makeText(LoginActivity.this,"IT Admin Log in",Toast.LENGTH_SHORT);
                startActivity(i1);
            }

        });
        bn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i2= new Intent(LoginActivity.this,AdminActivity.class);
                Toast.makeText(LoginActivity.this,"Admin Log in",Toast.LENGTH_SHORT).show();
                startActivity(i2);
            }
        });

    }
}