package com.example.trabalho1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class Tela2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela2);

        //Radio Groups

         RadioGroup verOpcao = (RadioGroup) findViewById(R.id.radioGroup2);

        //verifica se for clickado

        verOpcao.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup grupo, int posicao) {
                RadioButton button = (RadioButton) grupo.findViewById(posicao);
                String texto = button.getText().toString();
                Toast.makeText(getApplicationContext(),
                        "Você selecionou: "+ texto, Toast.LENGTH_LONG).show();
            }
        });

    }

        //Pega o Campo de texto e manda pra outra tela

    public void proxima(View view){

        EditText texto2 = (EditText) findViewById(R.id.editText);

        Intent intent = new Intent(this, Tela4.class);
        Bundle textinho = new Bundle();
        String texto = texto2.getText().toString();

        textinho.putString("texto2", texto);
        intent.putExtras(textinho);

            //Proxima Tela
        startActivity(intent);
    }
}
