package com.example.trabalho1;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView lista = (ListView) findViewById(R.id.Lista);

        //add opções na Lista
        ArrayList<String> telas = new ArrayList<String>();
        telas.add("Teste Toast");
        telas.add("Teste AlertDialog");


        //Encaixa as opções no Layout
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1 , telas);
        lista.setAdapter(arrayAdapter);


        //Pegar a posição da ListView

        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                if(position == 0){
                    Intent tela2Intent = new Intent(getBaseContext(), Tela2.class);
                    //toast
                    Toast.makeText(getApplicationContext(),
                            "Indo para a Tela 2 ", Toast.LENGTH_LONG).show();
                        //vai pra tela 2
                            startActivity(tela2Intent);
                }
                if(position == 1){
                    //cria o AlertDialog
                    CaixaDeDialogo();
                }
            }
        });

    }

    private void CaixaDeDialogo() {

        final Intent tela3Intent = new Intent(getBaseContext(), Tela3.class);

        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Próxima Tela");
        builder.setMessage("Você está indo pra tela 3");
        builder.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface arg0, int arg1) {
                //Vai pra tela 3
                startActivity(tela3Intent);

            }
        }).show();

    }
}
