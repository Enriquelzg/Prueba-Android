package com.example.androiddef;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.BreakIterator;

public class MainActivity extends AppCompatActivity {

    private TextView texto;
    private Button boton;
    private EditText textoCambio;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        texto = findViewById(R.id.texto_hito);
        boton = findViewById(R.id.boton_hito);

    }
    public void pasar (View view){
        Intent intent = new Intent(this, MainActivity2.class);
        intent.putExtra("Texto intent", textoCambio.getText().toString());
        startActivity(intent);
    }


}

