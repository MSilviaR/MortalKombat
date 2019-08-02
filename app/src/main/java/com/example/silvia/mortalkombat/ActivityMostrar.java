package com.example.silvia.mortalkombat;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class ActivityMostrar extends AppCompatActivity {
    private EditText nombre, raza, alineacion, clan, armas;
    private Button consultar;
    private ImageView foto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mostrar);

        nombre = findViewById(R.id.nombre);
        raza = findViewById(R.id.raza);
        alineacion = findViewById(R.id.alineacion);
        clan = findViewById(R.id.clan);
        armas = findViewById(R.id.armas);
        foto = findViewById(R.id.foto);
        consultar = findViewById(R.id.consultar);
    }

    public void consultar_luchador(View view) {
        AdminSQL admin = new AdminSQL(this, "administracion", null, 1);
        SQLiteDatabase bd = admin.getWritableDatabase();

        ContentValues registro = new ContentValues();
        registro.put("Nombre","Cyrax");
        registro.put("Raza","Humana");
        registro.put("Alineacion","Bien");
        registro.put("Armas","Pulse Sword");
        registro.put("Clan","Fuerzas Especiales");
        registro.put("Latitud", -21.686546);
        registro.put("Longitud", 22.784393);
        bd.insert("Personajes",null,registro);

        ContentValues registro1 = new ContentValues();
        registro1.put("Nombre","Ermac");
        registro1.put("Raza","Conjunto de almas");
        registro1.put("Alineacion","Mal");
        registro1.put("Armas","");
        registro1.put("Clan","");
        registro1.put("Latitud", 18.322193);
        registro1.put("Longitud", -92.538480);
        bd.insert("Personajes",null,registro1);

        ContentValues registro2 = new ContentValues();
        registro2.put("Nombre","Erron Black");
        registro2.put("Raza","Humana");
        registro2.put("Alineacion","Mal");
        registro2.put("Armas","Revolvers, Rifle de repetición, Bombas de arena, Caltrops, Brazo Tarkatano");
        registro2.put("Clan","");
        registro2.put("Latitud", 31.852011);
        registro2.put("Longitud", -106.195667);
        bd.insert("Personajes",null,registro2);

        ContentValues registro3 = new ContentValues();
        registro3.put("Nombre","Goro");
        registro3.put("Raza","Shokan");
        registro3.put("Alineacion","Mal");
        registro3.put("Armas","");
        registro3.put("Clan","");
        registro3.put("Latitud", -18.661232);
        registro3.put("Longitud", 44.887395);
        bd.insert("Personajes",null,registro3);

        ContentValues registro4 = new ContentValues();
        registro4.put("Nombre","Jax");
        registro4.put("Raza","Humana");
        registro4.put("Alineacion","Bien");
        registro4.put("Armas","Lanzacohetes, Ametralladora");
        registro4.put("Clan","Fuerzas Especiales");
        registro4.put("Latitud", 34.005848);
        registro4.put("Longitud", -118.456611);
        bd.insert("Personajes",null,registro4);

        ContentValues registro5 = new ContentValues();
        registro5.put("Nombre","Johnny Cage");
        registro5.put("Raza","Humana");
        registro5.put("Alineacion","Bien");
        registro5.put("Armas","");
        registro5.put("Clan","Fuerzas Especiales");
        registro5.put("Latitud", 33.995531);
        registro5.put("Longitud", -118.475167);
        bd.insert("Personajes",null,registro5);

        ContentValues registro6 = new ContentValues();
        registro6.put("Nombre","Kano");
        registro6.put("Raza","Humana");
        registro6.put("Alineacion","Mal");
        registro6.put("Armas","Cuchillos mariposa");
        registro6.put("Clan","Dragón Negro");
        registro6.put("Latitud", -23.056618);
        registro6.put("Longitud", 144.366064);
        bd.insert("Personajes",null,registro6);

        ContentValues registro7 = new ContentValues();
        registro7.put("Nombre","Kenshi");
        registro7.put("Raza","Humana");
        registro7.put("Alineacion","Bien");
        registro7.put("Armas","Katana");
        registro7.put("Clan","Fuerzas Especiales");
        registro7.put("Latitud", 33.568448);
        registro7.put("Longitud", 130.358575);
        bd.insert("Personajes",null,registro7);

        ContentValues registro8 = new ContentValues();
        registro8.put("Nombre","Kitana");
        registro8.put("Raza","Edeniana");
        registro8.put("Alineacion","Bien");
        registro8.put("Armas","Abanicos guerreros, Navaja arrojadiza");
        registro8.put("Clan","Hermandad de la Sombra");
        registro8.put("Latitud", 41.388976);
        registro8.put("Longitud", 2.145552);
        bd.insert("Personajes",null,registro8);

        ContentValues registro9 = new ContentValues();
        registro9.put("Nombre","Kung Lao");
        registro9.put("Raza","Humana");
        registro9.put("Alineacion","Bien");
        registro9.put("Armas","Sombrero, Hacha de guerra");
        registro9.put("Clan","Hermandad de la Sombra");
        registro9.put("Latitud", 27.271136);
        registro9.put("Longitud", 116.301956);
        bd.insert("Personajes",null,registro9);

        ContentValues registro10 = new ContentValues();
        registro10.put("Nombre","Liu Kang");
        registro10.put("Raza","Humana");
        registro10.put("Alineacion","Bien");
        registro10.put("Armas","Espada Dragón, Nunchaku");
        registro10.put("Clan","Hermandad de la Sombra");
        registro10.put("Latitud", 33.753045);
        registro10.put("Longitud", 113.710196);
        bd.insert("Personajes",null,registro10);

        ContentValues registro11 = new ContentValues();
        registro11.put("Nombre","Mileena");
        registro11.put("Raza","Edeniana/Tarkata");
        registro11.put("Alineacion","Mal");
        registro11.put("Armas","Sai, Espada larga");
        registro11.put("Clan","");
        registro11.put("Latitud", 41.388976);
        registro11.put("Longitud", 2.145552);
        bd.insert("Personajes",null,registro11);

        ContentValues registro12 = new ContentValues();
        registro12.put("Nombre","Noob Saibot");
        registro12.put("Raza","Espectro");
        registro12.put("Alineacion","Mal");
        registro12.put("Armas","Espada ninja, Martillo troll");
        registro12.put("Clan","Hermandad de la Sombra");
        registro12.put("Latitud", 35.627955);
        registro12.put("Longitud", 96.451388);
        bd.insert("Personajes",null,registro12);

        ContentValues registro13 = new ContentValues();
        registro13.put("Nombre","Quan Chi");
        registro13.put("Raza","Nigromante");
        registro13.put("Alineacion","Mal");
        registro13.put("Armas","Mazo, Broadsword");
        registro13.put("Clan","Hermandad de la Sombra");
        registro13.put("Latitud", -20.966994);
        registro13.put("Longitud", 167.297472);
        bd.insert("Personajes",null,registro13);

        ContentValues registro14 = new ContentValues();
        registro14.put("Nombre","Raiden");
        registro14.put("Raza","Dios");
        registro14.put("Alineacion","Bien");
        registro14.put("Armas","Martillo de guerra, Bastón");
        registro14.put("Clan","Sociedad del Loto Blanco");
        registro14.put("Latitud", 60.339007);
        registro14.put("Longitud", -75.999998);
        bd.insert("Personajes",null,registro14);

        ContentValues registro15 = new ContentValues();
        registro15.put("Nombre","Rain");
        registro15.put("Raza","Edeniana");
        registro15.put("Alineacion","Mal");
        registro15.put("Armas","Espada de viento");
        registro15.put("Clan","");
        registro15.put("Latitud", 35.560951);
        registro15.put("Longitud", -173.417583);
        bd.insert("Personajes",null,registro15);

        ContentValues registro16 = new ContentValues();
        registro16.put("Nombre","Reptile");
        registro16.put("Raza","Saurio");
        registro16.put("Alineacion","Mal");
        registro16.put("Armas","Hacha de batalla, Kirehashi");
        registro16.put("Clan","");
        registro16.put("Latitud", 5.314556);
        registro16.put("Longitud", 100.286028);
        bd.insert("Personajes",null,registro16);

        ContentValues registro17 = new ContentValues();
        registro17.put("Nombre","Scorpion");
        registro17.put("Raza","Humana");
        registro17.put("Alineacion","Bien");
        registro17.put("Armas","Hacha, espadas");
        registro17.put("Clan","Shirai Ryu");
        registro17.put("Latitud", 34.959530);
        registro17.put("Longitud", 137.812090);
        bd.insert("Personajes",null,registro17);

        ContentValues registro18 = new ContentValues();
        registro18.put("Nombre","Sektor");
        registro18.put("Raza","Humana");
        registro18.put("Alineacion","Mal");
        registro18.put("Armas","Pistola láser, Pulse Blade");
        registro18.put("Clan","Lin Kuei");
        registro18.put("Latitud", 2.727798);
        registro18.put("Longitud", 101.940907);
        bd.insert("Personajes",null,registro18);

        ContentValues registro19 = new ContentValues();
        registro19.put("Nombre","Smoke");
        registro19.put("Raza","Humana");
        registro19.put("Alineacion","Bien");
        registro19.put("Armas","Hacha");
        registro19.put("Clan","Hermandad de la Sombra");
        registro19.put("Latitud", 50.080720);
        registro19.put("Longitud", 14.466707);
        bd.insert("Personajes",null,registro19);

        ContentValues registro20 = new ContentValues();
        registro20.put("Nombre","Sonya Blade");
        registro20.put("Raza","Humana");
        registro20.put("Alineacion","Bien");
        registro20.put("Armas","Wind Blade, Kali Sticks");
        registro20.put("Clan","Fuerzas Especiales");
        registro20.put("Latitud", 28.776963);
        registro20.put("Longitud", -97.724069);
        bd.insert("Personajes",null,registro20);

        ContentValues registro21 = new ContentValues();
        registro21.put("Nombre","Sub-Zero");
        registro21.put("Raza","Humana");
        registro21.put("Alineacion","Bien");
        registro21.put("Armas","Ice Sceptor, Espada Kori");
        registro21.put("Clan","Lin Kuei");
        registro21.put("Latitud", 35.627955);
        registro21.put("Longitud", 96.451388);
        bd.insert("Personajes",null,registro21);

        ContentValues registro22 = new ContentValues();
        registro22.put("Nombre","Baraka");
        registro22.put("Raza","Tarkata");
        registro22.put("Alineacion","Mal");
        registro22.put("Armas","Razon Cane, Espadas Tarkatan");
        registro22.put("Clan","");
        registro22.put("Latitud", 37.384458);
        registro22.put("Longitud", -6.005745);
        bd.insert("Personajes",null,registro22);

        ContentValues registro23 = new ContentValues();
        registro23.put("Nombre","Cassie Cage");
        registro23.put("Raza","Humana");
        registro23.put("Alineacion","Bien");
        registro23.put("Armas","Pistolas, Bastón extensible");
        registro23.put("Clan","Fuerzas Especiales");
        registro23.put("Latitud", 33.989367);
        registro23.put("Longitud", -118.462696);
        bd.insert("Personajes",null,registro23);

        ContentValues registro24 = new ContentValues();
        registro24.put("Nombre","Bo'Rai Cho");
        registro24.put("Raza","Humana");
        registro24.put("Alineacion","Bien");
        registro24.put("Armas","Bastón");
        registro24.put("Clan","Sociedad del Loto Blanco");
        registro24.put("Latitud", 12.545836);
        registro24.put("Longitud", 102.682778);
        bd.insert("Personajes",null,registro24);

        ContentValues registro25 = new ContentValues();
        registro25.put("Nombre","Frost");
        registro25.put("Raza","Humana");
        registro25.put("Alineacion","Mal");
        registro25.put("Armas","Kori Daggers, Tong Bei");
        registro25.put("Clan","Lin Kuei");
        registro25.put("Latitud", 32.080208);
        registro25.put("Longitud", -96.806570);
        bd.insert("Personajes",null,registro25);

        ContentValues registro26 = new ContentValues();
        registro26.put("Nombre","Jacqui Briggs");
        registro26.put("Raza","Humana");
        registro26.put("Alineacion","Bien");
        registro26.put("Armas","Guantes biónicos");
        registro26.put("Clan","Fuerzas Especiales");
        registro26.put("Latitud", 33.986489);
        registro26.put("Longitud", -118.471731);
        bd.insert("Personajes",null,registro26);

        ContentValues registro27 = new ContentValues();
        registro27.put("Nombre","Kung Jin");
        registro27.put("Raza","Humana");
        registro27.put("Alineacion","Bien");
        registro27.put("Armas","Archo y flechas, Chakram");
        registro27.put("Clan","Fuerzas Especiales");
        registro27.put("Latitud", 27.535930);
        registro27.put("Longitud", 115.407913);
        bd.insert("Personajes",null,registro27);

        ContentValues registro28 = new ContentValues();
        registro28.put("Nombre","Takeda");
        registro28.put("Raza","Humana");
        registro28.put("Alineacion","Bien");
        registro28.put("Armas","Látigos, Kunai, Espadas láser");
        registro28.put("Clan","Fuerzas Especiales");
        registro28.put("Latitud", 18.159567);
        registro28.put("Longitud", 99.428324);
        bd.insert("Personajes",null,registro28);

        ContentValues registro29 = new ContentValues();
        registro29.put("Nombre","Shang Tsung");
        registro29.put("Raza","Humana");
        registro29.put("Alineacion","Mal");
        registro29.put("Armas","");
        registro29.put("Clan","");
        registro29.put("Latitud",34.119320);
        registro29.put("Longitud",111.206761);
        bd.insert("Personajes",null,registro29);

        ContentValues registro30 = new ContentValues();
        registro30.put("Nombre","Jade");
        registro30.put("Raza","Edeniana");
        registro30.put("Alineacion","Bien");
        registro30.put("Armas","Bastón luminoso, Triblade");
        registro30.put("Clan","Hermandad de la Sombra");
        registro30.put("Latitud",27.098494);
        registro30.put("Longitud",100.174689);
        bd.insert("Personajes",null,registro30);

        ContentValues registro31 = new ContentValues();
        registro31.put("Nombre","Kintaro");
        registro31.put("Raza","Shokan Atigrado");
        registro31.put("Alineacion","Mal");
        registro31.put("Armas","Dientes de sable");
        registro31.put("Clan","");
        registro31.put("Latitud",48.868950);
        registro31.put("Longitud",2.334834);
        bd.insert("Personajes",null,registro31);

        ContentValues registro32 = new ContentValues();
        registro32.put("Nombre","Shao Kahn");
        registro32.put("Raza","Outworlder");
        registro32.put("Alineacion","Mal");
        registro32.put("Armas","Wrath Hammer");
        registro32.put("Clan","");
        registro32.put("Latitud",48.862767);
        registro32.put("Longitud",9.191981);
        bd.insert("Personajes",null,registro32);

        ContentValues registro33 = new ContentValues();
        registro33.put("Nombre","Chameleon");
        registro33.put("Raza","Saurio");
        registro33.put("Alineacion","Mal");
        registro33.put("Armas","Espada ninja");
        registro33.put("Clan","");
        registro33.put("Latitud",48.889685);
        registro33.put("Longitud",8.856391);
        bd.insert("Personajes",null,registro33);

        ContentValues registro34 = new ContentValues();
        registro34.put("Nombre","Kabal");
        registro34.put("Raza","Humana");
        registro34.put("Alineacion","Mal");
        registro34.put("Armas","Hookswords");
        registro34.put("Clan","Hermandad de la Sombra");
        registro34.put("Latitud",38.962758);
        registro34.put("Longitud",-122.647989);
        bd.insert("Personajes",null,registro34);

        ContentValues registro35 = new ContentValues();
        registro35.put("Nombre","Khameleon");
        registro35.put("Raza","Saurio");
        registro35.put("Alineacion","Neutral");
        registro35.put("Armas","Falchion");
        registro35.put("Clan","");
        registro35.put("Latitud",55.361997);
        registro35.put("Longitud",37.530985);
        bd.insert("Personajes",null,registro35);

        ContentValues registro36 = new ContentValues();
        registro36.put("Nombre","Motaro");
        registro36.put("Raza","Centauro");
        registro36.put("Alineacion","Mal");
        registro36.put("Armas","");
        registro36.put("Clan","");
        registro36.put("Latitud",25.160215);
        registro36.put("Longitud",75.006017);
        bd.insert("Personajes",null,registro36);

        ContentValues registro37 = new ContentValues();
        registro37.put("Nombre","Nightwolf");
        registro37.put("Raza","Humana");
        registro37.put("Alineacion","Mal");
        registro37.put("Armas","Tomahawks, Arco y flechas");
        registro37.put("Clan","Hermandad de la Sombra");
        registro37.put("Latitud",29.742089);
        registro37.put("Longitud",-95.408806);
        bd.insert("Personajes",null,registro37);

        ContentValues registro38 = new ContentValues();
        registro38.put("Nombre","Sheeva");
        registro38.put("Raza","Shokan");
        registro38.put("Alineacion","Mal");
        registro38.put("Armas","");
        registro38.put("Clan","");
        registro38.put("Latitud",53.881194);
        registro38.put("Longitud",-8.388632);
        bd.insert("Personajes",null,registro38);

        ContentValues registro39 = new ContentValues();
        registro39.put("Nombre","Sindel");
        registro39.put("Raza","Edeniana");
        registro39.put("Alineacion","Mal");
        registro39.put("Armas","Kwan Dao");
        registro39.put("Clan","Hermandad de la Sombra");
        registro39.put("Latitud",43.109947);
        registro39.put("Longitud",27.604233);
        bd.insert("Personajes",null,registro39);

        ContentValues registro40 = new ContentValues();
        registro40.put("Nombre","Stryker");
        registro40.put("Raza","Humana");
        registro40.put("Alineacion","Mal");
        registro40.put("Armas","Pistola, Nightsticks, Taser");
        registro40.put("Clan","Hermandad de la Sombra");
        registro40.put("Latitud",43.074816);
        registro40.put("Longitud",-77.769827);
        bd.insert("Personajes",null,registro40);

        ContentValues registro41 = new ContentValues();
        registro41.put("Nombre","Fujin");
        registro41.put("Raza","Dios");
        registro41.put("Alineacion","Bien");
        registro41.put("Armas","Plasma Crossbow, Devastator");
        registro41.put("Clan","");
        registro41.put("Latitud",43.074816);
        registro41.put("Longitud",-77.769827);
        bd.insert("Personajes",null,registro41);

        ContentValues registro42 = new ContentValues();
        registro42.put("Nombre","Shinnok");
        registro42.put("Raza","Dios");
        registro42.put("Alineacion","Mal");
        registro42.put("Armas","");
        registro42.put("Clan","");
        registro42.put("Latitud",4.957166);
        registro42.put("Longitud",8.331724);
        bd.insert("Personajes",null,registro42);

        ContentValues registro43 = new ContentValues();
        registro43.put("Nombre","Sareena");
        registro43.put("Raza","Demonio");
        registro43.put("Alineacion","Bien");
        registro43.put("Armas","Espada Colmillo de Demonio, Sai");
        registro43.put("Clan","");
        registro43.put("Latitud",32.015357);
        registro43.put("Longitud",35.867247);
        bd.insert("Personajes",null,registro43);

        ContentValues registro44 = new ContentValues();
        registro44.put("Nombre","Jarek");
        registro44.put("Raza","Humana");
        registro44.put("Alineacion","Mal");
        registro44.put("Armas","Espada Dragón Negro, Kick Axe");
        registro44.put("Clan","Dragón Negro");
        registro44.put("Latitud",46.054616);
        registro44.put("Longitud",16.286372);
        bd.insert("Personajes",null,registro44);

        ContentValues registro45 = new ContentValues();
        registro45.put("Nombre","Kai");
        registro45.put("Raza","Humana");
        registro45.put("Alineacion","Bien");
        registro45.put("Armas","Cuchillo Ghurka, Mazo con púas");
        registro45.put("Clan","Sociedad del Loto Blanco");
        registro45.put("Latitud",40.843523);
        registro45.put("Longitud",-73.845853);
        bd.insert("Personajes",null,registro45);

        ContentValues registro46 = new ContentValues();
        registro46.put("Nombre","Meat");
        registro46.put("Raza","Experimento Fallido");
        registro46.put("Alineacion","Neutral");
        registro46.put("Armas","Cuchillas de carnicero");
        registro46.put("Clan","");
        registro46.put("Latitud",40.858695);
        registro46.put("Longitud",-73.898666);
        bd.insert("Personajes",null,registro46);

        ContentValues registro47 = new ContentValues();
        registro47.put("Nombre","Reiko");
        registro47.put("Raza","Outworlder");
        registro47.put("Alineacion","Mal");
        registro47.put("Armas","Mazo con púas, Guadaña, Crude Hammer");
        registro47.put("Clan","Hermandad de la Sombra");
        registro47.put("Latitud",40.733672);
        registro47.put("Longitud",-73.990790);
        bd.insert("Personajes",null,registro47);

        ContentValues registro48 = new ContentValues();
        registro48.put("Nombre","Tanya");
        registro48.put("Raza","Edeniana");
        registro48.put("Alineacion","Mal");
        registro48.put("Armas","Kobu Jutsu, Boomerang, Naginata");
        registro48.put("Clan","");
        registro48.put("Latitud",14.550292);
        registro48.put("Longitud",121.005949);
        bd.insert("Personajes",null,registro48);

        ContentValues registro49 = new ContentValues();
        registro49.put("Nombre","Taven");
        registro49.put("Raza","Edeniana");
        registro49.put("Alineacion","Bien");
        registro49.put("Armas","Drake Sword");
        registro49.put("Clan","");
        registro49.put("Latitud",-38.306924);
        registro49.put("Longitud",145.180101);
        bd.insert("Personajes",null,registro49);

        ContentValues registro50 = new ContentValues();
        registro50.put("Nombre","Li Mei");
        registro50.put("Raza","Outworlder");
        registro50.put("Alineacion","Bien");
        registro50.put("Armas","Sai, Kuniun Dao");
        registro50.put("Clan","Fuerzas Especiales");
        registro50.put("Latitud",35.908252);
        registro50.put("Longitud",14.427452);
        bd.insert("Personajes",null,registro50);

        ContentValues registro51 = new ContentValues();
        registro51.put("Nombre","Mavado");
        registro51.put("Raza","Humana");
        registro51.put("Alineacion","Mal");
        registro51.put("Armas","Hookswords");
        registro51.put("Clan","Dragón Rojo");
        registro51.put("Latitud",29.968558);
        registro51.put("Longitud",-101.868008);
        bd.insert("Personajes",null,registro51);

        ContentValues registro52 = new ContentValues();
        registro52.put("Nombre","Nitara");
        registro52.put("Raza","Vampiresa");
        registro52.put("Alineacion","Neutral");
        registro52.put("Armas","Kama");
        registro52.put("Clan","");
        registro52.put("Latitud",31.858344);
        registro52.put("Longitud",-106.566459);
        bd.insert("Personajes",null,registro52);

        ContentValues registro53 = new ContentValues();
        registro53.put("Nombre","Drahmin");
        registro53.put("Raza","Oni");
        registro53.put("Alineacion","Mal");
        registro53.put("Armas","Mazo de metal");
        registro53.put("Clan","");
        registro53.put("Latitud",37.977955);
        registro53.put("Longitud",23.732226);
        bd.insert("Personajes",null,registro53);

        ContentValues registro54 = new ContentValues();
        registro54.put("Nombre","Hsu Hao");
        registro54.put("Raza","Humana");
        registro54.put("Alineacion","Mal");
        registro54.put("Armas","");
        registro54.put("Clan","Dragón Rojo");
        registro54.put("Latitud",23.776984);
        registro54.put("Longitud",116.690162);
        bd.insert("Personajes",null,registro54);

        ContentValues registro55 = new ContentValues();
        registro55.put("Nombre","Mokap");
        registro55.put("Raza","Humana");
        registro55.put("Alineacion","Bien");
        registro55.put("Armas","");
        registro55.put("Clan","");
        registro55.put("Latitud",21.186671);
        registro55.put("Longitud",-156.926945);
        bd.insert("Personajes",null,registro55);

        ContentValues registro56 = new ContentValues();
        registro56.put("Nombre","Blaze");
        registro56.put("Raza","Elemental");
        registro56.put("Alineacion","Neutral");
        registro56.put("Armas","");
        registro56.put("Clan","");
        registro56.put("Latitud",53.618590);
        registro56.put("Longitud",-113.395386);
        bd.insert("Personajes",null,registro56);

        ContentValues registro57 = new ContentValues();
        registro57.put("Nombre","Moloch");
        registro57.put("Raza","Oni");
        registro57.put("Alineacion","Neutral");
        registro57.put("Armas","Bola de hierro");
        registro57.put("Clan","");
        registro57.put("Latitud",51.338059);
        registro57.put("Longitud",-117.942500);
        bd.insert("Personajes",null,registro57);

        ContentValues registro58 = new ContentValues();
        registro58.put("Nombre","Havik");
        registro58.put("Raza","Habitante del Reino del Caos");
        registro58.put("Alineacion","Neutral");
        registro58.put("Armas","Morning Star");
        registro58.put("Clan","");
        registro58.put("Latitud",59.324360);
        registro58.put("Longitud",5.297959);
        bd.insert("Personajes",null,registro58);

        ContentValues registro59 = new ContentValues();
        registro59.put("Nombre","Shujinko");
        registro59.put("Raza","Humana");
        registro59.put("Alineacion","Bien");
        registro59.put("Armas","Dan Tien Dao");
        registro59.put("Clan","");
        registro59.put("Latitud",-37.811315);
        registro59.put("Longitud",144.967150);
        bd.insert("Personajes",null,registro59);

        ContentValues registro60 = new ContentValues();
        registro60.put("Nombre","Hotaru");
        registro60.put("Raza","Humana");
        registro60.put("Alineacion","Neutral");
        registro60.put("Armas","Naginata");
        registro60.put("Clan","");
        registro60.put("Latitud",-37.812798);
        registro60.put("Longitud",144.967369);
        bd.insert("Personajes",null,registro60);

        ContentValues registro61 = new ContentValues();
        registro61.put("Nombre","Ashrah");
        registro61.put("Raza","Demonio");
        registro61.put("Alineacion","Bien");
        registro61.put("Armas","Datusha");
        registro61.put("Clan","Hermandad de la Sombra");
        registro61.put("Latitud",32.915288);
        registro61.put("Longitud",66.796669);
        bd.insert("Personajes",null,registro61);

        ContentValues registro62 = new ContentValues();
        registro62.put("Nombre","Dairou");
        registro62.put("Raza","Seidan");
        registro62.put("Alineacion","Neutral");
        registro62.put("Armas","Autumn Dao");
        registro62.put("Clan","");
        registro62.put("Latitud",34.983328);
        registro62.put("Longitud",36.138850);
        bd.insert("Personajes",null,registro62);

        ContentValues registro63 = new ContentValues();
        registro63.put("Nombre","Kobra");
        registro63.put("Raza","Humana");
        registro63.put("Alineacion","Mal");
        registro63.put("Armas","Kali Sticks, Machete");
        registro63.put("Clan","Dragón Negro");
        registro63.put("Latitud",40.718973);
        registro63.put("Longitud",-73.956411);
        bd.insert("Personajes",null,registro63);

        ContentValues registro64 = new ContentValues();
        registro64.put("Nombre","Onaga");
        registro64.put("Raza","Dragón");
        registro64.put("Alineacion","Mal");
        registro64.put("Armas","");
        registro64.put("Clan","");
        registro64.put("Latitud",26.159644);
        registro64.put("Longitud",127.671550);
        bd.insert("Personajes",null,registro64);

        ContentValues registro65 = new ContentValues();
        registro65.put("Nombre","Darrius");
        registro65.put("Raza","Sedian");
        registro65.put("Alineacion","Neutral");
        registro65.put("Armas","Guanteletes");
        registro65.put("Clan","");
        registro65.put("Latitud",43.117567);
        registro65.put("Longitud",-0.270801);
        bd.insert("Personajes",null,registro65);

        ContentValues registro66 = new ContentValues();
        registro66.put("Nombre","Kira");
        registro66.put("Raza","Humana");
        registro66.put("Alineacion","Mal");
        registro66.put("Armas","Cuchillos");
        registro66.put("Clan","Dragón Negro");
        registro66.put("Latitud",35.992235);
        registro66.put("Longitud",70.760856);
        bd.insert("Personajes",null,registro66);

        ContentValues registro67 = new ContentValues();
        registro67.put("Nombre","Daegon");
        registro67.put("Raza","Edeniana");
        registro67.put("Alineacion","Mal");
        registro67.put("Armas","Drakeswords");
        registro67.put("Clan","");
        registro67.put("Latitud",37.435037);
        registro67.put("Longitud",127.010602);
        bd.insert("Personajes",null,registro67);

        ContentValues registro68 = new ContentValues();
        registro68.put("Nombre","Skarlet");
        registro68.put("Raza","Creación");
        registro68.put("Alineacion","Mal");
        registro68.put("Armas","Espadas Kodachi");
        registro68.put("Clan","");
        registro68.put("Latitud",52.867289);
        registro68.put("Longitud",5.391243);
        bd.insert("Personajes",null,registro68);

        ContentValues registro69 = new ContentValues();
        registro69.put("Nombre","Tremor");
        registro69.put("Raza","Humana");
        registro69.put("Alineacion","Mal");
        registro69.put("Armas","");
        registro69.put("Clan","Dragón Negro");
        registro69.put("Latitud",47.854196);
        registro69.put("Longitud",-3.746660);
        bd.insert("Personajes",null,registro69);

        ContentValues registro70 = new ContentValues();
        registro70.put("Nombre","Ferra/Torr");
        registro70.put("Raza","");
        registro70.put("Alineacion","Mal");
        registro70.put("Armas","");
        registro70.put("Clan","");
        registro70.put("Latitud",44.937550);
        registro70.put("Longitud",4.824511);
        bd.insert("Personajes",null,registro70);

        ContentValues registro71 = new ContentValues();
        registro71.put("Nombre","Kotal Kahn");
        registro71.put("Raza","Osh-Tekk");
        registro71.put("Alineacion","");
        registro71.put("Armas","Macuahuiti, Tecpatl, Hoces");
        registro71.put("Clan","");
        registro71.put("Latitud",27.716508);
        registro71.put("Longitud",85.333211);
        bd.insert("Personajes",null,registro71);

        ContentValues registro72 = new ContentValues();
        registro72.put("Nombre","D'Vorah");
        registro72.put("Raza","Kyttin");
        registro72.put("Alineacion","Mal");
        registro72.put("Armas","");
        registro72.put("Clan","Hermandad de la Sombra");
        registro72.put("Latitud",27.733526);
        registro72.put("Longitud",85.316240);
        bd.insert("Personajes",null,registro72);

        ContentValues registro73 = new ContentValues();
        registro73.put("Nombre","Triborg");
        registro73.put("Raza","Cyborg");
        registro73.put("Alineacion","Neutral");
        registro73.put("Armas","");
        registro73.put("Clan","Lin Kuei");
        registro73.put("Latitud",45.374019);
        registro73.put("Longitud",-77.630302);
        bd.insert("Personajes",null,registro73);

        ContentValues registro74 = new ContentValues();
        registro74.put("Nombre","Cetrion");
        registro74.put("Raza","Diosa Antigua");
        registro74.put("Alineacion","");
        registro74.put("Armas","");
        registro74.put("Clan","");
        registro74.put("Latitud",31.098431);
        registro74.put("Longitud",-88.238943);
        bd.insert("Personajes",null,registro74);

        ContentValues registro75 = new ContentValues();
        registro75.put("Nombre","Geras");
        registro75.put("Raza","Creación Artificial");
        registro75.put("Alineacion","");
        registro75.put("Armas","");
        registro75.put("Clan","");
        registro75.put("Latitud",42.894487);
        registro75.put("Longitud",-5.767531);
        bd.insert("Personajes",null,registro75);

        ContentValues registro76 = new ContentValues();
        registro76.put("Nombre","Kollector");
        registro76.put("Raza","");
        registro76.put("Alineacion","");
        registro76.put("Armas","Maza con cadena, hoz, kukris, faro, Chakram");
        registro76.put("Clan","");
        registro76.put("Latitud",40.504171);
        registro76.put("Longitud",72.242499);
        bd.insert("Personajes",null,registro76);

        ContentValues registro77 = new ContentValues();
        registro77.put("Nombre","Kronika");
        registro77.put("Raza","Titán");
        registro77.put("Alineacion","Mal");
        registro77.put("Armas","");
        registro77.put("Clan","");
        registro77.put("Latitud",46.538546);
        registro77.put("Longitud",24.558524);
        bd.insert("Personajes",null,registro77);

        String name = nombre.getText().toString();
        Cursor fila = bd.rawQuery("select Raza, Alineacion, Armas, Clan from Personajes where Nombre like '" + name + "'", null);
        if (fila.moveToFirst()) {
            raza.setText(fila.getString(0));
            alineacion.setText(fila.getString(1));
            armas.setText(fila.getString(2));
            clan.setText(fila.getString(3));
        } else
            Toast.makeText(this, "No existe un luchador con dicho nombre", Toast.LENGTH_SHORT).show();
        bd.close();
    }
}
