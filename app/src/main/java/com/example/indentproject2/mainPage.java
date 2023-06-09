package com.example.indentproject2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class mainPage extends AppCompatActivity {

    TextView Correo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_page);

        Correo = findViewById(R.id.textCorreo);

        Intent intent = getIntent();

        String mostrar = intent.getStringExtra("keyword");

        Correo.setText(mostrar);
    }
}