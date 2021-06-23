package com.example.pm2ejercicio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn1 = (Button) findViewById(R.id.boton1);
        Button btn2 = (Button) findViewById(R.id.boton2);
        Button btn3 = (Button) findViewById(R.id.boton3);
        Button btn4 = (Button) findViewById(R.id.boton4);
        EditText num1 = (EditText) findViewById(R.id.txtnum1);
        EditText num2 = (EditText) findViewById(R.id.txtnum2);

        Intent pantalla = new Intent(getApplicationContext(),SecondActivity.class);

        btn1.setOnClickListener(

                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        int n1 = Integer.parseInt(num1.getText().toString());
                        int n2 = Integer.parseInt(num2.getText().toString());

                        int s = n1+n2;

                        pantalla.putExtra( "resultado",s);

                        startActivity(pantalla);


                    }
                }

        );
        btn2.setOnClickListener(

                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        int n1 = Integer.parseInt(num1.getText().toString());
                        int n2 = Integer.parseInt(num2.getText().toString());

                        int s = n1-n2;

                        pantalla.putExtra( "resultado",s);
                        startActivity(pantalla);


                    }
                }

        );
        btn3.setOnClickListener(

                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        int n1 = Integer.parseInt(num1.getText().toString());
                        int n2 = Integer.parseInt(num2.getText().toString());

                        int s = n1/n2;

                        pantalla.putExtra( "resultado",s);
                        startActivity(pantalla);


                    }
                }

        );
        btn4.setOnClickListener(

                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        int n1 = Integer.parseInt(num1.getText().toString());
                        int n2 = Integer.parseInt(num2.getText().toString());

                        int s = n1*n2;

                        pantalla.putExtra( "resultado",+s);
                        startActivity(pantalla);


                    }
                }

        );

    }
}