package com.example.myapplication;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView texto,nom,apell,num;
    private Button boton;
    private EditText apellidos,numero,nombre;
    private TinyDB tinyDB;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        texto = findViewById(R.id.texto_hito);
        boton = findViewById(R.id.boton_hito);

        EditText apellidos = findViewById(R.id.apellido);
        EditText numero = findViewById(R.id.Numero);
        EditText nombre = findViewById(R.id.nombre);
        TextView nom = findViewById(R.id.nom);
        TextView apell = findViewById(R.id.apell);
        TextView num = findViewById(R.id.num);



        tinyDB = new TinyDB(this);
        Usuario anterior = tinyDB.getObject("lastUser", Usuario.class);
        try {
            nom.setText(anterior.getNombre());
            apell.setText(anterior.getApellidos());
            num.setText(anterior.getNumero());
        }
        catch (Exception e){
            e.printStackTrace();
        }

        boton.setOnClickListener(new View.OnClickListener() {
            public void onClick (View v) {
                Usuario primero = new Usuario(nombre.getText().toString(),apellidos.getText().toString(),numero.getText().toString());
                Intent intent = new Intent(MainActivity.this, Cambio.class);
                intent.putExtra("texto usuario", primero);
                tinyDB.putObject("lastUser",primero);
                startActivity(intent);
            }
        });

    }
}