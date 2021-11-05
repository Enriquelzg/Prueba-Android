package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;


public class Cambio extends AppCompatActivity {

    private TextView nombre, apellido, numero;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cambio);

        nombre = findViewById(R.id.nombreRecogido);
        apellido = findViewById(R.id.apellidoRecogido);
        numero = findViewById(R.id.numeroRecogido);

        Intent intent = getIntent();
        Usuario getExtra = (Usuario) intent.getSerializableExtra("texto usuario");
        nombre.setText(getExtra.getNombre());
        apellido.setText(getExtra.getApellidos());
        numero.setText(getExtra.getNumero());

    }
}

