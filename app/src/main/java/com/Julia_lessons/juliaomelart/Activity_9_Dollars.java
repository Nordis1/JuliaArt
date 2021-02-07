package com.Julia_lessons.juliaomelart;

import androidx.appcompat.app.AppCompatActivity;

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
    static String connectLink_of_advanced; // Имя рисунка
    static  boolean part2, part3, part4,part5, part6,part7 = false;
    String part22, part33,part44,part55,part66,part77; // Состав строки в одну и проверка на вторую часть.
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
        }
        for (int i = 0; i < reslist1.size(); i++) {
            ImageView v = findViewById(reslist1.get(i));
            v.setOnClickListener(this);
            if (i == 1) {
                registerForContextMenu(v);

            }
        }
        textSize = findViewById(R.id.id_textSize);
        count_MK = findViewById(R.id.id_count_Of_MK);
        count_MK.setText(String.valueOf(reslist1.size()));
        part2 = false;
        part3 = false;
        part4 = false;
        part5 = false;
        part6 = false;
        part7 = false;
        part22 = null;
        part33 = null;
        part44 = null;
        part55 = null;
        part66 = null;
        part77 = null;
        connectLink_of_advanced = null;

    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        switch (v.getId()) {
            case R.id.id_Sheet:
                getMenuInflater().inflate(R.menu.conrext_menu, menu);
                break;
        }
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.id_context_menu:
                Toast.makeText(this, "Size = " + textSize.getText(), Toast.LENGTH_LONG).show();
                break;
        }
        return super.onContextItemSelected(item);
    }

    @Override
    public void onClick(View v) {
        part2 = false;
        part3 = false;
        part4 = false;
        part5 = false;
        part6 = false;
        part7 = false;
        part22 = null;
        part33 = null;
        part44 = null;
        part55 = null;
        part66 = null;
        part77 = null;
        Intent intent;
        switch (v.getId()) {
            case R.id.id_Sheet:
                intent = new Intent(this, Activity_moveToWatch.class);
                intent.putExtra("intent", R.mipmap.sheet);
                connectLink_of_advanced = "Sheet";
                startActivity(intent);
                break;
            case R.id.id_Smile:
                intent = new Intent(this, Activity_moveToWatch.class);
                intent.putExtra("intent", R.mipmap.smile);
                startActivity(intent);
                connectLink_of_advanced = "Smile";
                part22 = connectLink_of_advanced + "_p2";
                if (MainActivity.mapView.containsKey(part22)) part2 = true;
                break;
            case R.id.id_Beetle:
                intent = new Intent(this, Activity_moveToWatch.class);
                intent.putExtra("intent", R.mipmap.beetle);
                startActivity(intent);
                connectLink_of_advanced = "Beetle";
                part22 = connectLink_of_advanced + "_p2";
                part33 = connectLink_of_advanced + "_p3";
                if (MainActivity.mapView.containsKey(part22)) part2 = true;
                if (MainActivity.mapView.containsKey(part33)) part3 = true;
                break;
            case R.id.id_Tea:
                intent = new Intent(this, Activity_moveToWatch.class);
                intent.putExtra("intent", R.mipmap.tea);
                startActivity(intent);
                connectLink_of_advanced = "Tea";
                part22 = connectLink_of_advanced + "_p2";
                if (MainActivity.mapView.containsKey(part22)) part2 = true;
                break;
            case R.id.id_Eyes:
                intent = new Intent(this, Activity_moveToWatch.class);
                intent.putExtra("intent", R.mipmap.eye);
                startActivity(intent);
                connectLink_of_advanced = "Eyes";
                break;
            case R.id.id_Peach:
                intent = new Intent(this, Activity_moveToWatch.class);
                intent.putExtra("intent", R.mipmap.peach);
                startActivity(intent);
                connectLink_of_advanced = "Peach";
                part22 = connectLink_of_advanced + "_p2";
                if (MainActivity.mapView.containsKey(part22)) part2 = true;
                break;
            case R.id.id_Mandarin:
                intent = new Intent(this, Activity_moveToWatch.class);
                intent.putExtra("intent", R.mipmap.mandarin);
                startActivity(intent);
                connectLink_of_advanced = "Mandarin";
                break;
            case R.id.id_Sinichka:
                intent = new Intent(this, Activity_moveToWatch.class);
                intent.putExtra("intent", R.mipmap.sinichka);
                startActivity(intent);
                connectLink_of_advanced = "Sinichka";
                part22 = connectLink_of_advanced + "_p2";
                if (MainActivity.mapView.containsKey(part22)) part2 = true;
                break;
            case R.id.id_Cat:
                intent = new Intent(this, Activity_moveToWatch.class);
                intent.putExtra("intent", R.mipmap.cat);
                startActivity(intent);
                connectLink_of_advanced = "Cat";
                part22 = connectLink_of_advanced + "_p2";
                if (MainActivity.mapView.containsKey(part22)) part2 = true;
                break;
            case R.id.id_Tigr:
                intent = new Intent(this, Activity_moveToWatch.class);
                intent.putExtra("intent", R.mipmap.tigr);
                startActivity(intent);
                connectLink_of_advanced = "Tigr";
                part22 = connectLink_of_advanced + "_p2";
                if (MainActivity.mapView.containsKey(part22)) part2 = true;
                break;
            case R.id.id_Mushroom:
                intent = new Intent(this, Activity_moveToWatch.class);
                intent.putExtra("intent", R.mipmap.mushroom);
                startActivity(intent);
                connectLink_of_advanced = "Mushroom";
                break;
            case R.id.id_Butterfly:
                intent = new Intent(this, Activity_moveToWatch.class);
                intent.putExtra("intent", R.mipmap.butterfly);
                startActivity(intent);
                connectLink_of_advanced = "Butterfly";
                break;
            case R.id.id_Pumpkin:
                intent = new Intent(this, Activity_moveToWatch.class);
                intent.putExtra("intent", R.mipmap.pumpkin);
                startActivity(intent);
                connectLink_of_advanced = "Pumpkin";
                break;
            case R.id.id_Cherry:
                intent = new Intent(this, Activity_moveToWatch.class);
                intent.putExtra("intent", R.mipmap.cherry);
                startActivity(intent);
                connectLink_of_advanced = "Cherry";
                break;
            case R.id.id_Frog:
                intent = new Intent(this, Activity_moveToWatch.class);
                intent.putExtra("intent", R.mipmap.frog);
                startActivity(intent);
                connectLink_of_advanced = "Frog";
                part22 = connectLink_of_advanced + "_p2";
                if (MainActivity.mapView.containsKey(part22)) part2 = true;
                break;
            case R.id.id_Aiva:
                intent = new Intent(this, Activity_moveToWatch.class);
                intent.putExtra("intent", R.mipmap.aiva);
                startActivity(intent);
                connectLink_of_advanced = "Aiva";
                break;
            case R.id.id_Lily:
                intent = new Intent(this, Activity_moveToWatch.class);
                intent.putExtra("intent", R.mipmap.lily);
                startActivity(intent);
                connectLink_of_advanced = "Lily";
                part22 = connectLink_of_advanced + "_p2";
                if (MainActivity.mapView.containsKey(part22)) part2 = true;
                break;
            case R.id.id_Child:
                intent = new Intent(this, Activity_moveToWatch.class);
                intent.putExtra("intent", R.mipmap.child);
                startActivity(intent);
                connectLink_of_advanced = "Child";
                part22 = connectLink_of_advanced + "_p2";
                part33 = connectLink_of_advanced + "_p3";
                if (MainActivity.mapView.containsKey(part22)) part2 = true;
                if (MainActivity.mapView.containsKey(part33)) part3 = true;
                break;
            case R.id.id_Lizard:
                intent = new Intent(this, Activity_moveToWatch.class);
                intent.putExtra("intent", R.mipmap.lizard);
                startActivity(intent);
                connectLink_of_advanced = "Lizard";
                part22 = connectLink_of_advanced + "_p2";
                part33 = connectLink_of_advanced + "_p3";
                if (MainActivity.mapView.containsKey(part22)) part2 = true;
                if (MainActivity.mapView.containsKey(part33)) part3 = true;
                break;
            case R.id.id_Dog:
                intent = new Intent(this, Activity_moveToWatch.class);
                intent.putExtra("intent", R.mipmap.dog);
                startActivity(intent);
                connectLink_of_advanced = "Dog";
                part22 = connectLink_of_advanced + "_p2";
                part33 = connectLink_of_advanced + "_p3";
                part44 = connectLink_of_advanced + "_p4";
                if (MainActivity.mapView.containsKey(part22)) part2 = true;
                if (MainActivity.mapView.containsKey(part33)) part3 = true;
                if (MainActivity.mapView.containsKey(part44)) part4 = true;
                break;
            case R.id.id_Tropical_Fish:
                intent = new Intent(this, Activity_moveToWatch.class);
                intent.putExtra("intent", R.mipmap.tropical_fish);
                startActivity(intent);
                connectLink_of_advanced = "Tropical_Fish";
                part22 = connectLink_of_advanced + "_p2";
                part33 = connectLink_of_advanced + "_p3";
                if (MainActivity.mapView.containsKey(part22)) part2 = true;
                if (MainActivity.mapView.containsKey(part33)) part3 = true;
                break;
            case R.id.id_Cloudlandscape:
                intent = new Intent(this, Activity_moveToWatch.class);
                intent.putExtra("intent", R.mipmap.cloudlandscape);
                startActivity(intent);
                connectLink_of_advanced = "Cloudlandscape";
                part22 = connectLink_of_advanced + "_p2";
                part33 = connectLink_of_advanced + "_p3";
                part44 = connectLink_of_advanced + "_p4";
                part55 = connectLink_of_advanced + "_p5";
                if (MainActivity.mapView.containsKey(part22)) part2 = true;
                if (MainActivity.mapView.containsKey(part33)) part3 = true;
                if (MainActivity.mapView.containsKey(part44)) part4 = true;
                if (MainActivity.mapView.containsKey(part55)) part5 = true;
                break;
                case R.id.id_Bumblemee:
                intent = new Intent(this, Activity_moveToWatch.class);
                intent.putExtra("intent", R.mipmap.bumblemee);
                startActivity(intent);
                connectLink_of_advanced = "Bumblemee";
                part22 = connectLink_of_advanced + "_p2";
                part33 = connectLink_of_advanced + "_p3";
                part44 = connectLink_of_advanced + "_p4";
                if (MainActivity.mapView.containsKey(part22)) part2 = true;
                if (MainActivity.mapView.containsKey(part33)) part3 = true;
                if (MainActivity.mapView.containsKey(part44)) part4 = true;
                break;
            case R.id.id_Leopard:
                intent = new Intent(this, Activity_moveToWatch.class);
                intent.putExtra("intent", R.mipmap.leopard);
                startActivity(intent);
                connectLink_of_advanced = "Leopard";
                part22 = connectLink_of_advanced + "_p2";
                part33 = connectLink_of_advanced + "_p3";
                part44 = connectLink_of_advanced + "_p4";
                part55 = connectLink_of_advanced + "_p5";
                part66 = connectLink_of_advanced + "_p6";
                part77 = connectLink_of_advanced + "_p7";
                if (MainActivity.mapView.containsKey(part22)) part2 = true;
                if (MainActivity.mapView.containsKey(part33)) part3 = true;
                if (MainActivity.mapView.containsKey(part44)) part4 = true;
                if (MainActivity.mapView.containsKey(part55)) part5 = true;
                if (MainActivity.mapView.containsKey(part66)) part6 = true;
                if (MainActivity.mapView.containsKey(part77)) part7 = true;
                break;
            case R.id.id_Blueberry:
                intent = new Intent(this, Activity_moveToWatch.class);
                intent.putExtra("intent", R.mipmap.blueberry);
                startActivity(intent);
                connectLink_of_advanced = "Blueberry";
                part22 = connectLink_of_advanced + "_p2";
                part33 = connectLink_of_advanced + "_p3";
                part44 = connectLink_of_advanced + "_p4";
                part55 = connectLink_of_advanced + "_p5";
                if (MainActivity.mapView.containsKey(part22)) part2 = true;
                if (MainActivity.mapView.containsKey(part33)) part3 = true;
                if (MainActivity.mapView.containsKey(part44)) part4 = true;
                if (MainActivity.mapView.containsKey(part55)) part5 = true;
                break;
            case R.id.id_GoldenFish:
                intent = new Intent(this, Activity_moveToWatch.class);
                intent.putExtra("intent", R.mipmap.goldenfish);
                startActivity(intent);
                connectLink_of_advanced = "GoldenFish";
                part22 = connectLink_of_advanced + "_p2";
                part33 = connectLink_of_advanced + "_p3";
                if (MainActivity.mapView.containsKey(part22)) part2 = true;
                if (MainActivity.mapView.containsKey(part33)) part3 = true;
                break;
            case R.id.id_Owl:
                intent = new Intent(this, Activity_moveToWatch.class);
                intent.putExtra("intent", R.mipmap.owl);
                startActivity(intent);
                connectLink_of_advanced = "Owl";
                part22 = connectLink_of_advanced + "_p2";
                part33 = connectLink_of_advanced + "_p3";
                part44 = connectLink_of_advanced + "_p4";
                part55 = connectLink_of_advanced + "_p5";
                if (MainActivity.mapView.containsKey(part22)) part2 = true;
                if (MainActivity.mapView.containsKey(part33)) part3 = true;
                if (MainActivity.mapView.containsKey(part44)) part4 = true;
                if (MainActivity.mapView.containsKey(part55)) part5 = true;
                break;
            case R.id.id_Ametist:
                intent = new Intent(this, Activity_moveToWatch.class);
                intent.putExtra("intent", R.mipmap.amethyst);
                startActivity(intent);
                connectLink_of_advanced = "Ametist";
                part22 = connectLink_of_advanced + "_p2";
                part33 = connectLink_of_advanced + "_p3";
                if (MainActivity.mapView.containsKey(part22)) part2 = true;
                if (MainActivity.mapView.containsKey(part33)) part3 = true;
                break;
            case R.id.id_Christmas:
                intent = new Intent(this, Activity_moveToWatch.class);
                intent.putExtra("intent", R.mipmap.christmas);
                startActivity(intent);
                connectLink_of_advanced = "Christmas";
                part22 = connectLink_of_advanced + "_p2";
                part33 = connectLink_of_advanced + "_p3";
                part44 = connectLink_of_advanced + "_p4";
                if (MainActivity.mapView.containsKey(part22)) part2 = true;
                if (MainActivity.mapView.containsKey(part33)) part3 = true;
                if (MainActivity.mapView.containsKey(part44)) part4 = true;
                break;
            case R.id.id_Squirrel:
                intent = new Intent(this, Activity_moveToWatch.class);
                intent.putExtra("intent", R.mipmap.squirrel);
                startActivity(intent);
                connectLink_of_advanced = "Squirrel";
                part22 = connectLink_of_advanced + "_p2";
                part33 = connectLink_of_advanced + "_p3";
                part44 = connectLink_of_advanced + "_p4";
                part55 = connectLink_of_advanced + "_p5";
                if (MainActivity.mapView.containsKey(part22)) part2 = true;
                if (MainActivity.mapView.containsKey(part33)) part3 = true;
                if (MainActivity.mapView.containsKey(part44)) part4 = true;
                if (MainActivity.mapView.containsKey(part55)) part5 = true;
                break;
            default:
                Toast.makeText(this, "Не установленно!", Toast.LENGTH_LONG).show();
                break;
        }
    }
}
