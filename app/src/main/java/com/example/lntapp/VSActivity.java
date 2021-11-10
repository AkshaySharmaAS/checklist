package com.example.lntapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class VSActivity extends AppCompatActivity {
    Button submit1;
    CheckBox c1, c2, c3,c4,c5,c6,c7,c8,c9,c10,c11,c12,c13;
    FirebaseDatabase database;
    DatabaseReference reference,r1;
    Member member;
    int i= 0;
    private SimpleDateFormat dateFormat;
    private String Date1;
    private EditText text1,text2,text3,text4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_v_s);
        dateFormat=new SimpleDateFormat("EEE, MMM d, ''yy");
        Date1= DateFormat.getDateInstance().format(new Date());
        String x="Vishwakarma"+ " "+ Date1;
        reference = database.getInstance("https://lntapp1-default-rtdb.firebaseio.com").getReference().child(x);
        r1=FirebaseDatabase.getInstance("https://lntapp1-default-rtdb.firebaseio.com").getReference().child(x).child("Checklist");
        member= new Member();
        submit1= findViewById(R.id.vs_save);
        c1 = findViewById(R.id.dd_vs);
        c2 = findViewById(R.id.psn_vs);
        c3 = findViewById(R.id.pp_vs);
        c4 = findViewById(R.id.cw_vs);
        c5 = findViewById(R.id.md_vs);
        c6 = findViewById(R.id.wb_vs);
        c7 = findViewById(R.id.as_vs);
        c8 = findViewById(R.id.cm_vs);
        c9 = findViewById(R.id.sn_vs);
        c10 = findViewById(R.id.ps_vs);
        c11 = findViewById(R.id.pcr_vs);
        c12 = findViewById(R.id.sw_vs);
        c13 = findViewById(R.id.ac_vs);
        String d1="Y";
        String d2="N";
        text1=findViewById(R.id.name_vs);
        text2=findViewById(R.id.remarks_vs);
        text3=findViewById(R.id.name_vs1);
        text4=findViewById(R.id.remarks_vs1);
        Button b2= findViewById(R.id.vs_ac);
        reference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                if(dataSnapshot.exists()){

                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
        submit1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(c1.isChecked()){
                    member.setDoorDisplay("Door Display: "+d1);
                    reference.child("Checklist").setValue(member);
                } else{
                    member.setDoorDisplay("Door Display: "+d2);
                    reference.child("Checklist").setValue(member);
                }
                if(c2.isChecked()){
                    member.setProgramSchedule("Program Schedule, Course Content, Do's & Dont's: "+d1);
                    reference.child("Checklist").setValue(member);
                }else{

                    member.setProgramSchedule("Program Schedule, Course Content, Do's and Dont's: "+d2);
                    reference.child("Checklist").setValue(member);
                }
                if(c3.isChecked()){
                    member.setPenPad("Pen and Pad: "+d1);
                    reference.child("Checklist").setValue(member);
                }else{
                    member.setPenPad("Pen and Pad: "+d2);
                    reference.child("Checklist").setValue(member);
                }
                if(c4.isChecked()){
                    member.setCleanWhiteBoard("Cleanliness of White Board: "+d1);
                    reference.child("Checklist").setValue(member);
                }else{
                    member.setCleanWhiteBoard("Cleanliness of White Board: "+d2);
                    reference.child("Checklist").setValue(member);}
                if(c5.isChecked()){
                    member.setMarker("Markers: "+d1);
                    reference.child("Checklist").setValue(member);
                }else{
                    member.setMarker("Markers: "+d2);
                    reference.child("Checklist").setValue(member);
                }
                if(c6.isChecked()){
                    member.setWaterBottle("Water bottle and Glass: "+d1);
                    reference.child("Checklist").setValue(member);
                }else{
                    member.setWaterBottle("Water bottle and Glass: "+d2);
                    reference.child("Checklist").setValue(member);
                }
                if(c7.isChecked()){
                    member.setSpeaker("Audio Speakers: "+d1);
                    reference.child("Checklist").setValue(member);
                }else{
                    member.setSpeaker("Audio Speakers: "+d2);
                    reference.child("Checklist").setValue(member);
                }
                if(c8.isChecked()){
                    member.setCollarMic("Collar Mic: "+d1);
                    reference.child("Checklist").setValue(member);
                }else{
                    member.setCollarMic("Collar Mic: "+d2);
                    reference.child("Checklist").setValue(member);
                }
                if(c9.isChecked()){
                    member.setSlideNavigator("Slide Navigator: "+d1);
                    reference.child("Checklist").setValue(member);
                }else{
                    member.setSlideNavigator("Slide Navigator: "+d2);
                    reference.child("Checklist").setValue(member);
                }
                if(c10.isChecked()){
                    member.setProjector("Projector & Screen: "+d1);
                    reference.child("Checklist").setValue(member);
                }else{
                    member.setProjector("Projector & Screen: "+d2);
                    reference.child("Checklist").setValue(member);
                }
                if(c11.isChecked()){
                    member.setPCReady("PC Readyness: "+d1);
                    reference.child("Checklist").setValue(member);
                }else{
                    member.setPCReady("PC Readyness: "+d2);
                    reference.child("Checklist").setValue(member);
                }
                if(c12.isChecked()){
                    member.setSWReady("SW Readyness: "+d1);
                    reference.child("Checklist").setValue(member);
                }else{
                    member.setSWReady("SW Readyness: "+d2);
                    reference.child("Checklist").setValue(member);
                }
                if(c13.isChecked()){
                    member.setACLightClock("AC,Lights,Clock: "+d1);
                    reference.child("Checklist").setValue(member);
                }else{
                    member.setACLightClock("AC,Lights,Clock: "+d2);
                    reference.child("Checklist").setValue(member);
                }

                c1.setEnabled(false);c2.setEnabled(false);c3.setEnabled(false);c4.setEnabled(false);c5.setEnabled(false);c6.setEnabled(false);
                c7.setEnabled(false);c8.setEnabled(false);c9.setEnabled(false);c10.setEnabled(false);c11.setEnabled(false);c12.setEnabled(false);
                c13.setEnabled(false);
                String t1=text1.getText().toString();
                String t2=text2.getText().toString();
                member.setY("Name: "+t1);
                reference.child("Checklist").setValue(member);
                member.setZ("Remarks: "+t2);
                reference.child("Checklist").setValue(member);
                String t3=text3.getText().toString();
                String t4=text4.getText().toString();
                member.setYa("Name: "+t3);
                reference.child("Checklist").setValue(member);
                member.setZa("Remarks: "+t4);
                reference.child("Checklist").setValue(member);

            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                r1.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot snapshot) {
                        if(snapshot.exists()){
                            String y1=snapshot.child("doorDisplay").getValue().toString();
                            String y2=snapshot.child("programSchedule").getValue().toString();
                            String y3=snapshot.child("penPad").getValue().toString();
                            String y4=snapshot.child("cleanWhiteBoard").getValue().toString();
                            String y5=snapshot.child("marker").getValue().toString();
                            String y6=snapshot.child("waterBottle").getValue().toString();
                            String y7=snapshot.child("speaker").getValue().toString();
                            String y8=snapshot.child("collarMic").getValue().toString();
                            String y9=snapshot.child("slideNavigator").getValue().toString();
                            String y10=snapshot.child("projector").getValue().toString();
                            String y11=snapshot.child("pcready").getValue().toString();
                            String y12=snapshot.child("swready").getValue().toString();
                            String y13=snapshot.child("aclightClock").getValue().toString();
                            String y14=snapshot.child("y").getValue().toString();
                            String z=snapshot.child("z").getValue().toString();
                            if(y1.equals("Door Display: Y")){
                                c1.setChecked(true);
                            }
                            if(y2.equals("Program Schedule, Course Content, Do's & Dont's: Y")){
                                c2.setChecked(true);
                            }
                            if(y3.equals("Pen and Pad: Y")){
                                c3.setChecked(true);
                            }
                            if(y4.equals("Cleanliness of White Board: Y")){
                                c4.setChecked(true);
                            }
                            if(y5.equals("Markers: Y")){
                                c5.setChecked(true);
                            }
                            if(y6.equals("Water bottle and Glass: Y")){
                                c6.setChecked(true);
                            }
                            if(y7.equals("Audio Speakers: Y")){
                                c7.setChecked(true);
                            }
                            if(y8.equals("Collar Mic: Y")){
                                c8.setChecked(true);
                            }
                            if(y9.equals("Slide Navigator: Y")){
                                c9.setChecked(true);
                            }
                            if(y10.equals("Projector & Screen: Y")){
                                c10.setChecked(true);
                            }
                            if(y11.equals("PC Readyness: Y")){
                                c11.setChecked(true);
                            }
                            if(y12.equals("SW Readyness: Y")){
                                c12.setChecked(true);
                            }
                            if(y13.equals("AC,Lights,Clock: Y")){
                                c13.setChecked(true);
                            }
                            text1.setText(y14);
                            text1.setEnabled(false);
                            text2.setText(z);
                            text2.setEnabled(false);

                        }

                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError error) {

                    }
                });

            }
        });
    }
}