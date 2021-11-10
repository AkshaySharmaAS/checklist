package com.example.lntapp;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class AdminActivity extends AppCompatActivity {
    private EditText adm_un;
    private EditText adm_pw;
    private Button login;
    String username_1="ADMIN";
    String password_1="admin123";
    int i=1,j=1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_SECURE, WindowManager.LayoutParams.FLAG_SECURE);
        setContentView(R.layout.activity_admin);
        adm_un=findViewById(R.id.adm_u);
        adm_pw=findViewById(R.id.adm_p);
        login=findViewById(R.id.adm_l);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (TextUtils.isEmpty(adm_un.getText().toString()) || TextUtils.isEmpty(adm_un.getText().toString()))
                    Toast.makeText(AdminActivity.this, "Fields Can't be Empty", Toast.LENGTH_SHORT).show();
                else if (adm_un.getText().toString().equals(username_1)) {
                    if (adm_pw.getText().toString().equals(password_1)) {
                        Toast.makeText(AdminActivity.this, "Log in Successful", Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(AdminActivity.this, Adm_act_2.class);
                        startActivity(intent);
                        adm_un.setText("");
                        adm_pw.setText("");
                    } else {
                        Toast.makeText(AdminActivity.this, "Check Password", Toast.LENGTH_SHORT).show();
                        i++;
                    }

                } else {
                    Toast.makeText(AdminActivity.this, "Check  Username and Password", Toast.LENGTH_SHORT).show();
                    j++;

                }
                if(i==7||j==7){
                    Toast.makeText(AdminActivity.this,"Max attempts is 5",Toast.LENGTH_SHORT).show();
                    Intent i1=new Intent(AdminActivity.this,LoginActivity.class);
                    startActivity(i1);
                }
            }
        });
            }


    }
