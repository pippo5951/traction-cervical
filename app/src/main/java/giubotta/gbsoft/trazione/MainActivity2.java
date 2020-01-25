package giubotta.gbsoft.trazione;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.media.AudioManager;
import android.media.ToneGenerator;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    private ProgressDialog progressDialog;
    private MainActivity2.MessageHandler messageHandler;
    private int MINUTI = 1020, sec_i=0,switch_min=1,ore_i=0,sec_d=60,min_d=16,ore_d=0, min_i;
    private String msg="";
    private TextView Incremento,CountDown,Step,Parziale, txt_dati;
    private Button bt_annulla,bt_Start;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_trazione );



        // tiene il display accesso
        getWindow().addFlags( WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);

        Incremento = (TextView) findViewById(R.id.tv_Incremento);
        Parziale = (TextView) findViewById(R.id.tv_Parziale);
        CountDown = (TextView) findViewById(R.id.tv_CountDown);
        Step = (TextView) findViewById(R.id.tv_Step);
        bt_annulla = (Button)findViewById(R.id.bt_annulla);
        bt_Start = (Button)findViewById(R.id.bt_Start);
        txt_dati = (TextView) findViewById(R.id.txt_dati);


        progressDialog = new ProgressDialog(this);
        progressDialog.setTitle("tocca il display\nper rimuovere la finestra");
        progressDialog.setMessage("\n" + "Attendi prego...");
        progressDialog.setCancelable(true);
        messageHandler = new MainActivity2.MessageHandler();

        bt_annulla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }



    public void iniziaAllenamento(View v){
        bt_Start.setVisibility(View.GONE);
        txt_dati.setText( "Per interrompere:" );
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
        alertDialogBuilder.setMessage("\n" + "Start trazione?, (Si / No)");
        alertDialogBuilder.setPositiveButton("Si",
                new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface arg0, int arg1) {
                        msg="\n" + "Inizia Trazione";
                        StampaToast();
                        progressDialog.show();
                        Thread thread = new Thread(new MainActivity2.Timer());
                        thread.start();
                    }
                });



        alertDialogBuilder.setNegativeButton("No",
                new DialogInterface.OnClickListener() {

                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                        finish();
                        return;
                    }
                });
        AlertDialog alertDialog = alertDialogBuilder.create();
        alertDialog.show();
    }

    private class Timer implements Runnable {
        @Override
        public void run() {
            for (int i = MINUTI; i >= 0; i--){
                sec_i++;
                sec_d--;

                // incremento dopo 60 secondi
                if (i==960||i==900 ||i==840||i==780||i==720||i==660 || i==600 || i==540 || i==480
                        || i==420|| i==360|| i==300|| i==240|| i==180|| i==120|| i==60){
                    sec_i=1;
                    if (sec_i==60){sec_i=0;}
                    min_i++;
                    sec_d=60;
                    min_d--;
                }
                // inizio i 30 secondi
                if ( i == 900 || i==750 || i==600 || i==450 || i==300|| i==150){
                    InfoStep(switch_min-1 +"° Pausa di 30 secondi");
                    play_mp();
                }

                // finisco  i 30 secondi
                if (i==1020|| i==870||i==720||i==570||i==420||i==270||i==120){
                    InfoStep("Trazione di 2 minuti step:"+switch_min);
                    switch_min++;
                    play_mp();}

                if (i == 0){
                    play_mp();
                    Incremento.setText("Tempo totale: 0:17:00");
                    Parziale.setText("Tempo parziale: 00:00");
                    CountDown.setText("Tempo restante: 0:00:00");
                    InfoStep("Fine trazione");
                }

                try {
                    Thread.sleep(1000);
                }catch (Exception e){
                }

                Bundle bundle = new Bundle();
                bundle.putInt("conteggio corrente",i);
                bundle.putInt("conteggio incremento",sec_i);
                bundle.putInt("conteggio decremento",sec_d);
                Message message = new Message();
                message.setData(bundle);


                messageHandler.sendMessage(message);
            }
            progressDialog.dismiss();

        }
    }

    private class MessageHandler extends Handler {
        @SuppressLint("ResourceAsColor")
        @Override
        public  void handleMessage(Message message) {
            int conto = message.getData().getInt("conteggio corrente");// conta i secondi restanti
            int secondi_i = message.getData().getInt("conteggio incremento");// conta secondi incrementando
            int secondi_d = message.getData().getInt("conteggio decremento");
            int secondi_p = message.getData().getInt("conteggio parziale"); //conta i secondi parziali
            progressDialog.setMessage("secondi rimanenti ... "+ conto); //mostra il tempo restante sulla finestra di dialogo
            Incremento.setText("Tempo tot. crescente "+ore_i+":" + min_i +":" + secondi_i);
            CountDown.setText("Tempo tot. decrescente "+ore_d+":" + min_d +":" + secondi_d);

            Parziale.setText("Secondi rimanenti..."+ conto);

        }
    }
    private void play_mp() {
        Thread playThread = new Thread() {
            public void run()
            {
                ToneGenerator toneG = new ToneGenerator( AudioManager.STREAM_ALARM, 100);
                toneG.startTone( ToneGenerator.TONE_CDMA_ALERT_CALL_GUARD, 10000);

            }
        };

        playThread.start();
    }

    private void InfoStep(String msg) {
        Step.setText(msg);
    }
    private void StampaToast() {
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
    }
}
