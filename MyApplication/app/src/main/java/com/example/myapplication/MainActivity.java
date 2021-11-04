package com.example.myapplication;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView texto;
    private Button boton;
    private EditText textoCambio,apellidos,numero;
    private TinyDB tinyDB;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        texto = findViewById(R.id.texto_hito);
        boton = findViewById(R.id.boton_hito);
        EditText textoCambio = findViewById(R.id.change);
        EditText apellidos = findViewById(R.id.apellido);
        EditText numero = findViewById(R.id.Numero);




        boton.setOnClickListener(new View.OnClickListener() {
            public void onClick (View v) {
                Usuario primero = new Usuario(nombre.getText);
                Intent intent = new Intent(MainActivity.this, Cambio.class);
                intent.putExtra("Texto intent", textoCambio.getText().toString());
                startActivity(intent);
            }
        });

    }
}