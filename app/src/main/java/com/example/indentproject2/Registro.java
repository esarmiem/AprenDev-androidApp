package com.example.indentproject2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class Registro extends AppCompatActivity {
    Button button;
    EditText nombre;
    EditText apellido;
    EditText correo;
    EditText contrasena;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

    }
}