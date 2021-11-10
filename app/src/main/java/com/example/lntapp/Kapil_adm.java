package com.example.lntapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
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

public class Kapil_adm extends AppCompatActivity {
    ListView listView;
    ArrayList<String> arrayList;
    ArrayAdapter<String> arrayAdapter;
    private SimpleDateFormat dateFormat;
    private String Date1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kapil_adm);
        dateFormat=new SimpleDateFormat("EEE, MMM d, ''yy");
        Date1= DateFormat.getDateInstance().format(new Date());
        listView=findViewById(R.id.kapil_list_adm);
        arrayList=new ArrayList<>();
        String x="Kapil"+ " "+ Date1;
        arrayAdapter=new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,arrayList);
        DatabaseReference reference= FirebaseDatabase.getInstance("https://lntapp1-default-rtdb.firebaseio.com").getReference(x).child("Checklist");
        listView.setAdapter(arrayAdapter);
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
                Toast.makeText(Kapil_adm.this,"Error",Toast.LENGTH_SHORT).show();

            }
        });
    }
}