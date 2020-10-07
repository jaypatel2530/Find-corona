package com.example.findcorona;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainScreen extends AppCompatActivity {
private Button button1;
    private Button button2;
    private Button button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainscreen);
        button1=findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openViewPatients();
            }
        });
        button2=findViewById(R.id.button2);
       button2.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               openAddPatients();
           }
       });
        button3=findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openViewCases();
            }
        });
    }

    public void openViewPatients(){
        Intent intent = new Intent(this,MapsActivity.class);
        startActivity(intent);
    }

    public void openAddPatients(){
        Intent intent = new Intent(this, AddPatients.class);
        startActivity(intent);
    }

    public void openViewCases(){
        Intent intent = new Intent(this,ViewCases.class);
        startActivity(intent);
    }
}
