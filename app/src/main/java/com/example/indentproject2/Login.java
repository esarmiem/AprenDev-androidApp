package com.example.indentproject2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Login extends AppCompatActivity {

    EditText usuario;
    EditText contrasena;
    Button btnLogin;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login2);

        usuario = findViewById(R.id.usuario);
        contrasena = findViewById(R.id.contrasena);
        btnLogin = findViewById(R.id.btnLogin);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String nombreUsuario = usuario.getText().toString();

                Intent intent = new Intent(Login.this, mainPage.class);
                intent.putExtra("keyword", nombreUsuario);
                startActivity(intent);
            }
        });
    }
}