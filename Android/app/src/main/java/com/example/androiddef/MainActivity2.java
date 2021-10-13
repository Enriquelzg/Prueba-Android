package com.example.androiddef;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class MainActivity2 extends AppCompatActivity {

    private TextView llegatexto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        llegatexto = findViewById(R.id.llegatexto);
    }
    public void recoger (View view){
        Intent intent = getIntent();
        llegatexto.setText(intent.getStringExtra("Texto intent"));
    }

}