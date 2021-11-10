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

public class ITActivity extends AppCompatActivity {
    private EditText it_un;
    private EditText it_pw;
    private Button itlogin;
    String username_1="ITADMIN";
    String password_1="itadmin123";
    int i=1,j=1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_SECURE, WindowManager.LayoutParams.FLAG_SECURE);
        setContentView(R.layout.activity_i_t);
        it_un=findViewById(R.id.ita_u);
        it_pw=findViewById(R.id.ita_p);
        itlogin=findViewById(R.id.ita_l);
                itlogin.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if (TextUtils.isEmpty(it_un.getText().toString()) || TextUtils.isEmpty(it_un.getText().toString()))
                            Toast.makeText(ITActivity.this, "Fields Can't be Empty", Toast.LENGTH_SHORT).show();
                        else if (it_un.getText().toString().equals(username_1)) {
                            if (it_pw.getText().toString().equals(password_1)) {
                                Toast.makeText(ITActivity.this, "Log in Successful", Toast.LENGTH_SHORT).show();
                                Intent intent = new Intent(ITActivity.this, ITAdmActivity.class);
                                startActivity(intent);
                            } else {
                                Toast.makeText(ITActivity.this, "Check Password", Toast.LENGTH_SHORT).show();
                                i++;
                            }

                        } else {
                            Toast.makeText(ITActivity.this, "Check  Username and Password", Toast.LENGTH_SHORT).show();
                            j++;

                        }
                        if(i==7||j==7){
                            Toast.makeText(ITActivity.this,"Max attempts is 5",Toast.LENGTH_SHORT).show();
                            Intent i1=new Intent(ITActivity.this,LoginActivity.class);
                            startActivity(i1);
                        }
                    }
                });
            }

    }

