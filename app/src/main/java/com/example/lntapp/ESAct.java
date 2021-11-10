package com.example.lntapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class ESAct extends AppCompatActivity {
     private Button c,s,b,ch,bh,k,vi,va,bc,a,br,ka,m,p,n,vs;
     private TextView DateDisplay;
     private Calendar calendar;
    private SimpleDateFormat dateFormat;
    private String Date1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_e_s);
        DateDisplay=findViewById(R.id.date);
       
        c=findViewById(R.id.charak);
        s=findViewById(R.id.sushrut);
        b=findViewById(R.id.bharadwaj);
        ch=findViewById(R.id.chaturanga);
        bh=findViewById(R.id.bhaskaracharya);
        k=findViewById(R.id.kanad);
        vi=findViewById(R.id.vishnugupta);
        va=findViewById(R.id.varahimihir);
        bc=findViewById(R.id.browcen);
        a=findViewById(R.id.aryabhatt);
        br=findViewById(R.id.brahmagupta);
        ka=findViewById(R.id.kapil);
        m=findViewById(R.id.mahavira);
        p=findViewById(R.id.panini);
        n=findViewById(R.id.nagarjuna);
        vs=findViewById(R.id.vishwkarma);
        calendar=Calendar.getInstance();
        dateFormat=new SimpleDateFormat("EEE, MMM d, ''yy");
        Date1= DateFormat.getDateInstance().format(new Date());
        DateDisplay.setText(Date1);
        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1=new Intent(ESAct.this,CharakAct.class);
                startActivity(i1);
            }
        });
        s.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1=new Intent(ESAct.this,SushrutActivity.class);
                startActivity(i1);
            }
        });
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1=new Intent(ESAct.this,BhActivity.class);
                startActivity(i1);
            }
        });
        ch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1=new Intent(ESAct.this,ChActivity.class);
                startActivity(i1);
            }
        });
        bh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1=new Intent(ESAct.this,BhaskActivity.class);
                startActivity(i1);
            }
        });
        k.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1=new Intent(ESAct.this,KaActivity.class);
                startActivity(i1);
            }
        });
        vi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1=new Intent(ESAct.this,ViActivity.class);
                startActivity(i1);
            }
        });
        va.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1=new Intent(ESAct.this,VaActivity.class);
                startActivity(i1);
            }
        });
        bc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1=new Intent(ESAct.this,BCActivity.class);
                startActivity(i1);
            }
        });
        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1=new Intent(ESAct.this,ArActivity.class);
                startActivity(i1);
            }
        });
        br.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1=new Intent(ESAct.this,BrActivity.class);
                startActivity(i1);
            }
        });
        ka.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1=new Intent(ESAct.this,KapActivity.class);
                startActivity(i1);
            }
        });
        m.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1=new Intent(ESAct.this,MActivity.class);
                startActivity(i1);
            }
        });
        p.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1=new Intent(ESAct.this,PActivity.class);
                startActivity(i1);
            }
        });
        n.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1=new Intent(ESAct.this,NActivity.class);
                startActivity(i1);
            }
        });
        vs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1=new Intent(ESAct.this,VSActivity.class);
                startActivity(i1);
            }
        });
    }
}