package com.example.trabalho1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;


public class Tela3 extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela3);

        }

        public void proxima(View view){

            Intent intent = new Intent(this, Tela4.class);
            Bundle cores = new Bundle();

        //Pega as informações do CheckBox

            CheckBox azul = (CheckBox) findViewById(R.id.azul);
            CheckBox verde = (CheckBox) findViewById(R.id.verde);
            CheckBox vermelho = (CheckBox) findViewById(R.id.vermelho);

            String texto = "você selecionou:";

                //Verifica as checkBoxs e adiciona no texto

                if (azul.isChecked()) {
                texto += "Azul ";
            }
                if (verde.isChecked()) {
                texto += "Verde ";
            }
                if (vermelho.isChecked()) {
                texto += "Vermelho";
            }

                //coloca no Bundle
            cores.putString("texto1", texto);
            intent.putExtras(cores);

                //próxima tela
            startActivity(intent);
        }
    }