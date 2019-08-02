package com.example.silvia.mortalkombat;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ActivityClan extends AppCompatActivity {
    private Button linkuei, fuerzasespeciales, hermandaddelasombra, shirairyu, sociedadflorloto;
    private TextView miembros;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clan);
        linkuei = findViewById(R.id.linkuei);
        fuerzasespeciales = findViewById(R.id.fuerzasespeciales);
        hermandaddelasombra = findViewById(R.id.hermandadsombra);
        shirairyu = findViewById(R.id.shirairyu);
        sociedadflorloto = findViewById(R.id.sociedadlotoblanco);
        miembros = findViewById(R.id.miembros);
    }

    public void LinKuei(View view){
        AdminSQL admin = new AdminSQL(this, "administracion", null, 1);
        SQLiteDatabase bd = admin.getWritableDatabase();
        String members = "";
        String cadenas = "";
        StringBuffer sb = new StringBuffer();
        Cursor fila = bd.rawQuery("select Nombre from Personajes where Clan like 'Lin Kuei'", null);
        fila.moveToFirst();
        if (fila.getCount() > 0) {
            do{
                members = fila.getString(0);
                sb.append(members);
                sb.append(", ");
                cadenas = sb.toString();
            }while(fila.moveToNext());
        }
        miembros.setText(cadenas);
        bd.close();
    }

    public void ShiraiRyu(View view){
        AdminSQL admin = new AdminSQL(this, "administracion", null, 1);
        SQLiteDatabase bd = admin.getWritableDatabase();
        String members = "";
        String cadenas = "";
        StringBuffer sb = new StringBuffer();
        Cursor fila = bd.rawQuery("select Nombre from Personajes where Clan like 'Shirai Ryu'", null);
        fila.moveToFirst();
        if (fila.getCount() > 0) {
            do{
                members = fila.getString(0);
                sb.append(members);
                sb.append(", ");
                cadenas = sb.toString();
            }while(fila.moveToNext());
        }
        miembros.setText(cadenas);
        bd.close();
    }

    public void HermandaddelaSombra(View view){
        AdminSQL admin = new AdminSQL(this, "administracion", null, 1);
        SQLiteDatabase bd = admin.getWritableDatabase();
        String members = "";
        String cadenas = "";
        StringBuffer sb = new StringBuffer();
        Cursor fila = bd.rawQuery("select Nombre from Personajes where Clan like 'Hermandad de la Sombra'", null);
        fila.moveToFirst();
        if (fila.getCount() > 0) {
            do{
                members = fila.getString(0);
                sb.append(members);
                sb.append(", ");
                cadenas = sb.toString();
            }while(fila.moveToNext());
        }
        miembros.setText(cadenas);
        bd.close();
    }

    public void FuerzasEspeciales(View view){
        AdminSQL admin = new AdminSQL(this, "administracion", null, 1);
        SQLiteDatabase bd = admin.getWritableDatabase();
        String members = "";
        String cadenas = "";
        StringBuffer sb = new StringBuffer();
        Cursor fila = bd.rawQuery("select Nombre from Personajes where Clan like 'Fuerzas Especiales'", null);
        fila.moveToFirst();
        if (fila.getCount() > 0) {
            do{
                members = fila.getString(0);
                sb.append(members);
                sb.append(", ");
                cadenas = sb.toString();
            }while(fila.moveToNext());
        }
        miembros.setText(cadenas);
        bd.close();
    }

    public void SociedaddelLotoBlanco(View view){
        AdminSQL admin = new AdminSQL(this, "administracion", null, 1);
        SQLiteDatabase bd = admin.getWritableDatabase();
        String members = "";
        String cadenas = "";
        StringBuffer sb = new StringBuffer();
        Cursor fila = bd.rawQuery("select Nombre from Personajes where Clan like 'Sociedad del Loto Blanco'", null);
        fila.moveToFirst();
        if (fila.getCount() > 0) {
            do{
                members = fila.getString(0);
                sb.append(members);
                sb.append(", ");
                cadenas = sb.toString();
            }while(fila.moveToNext());
        }
        miembros.setText(cadenas);
        bd.close();
    }

    public void DragonRojo(View view){
        AdminSQL admin = new AdminSQL(this, "administracion", null, 1);
        SQLiteDatabase bd = admin.getWritableDatabase();
        String members = "";
        String cadenas = "";
        StringBuffer sb = new StringBuffer();
        Cursor fila = bd.rawQuery("select Nombre from Personajes where Clan like 'Dragón Rojo'", null);
        fila.moveToFirst();
        if (fila.getCount() > 0) {
            do{
                members = fila.getString(0);
                sb.append(members);
                sb.append(", ");
                cadenas = sb.toString();
            }while(fila.moveToNext());
        }
        miembros.setText(cadenas);
        bd.close();
    }

    public void DragonNegro(View view){
        AdminSQL admin = new AdminSQL(this, "administracion", null, 1);
        SQLiteDatabase bd = admin.getWritableDatabase();
        String members = "";
        String cadenas = "";
        StringBuffer sb = new StringBuffer();
        Cursor fila = bd.rawQuery("select Nombre from Personajes where Clan like 'Dragón Negro'", null);
        fila.moveToFirst();
        if (fila.getCount() > 0) {
            do{
                members = fila.getString(0);
                sb.append(members);
                sb.append(", ");
                cadenas = sb.toString();
            }while(fila.moveToNext());
        }
        miembros.setText(cadenas);
        bd.close();
    }
}
