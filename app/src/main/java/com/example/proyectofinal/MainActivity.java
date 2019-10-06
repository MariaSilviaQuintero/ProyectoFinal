package com.example.proyectofinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button ingresar;
    EditText email;
    EditText password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ingresar = (Button)findViewById(R.id.button);
        email = findViewById(R.id.editText);
        password = findViewById(R.id.editText3);

        ingresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(email.getText().toString().equals("") || password.getText().toString().equals("")){
                    Toast.makeText(getApplicationContext(), "Debe Ingresar Usuario y Contraseña", Toast.LENGTH_LONG).show();
                }
              else{ if (email.getText().toString().equals("admin") && password.getText().toString().equals("admin")) {
                    Intent ingresar = new Intent(MainActivity.this, MenuActivity.class);
                    startActivity(ingresar);
                } else {
                    Toast.makeText(getApplicationContext(), "Usuario o Contraseña incorrectos", Toast.LENGTH_LONG).show();
                }

            }}
        });
    }
}
