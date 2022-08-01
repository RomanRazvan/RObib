package com.example.robib;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.storage.FirebaseStorage;

import java.util.ArrayList;
import java.util.List;

public class RetriveDataInRecycleView extends AppCompatActivity {

    FirebaseDatabase mDatabase;
    DatabaseReference mRef;
    FirebaseStorage mStorage;
    RecyclerView recyclerView;
    PersoanaAdapter persoanaAdapter;
    List<PersoanaModel> persoanaMdlList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_retrive_data_in_recycle_view);

        mDatabase=FirebaseDatabase.getInstance();
        mRef=mDatabase.getReference().child("Persoana");
        mStorage= FirebaseStorage.getInstance();
        recyclerView=findViewById(R.id.recyclerview_id);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        persoanaMdlList=new ArrayList<PersoanaModel>();
        persoanaAdapter=new PersoanaAdapter(RetriveDataInRecycleView.this,persoanaMdlList);
        recyclerView.setAdapter(persoanaAdapter);

        mRef.addChildEventListener(new ChildEventListener() {
            @Override
            public void onChildAdded(@NonNull DataSnapshot dataSnapshot, @Nullable String s) {
                PersoanaModel persoanaModel=dataSnapshot.getValue(PersoanaModel.class);
                persoanaMdlList.add(persoanaModel);
                persoanaAdapter.notifyDataSetChanged();
            }

            @Override
            public void onChildChanged(@NonNull DataSnapshot datasnapshot, @Nullable String s) {

            }

            @Override
            public void onChildRemoved(@NonNull DataSnapshot dataSnapshot) {

            }

            @Override
            public void onChildMoved(@NonNull DataSnapshot dataSnapshot, @Nullable String s) {

            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
    }
}