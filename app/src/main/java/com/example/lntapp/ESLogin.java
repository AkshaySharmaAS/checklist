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

public class ESLogin extends AppCompatActivity {
    private EditText es_un;
    private EditText es_pw;
    private Button eslogin;
    String username_1="ES";
    String password_1="es12345";
    int i=1,j=1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_SECURE, WindowManager.LayoutParams.FLAG_SECURE);
        setContentView(R.layout.activity_e_s_login);
        es_un=findViewById(R.id.es_u);
        es_pw=findViewById(R.id.es_p);
        eslogin=findViewById(R.id.es_l);
        //Button reg = findViewById(R.id.rba);

        eslogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (TextUtils.isEmpty(es_un.getText().toString()) || TextUtils.isEmpty(es_un.getText().toString()))
                    Toast.makeText(ESLogin.this, "Fields Can't be Empty", Toast.LENGTH_SHORT).show();
                else if (es_un.getText().toString().equals(username_1)) {
                    if (es_pw.getText().toString().equals(password_1)) {
                        Toast.makeText(ESLogin.this, "Log in Successful", Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(ESLogin.this, ESAct.class);
                        startActivity(intent);
                        es_un.setText("");
                        es_pw.setText("");
                    } else {
                        Toast.makeText(ESLogin.this, "Check Password", Toast.LENGTH_SHORT).show();
                        i++;
                    }

                } else {
                    Toast.makeText(ESLogin.this, "Check  Username and Password", Toast.LENGTH_SHORT).show();
                    j++;

                }
                if(i==7||j==7){
                    Intent i1=new Intent(ESLogin.this,LoginActivity.class);
                    startActivity(i1);
                    Toast.makeText(ESLogin.this,"Max attempts is 5",Toast.LENGTH_SHORT).show();
                }

            }
        });
    }


}