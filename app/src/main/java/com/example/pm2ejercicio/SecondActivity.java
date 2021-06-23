package com.example.pm2ejercicio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        EditText ope = (EditText) findViewById(R.id.txtoperaciones);

        Intent pantalla = getIntent();
        Bundle extras = pantalla.getExtras();

        int result = (int) extras.get("resultado");
        ope.setText(""+result);



    }
}