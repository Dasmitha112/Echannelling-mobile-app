package com.example.echannelling_new;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Profile extends AppCompatActivity {

    private BottomNavigationView textView;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        textView = (BottomNavigationView) findViewById(R.id.textView);
        textView.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openProfile();
            }

        });

    }

    private void openProfile() {
        Intent intent = new Intent (this, profilePharmacy.class);
        startActivity(intent);
    }
}
