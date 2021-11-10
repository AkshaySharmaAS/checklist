package com.example.lntapp;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Charak_IT extends AppCompatActivity {
    ListView listView;
ArrayList<String> arrayList;
//ArrayAdapter<String> arrayAdapter;
    private SimpleDateFormat dateFormat;
    private String Date1;
    FirebaseDatabase database;
    DatabaseReference reference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        /*requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);*/
        setContentView(R.layout.activity_charak__i_t);
        dateFormat=new SimpleDateFormat("EEE, MMM d, ''yy");
        Date1= DateFormat.getDateInstance().format(new Date());
        listView=(ListView)findViewById(R.id.charaklist_it);
        Button b1,b2;
        String x="Charak"+" "+Date1;
         reference=database.getInstance("https://lntapp1-default-rtdb.firebaseio.com").getReference(x).child("Checklist");
        arrayList=new ArrayList<>();
        ArrayAdapter<String>arrayAdapter=new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,arrayList);

        //listView.setAdapter(arrayAdapter);
        b1=(Button)findViewById(R.id.OK_ch);
        b2=(Button)findViewById(R.id.rem_ch);
        reference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                for(DataSnapshot dataSnapshot1:snapshot.getChildren()){
                    arrayList.add(" "+dataSnapshot1.getValue());
                    listView.setAdapter(arrayAdapter);
                    arrayAdapter.notifyDataSetChanged();
                }


            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                Toast.makeText(Charak_IT.this,"Error",Toast.LENGTH_SHORT).show();

            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                reference.child("Checklist").setValue("Approved By IT Admin");
                listView.setAdapter(arrayAdapter);
                arrayAdapter.notifyDataSetChanged();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                reference.child("Checklist").removeValue();
                listView.setAdapter(arrayAdapter);
                arrayAdapter.notifyDataSetChanged();
            }
        });


    }

}