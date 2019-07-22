package com.example.trabalho1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;


public class Tela3 extends AppCompatActivity {


    CheckBox azul = (CheckBox) findViewById(R.id.azul);
    CheckBox verde = (CheckBox) findViewById(R.id.verde);
    CheckBox vermelho = (CheckBox) findViewById(R.id.vermelho);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela3);



        }

        public void proxima(View view){
            String texto = "você selecionou:";

            if (azul.isChecked()) {
                texto += "Azul ";
            }
            if (verde.isChecked()) {
                texto += "Verde ";
            }
            if (vermelho.isChecked()) {
                texto += "Vermelho";
            }
        }
    }