package com.Julia_lessons.juliaomelart;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class Activity_9_Dollars extends AppCompatActivity implements View.OnClickListener {
    TextView textSize;
    TextView count_MK;
    static String connectLink_of_advanced,boostylink9Doll; // Имя рисунка
    static  boolean onButtonVisible9doll_2, onButtonVisible9doll_3, onButtonVisible9doll_4, onButtonVisible9doll_5, onButtonVisible9doll_6, onButtonVisible9doll_7 = false;
    String name9Doll_2, name9Doll_3, name9Doll_4, name9Doll_5, name9Doll_6, name9Doll_7; // Состав строки в одну и проверка на вторую часть.
    ArrayList<Integer> reslist1 = new ArrayList<>();
    public static final String TAG = "Activity_Advanced";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_9dollars);
        if (reslist1.isEmpty()) {
            reslist1.add(R.id.id_Smile);
            reslist1.add(R.id.id_Sheet);
            reslist1.add(R.id.id_Beetle);
            reslist1.add(R.id.id_Sinichka);
            reslist1.add(R.id.id_Tea);
            reslist1.add(R.id.id_Eyes);
            reslist1.add(R.id.id_Butterfly);
            reslist1.add(R.id.id_Cherry);
            reslist1.add(R.id.id_Mandarin);
            reslist1.add(R.id.id_Pumpkin);
            reslist1.add(R.id.id_Mushroom);
            reslist1.add(R.id.id_Cat);
            reslist1.add(R.id.id_Peach);
            reslist1.add(R.id.id_Tigr);
            reslist1.add(R.id.id_Frog);
            reslist1.add(R.id.id_Aiva);
            reslist1.add(R.id.id_Lily);
            reslist1.add(R.id.id_Child);
            reslist1.add(R.id.id_Lizard);
            reslist1.add(R.id.id_Dog);
            reslist1.add(R.id.id_Tropical_Fish);
            reslist1.add(R.id.id_Cloudlandscape);
            reslist1.add(R.id.id_Bumblemee);
            reslist1.add(R.id.id_Leopard);
            reslist1.add(R.id.id_Blueberry);
            reslist1.add(R.id.id_GoldenFish);
            reslist1.add(R.id.id_Owl);
            reslist1.add(R.id.id_Ametist);
            reslist1.add(R.id.id_Christmas);
            reslist1.add(R.id.id_Squirrel);
            reslist1.add(R.id.id_Silverjug);
            reslist1.add(R.id.id_Cake);
            reslist1.add(R.id.id_Horse);
            reslist1.add(R.id.id_Woodenmug);
            reslist1.add(R.id.id_Seaturtle);
            reslist1.add(R.id.id_Tomat);
            reslist1.add(R.id.id_GreyCat);
        }
        try {
            for (int i = 0; i < reslist1.size(); i++) {
                ImageView v = findViewById(reslist1.get(i));
                v.setOnClickListener(this);
                if (i == 1) {
                    registerForContextMenu(v);

                }
            }
        } catch (Exception e) {
            Intent i = new Intent(this, MainActivity.class);
            i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
            Toast.makeText(this, "Потеря данных", Toast.LENGTH_LONG).show();
            startActivity(i);
        }
        textSize = findViewById(R.id.id_textSize);
        count_MK = findViewById(R.id.id_count_Of_MK);
        count_MK.setText(String.valueOf(reslist1.size()));
        boostylink9Doll = null;
        onButtonVisible9doll_2 = false;
        onButtonVisible9doll_3 = false;
        onButtonVisible9doll_4 = false;
        onButtonVisible9doll_5 = false;
        onButtonVisible9doll_6 = false;
        onButtonVisible9doll_7 = false;
        name9Doll_2 = null;
        name9Doll_3 = null;
        name9Doll_4 = null;
        name9Doll_5 = null;
        name9Doll_6 = null;
        name9Doll_7 = null;
        connectLink_of_advanced = null;

    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        if (v.getId() == R.id.id_Sheet) {
            getMenuInflater().inflate(R.menu.conrext_menu, menu);
        }
    }

    @SuppressLint("NonConstantResourceId")
    @Override
    public boolean onContextItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.id_context_menu) {
            Toast.makeText(this, "Size = " + textSize.getText(), Toast.LENGTH_LONG).show();
        }
        return super.onContextItemSelected(item);
    }

    @SuppressLint("NonConstantResourceId")
    @Override
    public void onClick(View v) {
        boostylink9Doll = null;
        onButtonVisible9doll_2 = false;
        onButtonVisible9doll_3 = false;
        onButtonVisible9doll_4 = false;
        onButtonVisible9doll_5 = false;
        onButtonVisible9doll_6 = false;
        onButtonVisible9doll_7 = false;
        name9Doll_2 = null;
        name9Doll_3 = null;
        name9Doll_4 = null;
        name9Doll_5 = null;
        name9Doll_6 = null;
        name9Doll_7 = null;
        Intent intent;
        switch (v.getId()) {
            case R.id.id_Sheet:
                intent = new Intent(this, Activity_moveToWatch.class);
                intent.putExtra("intent", R.mipmap.sheet);
                connectLink_of_advanced = "Sheet";
                startActivity(intent);
                boostylink9Doll = connectLink_of_advanced + "_Boosty";
                break;
            case R.id.id_Smile:
                intent = new Intent(this, Activity_moveToWatch.class);
                intent.putExtra("intent", R.mipmap.smile);
                startActivity(intent);
                connectLink_of_advanced = "Smile";
                boostylink9Doll = connectLink_of_advanced + "_Boosty";
                name9Doll_2 = connectLink_of_advanced + "_p2";
                if (MainActivity.mapView.containsKey(name9Doll_2)) onButtonVisible9doll_2 = true;
                break;
            case R.id.id_Beetle:
                intent = new Intent(this, Activity_moveToWatch.class);
                intent.putExtra("intent", R.mipmap.beetle);
                startActivity(intent);
                connectLink_of_advanced = "Beetle";
                boostylink9Doll = connectLink_of_advanced + "_Boosty";
                name9Doll_2 = connectLink_of_advanced + "_p2";
                name9Doll_3 = connectLink_of_advanced + "_p3";
                if (MainActivity.mapView.containsKey(name9Doll_2)) onButtonVisible9doll_2 = true;
                if (MainActivity.mapView.containsKey(name9Doll_3)) onButtonVisible9doll_3 = true;
                break;
            case R.id.id_Tea:
                intent = new Intent(this, Activity_moveToWatch.class);
                intent.putExtra("intent", R.mipmap.tea);
                startActivity(intent);
                connectLink_of_advanced = "Tea";
                boostylink9Doll = connectLink_of_advanced + "_Boosty";
                name9Doll_2 = connectLink_of_advanced + "_p2";
                if (MainActivity.mapView.containsKey(name9Doll_2)) onButtonVisible9doll_2 = true;
                break;
            case R.id.id_Eyes:
                intent = new Intent(this, Activity_moveToWatch.class);
                intent.putExtra("intent", R.mipmap.eye);
                startActivity(intent);
                connectLink_of_advanced = "Eyes";
                boostylink9Doll = connectLink_of_advanced + "_Boosty";
                break;
            case R.id.id_Peach:
                intent = new Intent(this, Activity_moveToWatch.class);
                intent.putExtra("intent", R.mipmap.peach);
                startActivity(intent);
                connectLink_of_advanced = "Peach";
                boostylink9Doll = connectLink_of_advanced + "_Boosty";
                name9Doll_2 = connectLink_of_advanced + "_p2";
                if (MainActivity.mapView.containsKey(name9Doll_2)) onButtonVisible9doll_2 = true;
                break;
            case R.id.id_Mandarin:
                intent = new Intent(this, Activity_moveToWatch.class);
                intent.putExtra("intent", R.mipmap.mandarin);
                startActivity(intent);
                connectLink_of_advanced = "Mandarin";
                boostylink9Doll = connectLink_of_advanced + "_Boosty";
                break;
            case R.id.id_Sinichka:
                intent = new Intent(this, Activity_moveToWatch.class);
                intent.putExtra("intent", R.mipmap.sinichka);
                startActivity(intent);
                connectLink_of_advanced = "Sinichka";
                boostylink9Doll = connectLink_of_advanced + "_Boosty";
                name9Doll_2 = connectLink_of_advanced + "_p2";
                if (MainActivity.mapView.containsKey(name9Doll_2)) onButtonVisible9doll_2 = true;
                break;
            case R.id.id_Cat:
                intent = new Intent(this, Activity_moveToWatch.class);
                intent.putExtra("intent", R.mipmap.cat);
                startActivity(intent);
                connectLink_of_advanced = "Cat";
                boostylink9Doll = connectLink_of_advanced + "_Boosty";
                name9Doll_2 = connectLink_of_advanced + "_p2";
                if (MainActivity.mapView.containsKey(name9Doll_2)) onButtonVisible9doll_2 = true;
                break;
            case R.id.id_Tigr:
                intent = new Intent(this, Activity_moveToWatch.class);
                intent.putExtra("intent", R.mipmap.tigr);
                startActivity(intent);
                connectLink_of_advanced = "Tigr";
                boostylink9Doll = connectLink_of_advanced + "_Boosty";
                name9Doll_2 = connectLink_of_advanced + "_p2";
                if (MainActivity.mapView.containsKey(name9Doll_2)) onButtonVisible9doll_2 = true;
                break;
            case R.id.id_Mushroom:
                intent = new Intent(this, Activity_moveToWatch.class);
                intent.putExtra("intent", R.mipmap.mushroom);
                startActivity(intent);
                connectLink_of_advanced = "Mushroom";
                boostylink9Doll = connectLink_of_advanced + "_Boosty";
                break;
            case R.id.id_Butterfly:
                intent = new Intent(this, Activity_moveToWatch.class);
                intent.putExtra("intent", R.mipmap.butterfly);
                startActivity(intent);
                connectLink_of_advanced = "Butterfly";
                boostylink9Doll = connectLink_of_advanced + "_Boosty";
                break;
            case R.id.id_Pumpkin:
                intent = new Intent(this, Activity_moveToWatch.class);
                intent.putExtra("intent", R.mipmap.pumpkin);
                startActivity(intent);
                connectLink_of_advanced = "Pumpkin";
                boostylink9Doll = connectLink_of_advanced + "_Boosty";
                break;
            case R.id.id_Cherry:
                intent = new Intent(this, Activity_moveToWatch.class);
                intent.putExtra("intent", R.mipmap.cherry);
                startActivity(intent);
                connectLink_of_advanced = "Cherry";
                boostylink9Doll = connectLink_of_advanced + "_Boosty";
                break;
            case R.id.id_Frog:
                intent = new Intent(this, Activity_moveToWatch.class);
                intent.putExtra("intent", R.mipmap.frog);
                startActivity(intent);
                connectLink_of_advanced = "Frog";
                boostylink9Doll = connectLink_of_advanced + "_Boosty";
                name9Doll_2 = connectLink_of_advanced + "_p2";
                if (MainActivity.mapView.containsKey(name9Doll_2)) onButtonVisible9doll_2 = true;
                break;
            case R.id.id_Aiva:
                intent = new Intent(this, Activity_moveToWatch.class);
                intent.putExtra("intent", R.mipmap.aiva);
                startActivity(intent);
                connectLink_of_advanced = "Aiva";
                boostylink9Doll = connectLink_of_advanced + "_Boosty";
                break;
            case R.id.id_Lily:
                intent = new Intent(this, Activity_moveToWatch.class);
                intent.putExtra("intent", R.mipmap.lily);
                startActivity(intent);
                connectLink_of_advanced = "Lily";
                boostylink9Doll = connectLink_of_advanced + "_Boosty";
                name9Doll_2 = connectLink_of_advanced + "_p2";
                if (MainActivity.mapView.containsKey(name9Doll_2)) onButtonVisible9doll_2 = true;
                break;
            case R.id.id_Child:
                intent = new Intent(this, Activity_moveToWatch.class);
                intent.putExtra("intent", R.mipmap.child);
                startActivity(intent);
                connectLink_of_advanced = "Child";
                boostylink9Doll = connectLink_of_advanced + "_Boosty";
                name9Doll_2 = connectLink_of_advanced + "_p2";
                name9Doll_3 = connectLink_of_advanced + "_p3";
                if (MainActivity.mapView.containsKey(name9Doll_2)) onButtonVisible9doll_2 = true;
                if (MainActivity.mapView.containsKey(name9Doll_3)) onButtonVisible9doll_3 = true;
                break;
            case R.id.id_Cake:
                intent = new Intent(this, Activity_moveToWatch.class);
                intent.putExtra("intent", R.mipmap.cake);
                startActivity(intent);
                connectLink_of_advanced = "Cake";
                boostylink9Doll = connectLink_of_advanced + "_Boosty";
                name9Doll_2 = connectLink_of_advanced + "_p2";
                name9Doll_3 = connectLink_of_advanced + "_p3";
                if (MainActivity.mapView.containsKey(name9Doll_2)) onButtonVisible9doll_2 = true;
                if (MainActivity.mapView.containsKey(name9Doll_3)) onButtonVisible9doll_3 = true;
                break;
            case R.id.id_Lizard:
                intent = new Intent(this, Activity_moveToWatch.class);
                intent.putExtra("intent", R.mipmap.lizard);
                startActivity(intent);
                connectLink_of_advanced = "Lizard";
                boostylink9Doll = connectLink_of_advanced + "_Boosty";
                name9Doll_2 = connectLink_of_advanced + "_p2";
                name9Doll_3 = connectLink_of_advanced + "_p3";
                if (MainActivity.mapView.containsKey(name9Doll_2)) onButtonVisible9doll_2 = true;
                if (MainActivity.mapView.containsKey(name9Doll_3)) onButtonVisible9doll_3 = true;
                break;
            case R.id.id_Dog:
                intent = new Intent(this, Activity_moveToWatch.class);
                intent.putExtra("intent", R.mipmap.dog);
                startActivity(intent);
                connectLink_of_advanced = "Dog";
                boostylink9Doll = connectLink_of_advanced + "_Boosty";
                name9Doll_2 = connectLink_of_advanced + "_p2";
                name9Doll_3 = connectLink_of_advanced + "_p3";
                name9Doll_4 = connectLink_of_advanced + "_p4";
                if (MainActivity.mapView.containsKey(name9Doll_2)) onButtonVisible9doll_2 = true;
                if (MainActivity.mapView.containsKey(name9Doll_3)) onButtonVisible9doll_3 = true;
                if (MainActivity.mapView.containsKey(name9Doll_4)) onButtonVisible9doll_4 = true;
                break;
            case R.id.id_Tropical_Fish:
                intent = new Intent(this, Activity_moveToWatch.class);
                intent.putExtra("intent", R.mipmap.tropical_fish);
                startActivity(intent);
                connectLink_of_advanced = "Tropical_Fish";
                boostylink9Doll = connectLink_of_advanced + "_Boosty";
                name9Doll_2 = connectLink_of_advanced + "_p2";
                name9Doll_3 = connectLink_of_advanced + "_p3";
                if (MainActivity.mapView.containsKey(name9Doll_2)) onButtonVisible9doll_2 = true;
                if (MainActivity.mapView.containsKey(name9Doll_3)) onButtonVisible9doll_3 = true;
                break;
            case R.id.id_Cloudlandscape:
                intent = new Intent(this, Activity_moveToWatch.class);
                intent.putExtra("intent", R.mipmap.cloudlandscape);
                startActivity(intent);
                connectLink_of_advanced = "Cloudlandscape";
                boostylink9Doll = connectLink_of_advanced + "_Boosty";
                name9Doll_2 = connectLink_of_advanced + "_p2";
                name9Doll_3 = connectLink_of_advanced + "_p3";
                name9Doll_4 = connectLink_of_advanced + "_p4";
                name9Doll_5 = connectLink_of_advanced + "_p5";
                if (MainActivity.mapView.containsKey(name9Doll_2)) onButtonVisible9doll_2 = true;
                if (MainActivity.mapView.containsKey(name9Doll_3)) onButtonVisible9doll_3 = true;
                if (MainActivity.mapView.containsKey(name9Doll_4)) onButtonVisible9doll_4 = true;
                if (MainActivity.mapView.containsKey(name9Doll_5)) onButtonVisible9doll_5 = true;
                break;
                case R.id.id_Bumblemee:
                intent = new Intent(this, Activity_moveToWatch.class);
                intent.putExtra("intent", R.mipmap.bumblemee);
                startActivity(intent);
                connectLink_of_advanced = "Bumblemee";
                boostylink9Doll = connectLink_of_advanced + "_Boosty";
                name9Doll_2 = connectLink_of_advanced + "_p2";
                name9Doll_3 = connectLink_of_advanced + "_p3";
                name9Doll_4 = connectLink_of_advanced + "_p4";
                if (MainActivity.mapView.containsKey(name9Doll_2)) onButtonVisible9doll_2 = true;
                if (MainActivity.mapView.containsKey(name9Doll_3)) onButtonVisible9doll_3 = true;
                if (MainActivity.mapView.containsKey(name9Doll_4)) onButtonVisible9doll_4 = true;
                break;
            case R.id.id_Leopard:
                intent = new Intent(this, Activity_moveToWatch.class);
                intent.putExtra("intent", R.mipmap.leopard);
                startActivity(intent);
                connectLink_of_advanced = "Leopard";
                boostylink9Doll = connectLink_of_advanced + "_Boosty";
                name9Doll_2 = connectLink_of_advanced + "_p2";
                name9Doll_3 = connectLink_of_advanced + "_p3";
                name9Doll_4 = connectLink_of_advanced + "_p4";
                name9Doll_5 = connectLink_of_advanced + "_p5";
                name9Doll_6 = connectLink_of_advanced + "_p6";
                name9Doll_7 = connectLink_of_advanced + "_p7";
                if (MainActivity.mapView.containsKey(name9Doll_2)) onButtonVisible9doll_2 = true;
                if (MainActivity.mapView.containsKey(name9Doll_3)) onButtonVisible9doll_3 = true;
                if (MainActivity.mapView.containsKey(name9Doll_4)) onButtonVisible9doll_4 = true;
                if (MainActivity.mapView.containsKey(name9Doll_5)) onButtonVisible9doll_5 = true;
                if (MainActivity.mapView.containsKey(name9Doll_6)) onButtonVisible9doll_6 = true;
                if (MainActivity.mapView.containsKey(name9Doll_7)) onButtonVisible9doll_7 = true;
                break;
            case R.id.id_Horse:
                intent = new Intent(this, Activity_moveToWatch.class);
                intent.putExtra("intent", R.mipmap.horse);
                startActivity(intent);
                connectLink_of_advanced = "Horse";
                boostylink9Doll = connectLink_of_advanced + "_Boosty";
                name9Doll_2 = connectLink_of_advanced + "_p2";
                name9Doll_3 = connectLink_of_advanced + "_p3";
                name9Doll_4 = connectLink_of_advanced + "_p4";
                name9Doll_5 = connectLink_of_advanced + "_p5";
                name9Doll_6 = connectLink_of_advanced + "_p6";
                if (MainActivity.mapView.containsKey(name9Doll_2)) onButtonVisible9doll_2 = true;
                if (MainActivity.mapView.containsKey(name9Doll_3)) onButtonVisible9doll_3 = true;
                if (MainActivity.mapView.containsKey(name9Doll_4)) onButtonVisible9doll_4 = true;
                if (MainActivity.mapView.containsKey(name9Doll_5)) onButtonVisible9doll_5 = true;
                if (MainActivity.mapView.containsKey(name9Doll_6)) onButtonVisible9doll_6 = true;
                break;
            case R.id.id_Blueberry:
                intent = new Intent(this, Activity_moveToWatch.class);
                intent.putExtra("intent", R.mipmap.blueberry);
                startActivity(intent);
                connectLink_of_advanced = "Blueberry";
                boostylink9Doll = connectLink_of_advanced + "_Boosty";
                name9Doll_2 = connectLink_of_advanced + "_p2";
                name9Doll_3 = connectLink_of_advanced + "_p3";
                name9Doll_4 = connectLink_of_advanced + "_p4";
                name9Doll_5 = connectLink_of_advanced + "_p5";
                if (MainActivity.mapView.containsKey(name9Doll_2)) onButtonVisible9doll_2 = true;
                if (MainActivity.mapView.containsKey(name9Doll_3)) onButtonVisible9doll_3 = true;
                if (MainActivity.mapView.containsKey(name9Doll_4)) onButtonVisible9doll_4 = true;
                if (MainActivity.mapView.containsKey(name9Doll_5)) onButtonVisible9doll_5 = true;
                break;
            case R.id.id_GoldenFish:
                intent = new Intent(this, Activity_moveToWatch.class);
                intent.putExtra("intent", R.mipmap.goldenfish);
                startActivity(intent);
                connectLink_of_advanced = "GoldenFish";
                boostylink9Doll = connectLink_of_advanced + "_Boosty";
                name9Doll_2 = connectLink_of_advanced + "_p2";
                name9Doll_3 = connectLink_of_advanced + "_p3";
                if (MainActivity.mapView.containsKey(name9Doll_2)) onButtonVisible9doll_2 = true;
                if (MainActivity.mapView.containsKey(name9Doll_3)) onButtonVisible9doll_3 = true;
                break;
            case R.id.id_Owl:
                intent = new Intent(this, Activity_moveToWatch.class);
                intent.putExtra("intent", R.mipmap.owl);
                startActivity(intent);
                connectLink_of_advanced = "Owl";
                boostylink9Doll = connectLink_of_advanced + "_Boosty";
                name9Doll_2 = connectLink_of_advanced + "_p2";
                name9Doll_3 = connectLink_of_advanced + "_p3";
                name9Doll_4 = connectLink_of_advanced + "_p4";
                name9Doll_5 = connectLink_of_advanced + "_p5";
                if (MainActivity.mapView.containsKey(name9Doll_2)) onButtonVisible9doll_2 = true;
                if (MainActivity.mapView.containsKey(name9Doll_3)) onButtonVisible9doll_3 = true;
                if (MainActivity.mapView.containsKey(name9Doll_4)) onButtonVisible9doll_4 = true;
                if (MainActivity.mapView.containsKey(name9Doll_5)) onButtonVisible9doll_5 = true;
                break;
            case R.id.id_Ametist:
                intent = new Intent(this, Activity_moveToWatch.class);
                intent.putExtra("intent", R.mipmap.amethyst);
                startActivity(intent);
                connectLink_of_advanced = "Ametist";
                boostylink9Doll = connectLink_of_advanced + "_Boosty";
                name9Doll_2 = connectLink_of_advanced + "_p2";
                name9Doll_3 = connectLink_of_advanced + "_p3";
                if (MainActivity.mapView.containsKey(name9Doll_2)) onButtonVisible9doll_2 = true;
                if (MainActivity.mapView.containsKey(name9Doll_3)) onButtonVisible9doll_3 = true;
                break;
            case R.id.id_Christmas:
                intent = new Intent(this, Activity_moveToWatch.class);
                intent.putExtra("intent", R.mipmap.christmas);
                startActivity(intent);
                connectLink_of_advanced = "Christmas";
                boostylink9Doll = connectLink_of_advanced + "_Boosty";
                name9Doll_2 = connectLink_of_advanced + "_p2";
                name9Doll_3 = connectLink_of_advanced + "_p3";
                name9Doll_4 = connectLink_of_advanced + "_p4";
                if (MainActivity.mapView.containsKey(name9Doll_2)) onButtonVisible9doll_2 = true;
                if (MainActivity.mapView.containsKey(name9Doll_3)) onButtonVisible9doll_3 = true;
                if (MainActivity.mapView.containsKey(name9Doll_4)) onButtonVisible9doll_4 = true;
                break;
            case R.id.id_Squirrel:
                intent = new Intent(this, Activity_moveToWatch.class);
                intent.putExtra("intent", R.mipmap.squirrel);
                startActivity(intent);
                connectLink_of_advanced = "Squirrel";
                boostylink9Doll = connectLink_of_advanced + "_Boosty";
                name9Doll_2 = connectLink_of_advanced + "_p2";
                name9Doll_3 = connectLink_of_advanced + "_p3";
                name9Doll_4 = connectLink_of_advanced + "_p4";
                name9Doll_5 = connectLink_of_advanced + "_p5";
                if (MainActivity.mapView.containsKey(name9Doll_2)) onButtonVisible9doll_2 = true;
                if (MainActivity.mapView.containsKey(name9Doll_3)) onButtonVisible9doll_3 = true;
                if (MainActivity.mapView.containsKey(name9Doll_4)) onButtonVisible9doll_4 = true;
                if (MainActivity.mapView.containsKey(name9Doll_5)) onButtonVisible9doll_5 = true;
                break;
            case R.id.id_Silverjug:
                intent = new Intent(this, Activity_moveToWatch.class);
                intent.putExtra("intent", R.mipmap.silverjug);
                startActivity(intent);
                connectLink_of_advanced = "Silverjug";
                boostylink9Doll = connectLink_of_advanced + "_Boosty";
                name9Doll_2 = connectLink_of_advanced + "_p2";
                name9Doll_3 = connectLink_of_advanced + "_p3";
                if (MainActivity.mapView.containsKey(name9Doll_2)) onButtonVisible9doll_2 = true;
                if (MainActivity.mapView.containsKey(name9Doll_3)) onButtonVisible9doll_3 = true;
                break;
            case R.id.id_Woodenmug:
                intent = new Intent(this, Activity_moveToWatch.class);
                intent.putExtra("intent", R.mipmap.woodenmug);
                startActivity(intent);
                connectLink_of_advanced = "Woodenmug";
                boostylink9Doll = connectLink_of_advanced + "_Boosty";
                name9Doll_2 = connectLink_of_advanced + "_p2";
                name9Doll_3 = connectLink_of_advanced + "_p3";
                name9Doll_4 = connectLink_of_advanced + "_p4";
                if (MainActivity.mapView.containsKey(name9Doll_2)) onButtonVisible9doll_2 = true;
                if (MainActivity.mapView.containsKey(name9Doll_3)) onButtonVisible9doll_3 = true;
                if (MainActivity.mapView.containsKey(name9Doll_4)) onButtonVisible9doll_4 = true;
                break;
            case R.id.id_Seaturtle:
                intent = new Intent(this, Activity_moveToWatch.class);
                intent.putExtra("intent", R.mipmap.seaturtle);
                startActivity(intent);
                connectLink_of_advanced = "Seaturtle";
                boostylink9Doll = connectLink_of_advanced + "_Boosty";
                name9Doll_2 = connectLink_of_advanced + "_p2";
                name9Doll_3 = connectLink_of_advanced + "_p3";
                name9Doll_4 = connectLink_of_advanced + "_p4";
                name9Doll_5 = connectLink_of_advanced + "_p5";
                name9Doll_6 = connectLink_of_advanced + "_p6";
                name9Doll_7 = connectLink_of_advanced + "_p7";
                if (MainActivity.mapView.containsKey(name9Doll_2)) onButtonVisible9doll_2 = true;
                if (MainActivity.mapView.containsKey(name9Doll_3)) onButtonVisible9doll_3 = true;
                if (MainActivity.mapView.containsKey(name9Doll_4)) onButtonVisible9doll_4 = true;
                if (MainActivity.mapView.containsKey(name9Doll_5)) onButtonVisible9doll_5 = true;
                if (MainActivity.mapView.containsKey(name9Doll_6)) onButtonVisible9doll_6 = true;
                if (MainActivity.mapView.containsKey(name9Doll_7)) onButtonVisible9doll_7 = true;
                break;
            case R.id.id_Tomat:
                intent = new Intent(this, Activity_moveToWatch.class);
                intent.putExtra("intent", R.mipmap.tomatoes);
                startActivity(intent);
                connectLink_of_advanced = "Tomatoes";
                boostylink9Doll = connectLink_of_advanced + "_Boosty";
                name9Doll_2 = connectLink_of_advanced + "_p2";
                name9Doll_3 = connectLink_of_advanced + "_p3";
                if (MainActivity.mapView.containsKey(name9Doll_2)) onButtonVisible9doll_2 = true;
                if (MainActivity.mapView.containsKey(name9Doll_3)) onButtonVisible9doll_3 = true;
                break;
            case R.id.id_GreyCat:
                intent = new Intent(this, Activity_moveToWatch.class);
                intent.putExtra("intent", R.mipmap.greycat);
                startActivity(intent);
                connectLink_of_advanced = "Greycat";
                boostylink9Doll = connectLink_of_advanced + "_Boosty";
                name9Doll_2 = connectLink_of_advanced + "_p2";
                if (MainActivity.mapView.containsKey(name9Doll_2)) onButtonVisible9doll_2 = true;
                break;
            default:
                Toast.makeText(this, "Не установленно!", Toast.LENGTH_LONG).show();
                break;
        }
    }
}
