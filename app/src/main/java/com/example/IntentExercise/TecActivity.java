package com.example.IntentExercise;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.IntentExercise.R;

public class TecActivity extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tec);
        ImageButton volver = findViewById(R.id.imgVolver);
        volver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        String stringMigasDePan = getIntent().getStringExtra("Migas") + " > " +  this.getClass().getSimpleName() ;
        TextView txtMigasDePan = findViewById(R.id.textView);
        txtMigasDePan.setText(stringMigasDePan);
    }

}


