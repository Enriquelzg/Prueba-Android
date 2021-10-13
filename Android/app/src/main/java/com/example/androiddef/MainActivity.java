package com.example.androiddef;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.text.BreakIterator;

public class MainActivity extends AppCompatActivity {

    private TextView texto;
    private TextView boton;
    private EditText editText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        texto = findViewById(R.id.texto_hito);
        boton = findViewById(R.id.texto_hito);

    }
    public void pasar (View view){
        Intent intent = new Intent(this, MainActivity2.class);
        startActivity(intent);
        intent.putExtra("Intent text", editText.getText().toString());
    }


}

