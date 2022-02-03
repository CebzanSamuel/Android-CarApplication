package com.example.caraplication;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toolbar;

import com.google.firebase.auth.FirebaseAuth;

public class OptActivity extends AppCompatActivity {



    private TextView logOut;
    private TextView Text1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_opt);


        logOut = findViewById(R.id.logout);
        Text1=findViewById(R.id.edit_meu);


        logOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FirebaseAuth.getInstance().signOut();
                startActivity(new Intent(OptActivity.this, MainActivity.class).setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK));
                finish();
            }
        });

        Text1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //go to edit profile
                startActivity(new Intent(OptActivity.this, EditProfileActivity.class).setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK));
                finish();
            }
        });


    }

    private void setSupportActionBar(Toolbar toolbar) {
    }
}