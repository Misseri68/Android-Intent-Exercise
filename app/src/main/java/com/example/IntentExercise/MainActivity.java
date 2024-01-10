package com.example.IntentExercise;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.IntentExercise.R;


public class MainActivity extends AppCompatActivity {

    EditText textoNombre;

    EditText textoContraseña;

    String nombreClase =  this.getClass().getSimpleName();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textoNombre = findViewById(R.id.etNombre);
        textoContraseña = findViewById(R.id.contrasena);

        Button btnAceptar= findViewById (R.id.btnAceptar);
        btnAceptar.setOnClickListener(v -> {
            if (textoNombre.getText().toString().equals("FEDERICO") && textoContraseña.getText().toString().equals("alumno@")){

                Intent intent = new Intent(MainActivity.this, SecActivity.class);
                intent.putExtra( "Nombre",textoNombre.getText().toString());
                intent.putExtra("Migas",  nombreClase);
                startActivity(intent);
            }
            else{
                Toast.makeText(MainActivity.this, "Usuario o contraseña erróneos", Toast.LENGTH_LONG).show();
            }
        });

    }



}