package com.example.echannelling_new;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button button20;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button20 = (Button) findViewById(R.id.button20);
        button20.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openLogin();
            }

        });
    }
    private void openLogin() {
        Intent intent = new Intent (this, LoginActivity.class);
        startActivity(intent);
    }
}