package com.example.silvia.mortalkombat;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class ActivityLuchadores extends AppCompatActivity {
    private Button clan, luchador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_luchadores);

        clan = findViewById(R.id.clan);
        luchador = findViewById(R.id.luchadores);

    }

    public void consulta(View view){
        Intent ActivityConsultas = new Intent(getApplicationContext(), com.example.silvia.mortalkombat.ActivityMostrar.class);
        startActivity(ActivityConsultas);
    }

    public void clanes(View view){
        Intent ActivityClan = new Intent(getApplicationContext(), com.example.silvia.mortalkombat.ActivityClan.class);
        startActivity(ActivityClan);
    }
}
