package com.example.trabalho1;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v4.app.NotificationCompat;
import android.support.v4.app.NotificationManagerCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Tela4 extends AppCompatActivity {



    public static final String nomeCanal = "canal";
    public static final String idCanal = "001";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);




        setContentView(R.layout.activity_tela4);

        TextView saida = (TextView) findViewById(R.id.saida);
        TextView saida1 = (TextView) findViewById(R.id.saida1);

        Bundle camposPreenchidos;
        camposPreenchidos = getIntent().getExtras();

        String texto = camposPreenchidos.getString("texto1");
        String texto2 = camposPreenchidos.getString("texto2");

        saida.setText(texto);
        saida1.setText(texto2);
    }

    public void proxima(View view){

        Intent intent2 = new Intent(this, MainActivity.class);

        //Verifica a versão API>26, e cria o canal
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.O) {
            NotificationChannel canal = new NotificationChannel(nomeCanal,
                    idCanal, NotificationManager.IMPORTANCE_DEFAULT);

            NotificationManager notificationManager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
            notificationManager.createNotificationChannel(canal);
        }

        //Cria a notificação
        NotificationCompat.Builder builder = new NotificationCompat.Builder(this, idCanal)
                .setSmallIcon( R.drawable.like )
                .setContentTitle( "Trabalho Finalizado" )
                .setContentText( "; )" )
                .setPriority(NotificationCompat.PRIORITY_DEFAULT);

        NotificationManager notifyManager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
        notifyManager.notify( 11, builder.build());


        startActivity(intent2);

    }

}
