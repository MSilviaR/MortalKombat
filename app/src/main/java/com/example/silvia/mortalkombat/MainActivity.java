package com.example.silvia.mortalkombat;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private Button mapa, luchadores;
    private ImageView foto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mapa = findViewById(R.id.mapa);
        luchadores = findViewById(R.id.luchadores);
        foto = findViewById(R.id.foto);
    }

    public void luchadores(View view){
        Intent ActivityLuchadores = new Intent(getApplicationContext(), com.example.silvia.mortalkombat.ActivityLuchadores.class);
        startActivity(ActivityLuchadores);
    }

    public void mapa(View view){
        Intent ActivityMapa = new Intent(getApplicationContext(), com.example.silvia.mortalkombat.ActivityLocalizaciones.class);
        startActivity(ActivityMapa);
    }
}
