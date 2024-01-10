package com.example.IntentExercise;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.IntentExercise.R;

public class SecActivity extends AppCompatActivity{
    String nombreClase =  this.getClass().getSimpleName();
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_sec);

            String stringUsuario = getString(R.string.Bienvenida) + getIntent().getStringExtra("Nombre");
            TextView txtUsuario = findViewById(R.id.textView2);
            txtUsuario.setText(stringUsuario);
            
            String stringMigasDePan = getIntent().getStringExtra("Migas") + " > " + nombreClase;
            TextView txtMigasDePan = findViewById(R.id.textView);
            txtMigasDePan.setText(stringMigasDePan);

            Button botonSiguiente = findViewById(R.id.btSiguiente);
            botonSiguiente.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent2 = new Intent(SecActivity.this, TecActivity.class);
                    intent2.putExtra("Migas", stringMigasDePan + nombreClase);
                    startActivity(intent2);
                }

            });

            ImageButton volver = findViewById(R.id.imgVolver);
            volver.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    finish();
                }
            });

        }

    }


