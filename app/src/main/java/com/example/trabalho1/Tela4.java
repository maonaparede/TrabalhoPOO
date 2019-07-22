package com.example.trabalho1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Tela4 extends AppCompatActivity {

    TextView saida = (TextView) findViewById(R.id.saida);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela4);

        Bundle dados = new Bundle();
        dados = getIntent().getExtras();
        String texto = dados.getString("texto1");

        saida.setText(texto);
    }
}
