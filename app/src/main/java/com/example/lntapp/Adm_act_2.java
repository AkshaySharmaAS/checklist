package com.example.lntapp;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


public class Adm_act_2 extends AppCompatActivity {
    private Button c1,s1,b1,ch1,bh1,k1,vi1,va1,bc1,a1,br1,ka1,m1,p1,n1,vs1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adm_act_2);
        c1=findViewById(R.id.charak_a);
        s1=findViewById(R.id.sushrut_a);
        b1=findViewById(R.id.bharadwaj_a);
        ch1=findViewById(R.id.chaturanga_a);
        bh1=findViewById(R.id.bhaskaracharya_a);
        k1=findViewById(R.id.kanad_a);
        vi1=findViewById(R.id.vishnugupta_a);
        va1=findViewById(R.id.varahimihir_a);
        bc1=findViewById(R.id.browcen_a);
        a1=findViewById(R.id.aryabhatt_a);
        br1=findViewById(R.id.brahmagupta_a);
        ka1=findViewById(R.id.kapil_a);
        m1=findViewById(R.id.mahavira_a);
        p1=findViewById(R.id.panini_a);
        n1=findViewById(R.id.nagarjuna_a);
        vs1=findViewById(R.id.vishwkarma_a);

        c1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1=new Intent(Adm_act_2.this,Charak_adm.class);
                startActivity(i1);
            }
        });
        s1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1=new Intent(Adm_act_2.this,Sushrut_adm.class);
                startActivity(i1);
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1=new Intent(Adm_act_2.this,Bharadwaj_adm.class);
                startActivity(i1);
            }
        });
        ch1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1=new Intent(Adm_act_2.this,Chaturanga_adm.class);
                startActivity(i1);
            }
        });
        bh1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1=new Intent(Adm_act_2.this,Bhaskaracharya_adm.class);
                startActivity(i1);
            }
        });
        k1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1=new Intent(Adm_act_2.this,Kanad_adm.class);
                startActivity(i1);
            }
        });
        vi1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1=new Intent(Adm_act_2.this,Vi_adm.class);
                startActivity(i1);
            }
        });
        va1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1=new Intent(Adm_act_2.this,Va_adm.class);
                startActivity(i1);
            }
        });
        bc1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1=new Intent(Adm_act_2.this,BC_adm.class);
                startActivity(i1);
            }
        });
        a1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1=new Intent(Adm_act_2.this,Ar_adm.class);
                startActivity(i1);
            }
        });
        br1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1=new Intent(Adm_act_2.this,Br_adm.class);
                startActivity(i1);
            }
        });
        ka1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1=new Intent(Adm_act_2.this,Kapil_adm.class);
                startActivity(i1);
            }
        });
        m1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1=new Intent(Adm_act_2.this,M_adm.class);
                startActivity(i1);
            }
        });
        p1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1=new Intent(Adm_act_2.this,P_adm.class);
                startActivity(i1);
            }
        });
        n1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1=new Intent(Adm_act_2.this,N_adm.class);
                startActivity(i1);
            }
        });
        vs1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1=new Intent(Adm_act_2.this,Vs_adm.class);
                startActivity(i1);
            }
        });


        

    }


}
