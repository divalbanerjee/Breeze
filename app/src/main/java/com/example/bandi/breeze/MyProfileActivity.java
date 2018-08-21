package com.example.bandi.breeze;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.example.bandi.breeze.objects.breezeUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;


public class MyProfileActivity extends AppCompatActivity {

    private breezeUser myUser;
    private String userID;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_profile);


    }

    private void loadUser(String userID){

        FirebaseDatabase database;
        database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference("message");
        breezeUser newUser;
        boolean successful;

        myRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                myUser = dataSnapshot.getValue(breezeUser.class);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
                Toast.makeText(MyProfileActivity.this, "Authentication failed.", Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void setUserID(String ID){
        userID = ID;
    }

}
