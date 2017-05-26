package com.example.g40_70.agricularcom;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import java.util.Timer;
import java.util.TimerTask;

public class SpalshScreamActivity extends AppCompatActivity {

    private long SPLASH_DELAY = 3000; //3 segundos
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_HIDE_NAVIGATION); // Oculta la barra de navegación
        setContentView(R.layout.activity_spalsh__scream_);
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                Intent mainIntent = new Intent(getApplicationContext(),
                        MenuAccesoDirectoActivity.class);
                startActivity(mainIntent);
                finish();
            }
        };
        Timer timer = new Timer();
        timer.schedule(task, SPLASH_DELAY);

    }
}