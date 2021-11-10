package com.example.lntapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class ITAdmActivity extends AppCompatActivity {
    private Button c1,s1,b1,ch1,bh1,k1,vi1,va1,bc1,a1,br1,ka1,m1,p1,n1,vs1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_i_t_adm);

        c1=findViewById(R.id.charak_it);
        s1=findViewById(R.id.sushrut_it);
        b1=findViewById(R.id.bharadwaj_it);
        ch1=findViewById(R.id.chaturanga_it);
        bh1=findViewById(R.id.bhaskaracharya_it);
        k1=findViewById(R.id.kanad_it);
        vi1=findViewById(R.id.vishnugupta_it);
        va1=findViewById(R.id.varahimihir_it);
        bc1=findViewById(R.id.browcen_it);
        a1=findViewById(R.id.aryabhatt_it);
        br1=findViewById(R.id.brahmagupta_it);
        ka1=findViewById(R.id.kapil_it);
        m1=findViewById(R.id.mahavira_it);
        p1=findViewById(R.id.panini_it);
        n1=findViewById(R.id.nagarjuna_it);
        vs1=findViewById(R.id.vishwkarma_it);

        c1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1=new Intent(ITAdmActivity.this,Charak_IT.class);
                startActivity(i1);
            }
        });
        s1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1=new Intent(ITAdmActivity.this,Sushrut_IT.class);
                startActivity(i1);
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1=new Intent(ITAdmActivity.this,Bharadwaj_IT.class);
                startActivity(i1);
            }
        });
        ch1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1=new Intent(ITAdmActivity.this,Chaturanga_IT.class);
                startActivity(i1);
            }
        });
        bh1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1=new Intent(ITAdmActivity.this,Bhaskaracharya_IT.class);
                startActivity(i1);
            }
        });
        k1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1=new Intent(ITAdmActivity.this,Kanad_IT.class);
                startActivity(i1);
            }
        });
        vi1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1=new Intent(ITAdmActivity.this,Vi_IT.class);
                startActivity(i1);
            }
        });
        va1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1=new Intent(ITAdmActivity.this,Va_IT.class);
                startActivity(i1);
            }
        });
        bc1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1=new Intent(ITAdmActivity.this,BC_IT.class);
                startActivity(i1);
            }
        });
        a1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1=new Intent(ITAdmActivity.this,Ar_IT.class);
                startActivity(i1);
            }
        });
        br1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1=new Intent(ITAdmActivity.this,Br_IT.class);
                startActivity(i1);
            }
        });
        ka1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1=new Intent(ITAdmActivity.this,Kap_IT.class);
                startActivity(i1);
            }
        });
        m1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1=new Intent(ITAdmActivity.this,M_IT.class);
                startActivity(i1);
            }
        });
        p1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1=new Intent(ITAdmActivity.this,P_IT.class);
                startActivity(i1);
            }
        });
        n1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1=new Intent(ITAdmActivity.this,N_IT.class);
                startActivity(i1);
            }
        });
        vs1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1=new Intent(ITAdmActivity.this,Vs_IT.class);
                startActivity(i1);
            }
        });


    }
}