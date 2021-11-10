package com.example.lntapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Vs_IT extends AppCompatActivity {
    ListView listView;
    ArrayList<String> arrayList;
    ArrayAdapter<String> arrayAdapter;
    private SimpleDateFormat dateFormat;
    private String Date1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vs__i_t);
        dateFormat=new SimpleDateFormat("EEE, MMM d, ''yy");
        Date1= DateFormat.getDateInstance().format(new Date());
        listView=findViewById(R.id.vishwakarma_list_it);
        Button b1,b2;
        arrayList=new ArrayList<>();
        String x="Vishwakarma"+ " "+ Date1;
        arrayAdapter=new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,arrayList);
        DatabaseReference reference= FirebaseDatabase.getInstance("https://lntapp1-default-rtdb.firebaseio.com").getReference(x).child("Checklist");
        listView.setAdapter(arrayAdapter);
        b1=(Button)findViewById(R.id.OK_vs);
        b2=(Button)findViewById(R.id.rem_vs);
        reference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                for(DataSnapshot dataSnapshot1:snapshot.getChildren()) {
                    arrayList.add( "  " + dataSnapshot1.getValue());
                    listView.setAdapter(arrayAdapter);
                    arrayAdapter.notifyDataSetChanged();
                }

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                Toast.makeText(Vs_IT.this,"Error",Toast.LENGTH_SHORT).show();

            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                reference.child("Checklist").setValue("Approved By IT Admin");
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                reference.child("Checklist").removeValue();
            }
        });
    }
}