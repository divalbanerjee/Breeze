package com.example.bandi.breeze;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class RegisterWelcomeActivity extends AppCompatActivity {

    Button btnToProfile;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_welcome);

        btnToProfile = (Button) findViewById(R.id.btnToProfile);
        final Intent intent = new Intent(this, MyProfileActivity.class);
        btnToProfile.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                startActivity(intent);
            }
        });
    }
}
