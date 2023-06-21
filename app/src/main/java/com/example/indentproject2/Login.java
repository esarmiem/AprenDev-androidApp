package com.example.indentproject2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    EditText usuario;
    EditText contrasena;
    Button btnLogin;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login2);

        EditText usuario = findViewById(R.id.usuario);
        usuario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                usuario.setHint("");
            }
        });

        EditText contrasena = findViewById(R.id.contrasena);
        contrasena.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                contrasena.setHint("");
            }
        });

        btnLogin = findViewById(R.id.btnLogin);


        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String usuario1 = usuario.getText().toString();
                String contrasena1 = contrasena.getText().toString();
                String usuarioDB = "pepito@mail.com";
                String contrasenaDB = "xyz123";

                iniciarSesion(usuario1,contrasena1, usuarioDB,contrasenaDB);

            }
        });
    }

    public void iniciarSesion(String usuario, String contrasena, String usuarioDB, String contrasenaDB){

        if (usuario.equals(usuarioDB) && contrasena.equals(contrasenaDB)){

            Intent intent = new Intent(Login.this, mainPage.class);

            intent.putExtra("keyword", usuario);

            startActivity(intent);

            Toast.makeText(Login.this, "Has Iniciado sesión", Toast.LENGTH_SHORT).show();

        }else{

            System.out.println("Valide sus credenciales");

            Toast.makeText(this, "Validar credenciales", Toast.LENGTH_SHORT).show();
        }

    }
}
