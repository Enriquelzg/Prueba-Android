package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;


public class Cambio extends AppCompatActivity {

    private TextView llegatexto, llegaApellido;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cambio);

        llegatexto = findViewById(R.id.textorecogido);
        llegaApellido = findViewById(R.id.apellidoRecogido);

        Intent intent = getIntent();
        llegatexto.setText(intent.getStringExtra("Texto intent"));
        llegaApellido.setText(intent.getStringExtra("Texto apellido"));
    }
}

