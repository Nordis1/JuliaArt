package com.Julia_lessons.juliaomelart;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class Activity_6_Dollars extends AppCompatActivity implements View.OnClickListener {
    public static final String TAG = "Activity_6_Dollars";
    TextView textSize;
    TextView count_MK1;
    static String connectLink; // Имя рисунка
    static boolean part2, part3, part4, part5 = false;
    static boolean load_galery = false;
    String part22, part33, part44, part55; // Состав строки в одну и проверка на
    // вторую часть.
    ArrayList<Integer> reslist = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_6dollars);
        if (reslist.isEmpty()) {
            reslist.add(R.id.id_Sinichka);
            reslist.add(R.id.id_Sheet);
            reslist.add(R.id.id_Tea);
            reslist.add(R.id.id_Butterfly);
            reslist.add(R.id.id_Cherry);
            reslist.add(R.id.id_Mandarin);
            reslist.add(R.id.id_Pumpkin);
            reslist.add(R.id.id_Mushroom);
            reslist.add(R.id.id_Peach);
            reslist.add(R.id.id_Aiva);
            reslist.add(R.id.id_Lily);
            reslist.add(R.id.id_Lizard);
            reslist.add(R.id.id_Tropical_Fish);
            reslist.add(R.id.id_Bumblemee);
            reslist.add(R.id.id_Blueberry);
            reslist.add(R.id.id_GoldenFish);
            reslist.add(R.id.id_Ametist);
            reslist.add(R.id.id_Christmas);
            reslist.add(R.id.id_Silverjug);
            reslist.add(R.id.id_Cake);
            reslist.add(R.id.id_Woodenmug);
        }
        try {
            for (int i = 0; i < reslist.size(); i++) {
                ImageView v = findViewById(reslist.get(i));
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
        count_MK1 = findViewById(R.id.id_count_Of_MK_base);
        count_MK1.setText(String.valueOf(reslist.size()));
        part2 = false;
        part3 = false;
        part4 = false;
        part22 = null;
        part33 = null;
        part44 = null;
        connectLink = null;
        load_galery = false;

    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v,
                                    ContextMenu.ContextMenuInfo menuInfo) {
        switch (v.getId()) {
            case R.id.id_Sheet:
                getMenuInflater().inflate(R.menu.conrext_menu, menu);
                break;

        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        //getMenuInflater().inflate(R.menu.come_back,menu);
        //setTitle("lol");
        return super.onCreateOptionsMenu(menu);
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
    protected void onDestroy() {
        part2 = false;
        part3 = false;
        part4 = false;
        part5 = false;
        part22 = null;
        part33 = null;
        part44 = null;
        part55 = null;
        load_galery = false;
        super.onDestroy();
    }

    @Override
    public void onClick(View v) {
        part2 = false;
        part3 = false;
        part4 = false;
        part5 = false;
        part22 = null;
        part33 = null;
        part44 = null;
        part55 = null;
        load_galery = true;
        Intent intent;
        switch (v.getId()) {
            case R.id.id_Sheet:
                intent = new Intent(this, Activity_moveToWatch.class);
                intent.putExtra("intent", R.mipmap.sheet);
                connectLink = "Sheet";
                startActivity(intent);
                break;
            case R.id.id_Tea:
                intent = new Intent(this, Activity_moveToWatch.class);
                intent.putExtra("intent", R.mipmap.tea);
                startActivity(intent);
                connectLink = "Tea";
                part22 = connectLink + "_p2";
                if (MainActivity.mapView.containsKey(part22)) part2 = true;
                break;
            case R.id.id_Peach:
                intent = new Intent(this, Activity_moveToWatch.class);
                intent.putExtra("intent", R.mipmap.peach);
                startActivity(intent);
                connectLink = "Peach";
                part22 = connectLink + "_p2";
                if (MainActivity.mapView.containsKey(part22)) part2 = true;
                break;
            case R.id.id_Mandarin:
                intent = new Intent(this, Activity_moveToWatch.class);
                intent.putExtra("intent", R.mipmap.mandarin);
                startActivity(intent);
                connectLink = "Mandarin";
                break;
            case R.id.id_Sinichka:
                intent = new Intent(this, Activity_moveToWatch.class);
                intent.putExtra("intent", R.mipmap.sinichka);
                startActivity(intent);
                connectLink = "Sinichka";
                part22 = connectLink + "_p2";
                if (MainActivity.mapView.containsKey(part22)) part2 = true;
                break;
            case R.id.id_Mushroom:
                intent = new Intent(this, Activity_moveToWatch.class);
                intent.putExtra("intent", R.mipmap.mushroom);
                startActivity(intent);
                connectLink = "Mushroom";
                break;
            case R.id.id_Butterfly:
                intent = new Intent(this, Activity_moveToWatch.class);
                intent.putExtra("intent", R.mipmap.butterfly);
                startActivity(intent);
                connectLink = "Butterfly";
                break;
            case R.id.id_Pumpkin:
                intent = new Intent(this, Activity_moveToWatch.class);
                intent.putExtra("intent", R.mipmap.pumpkin);
                startActivity(intent);
                connectLink = "Pumpkin";
                break;
            case R.id.id_Cherry:
                intent = new Intent(this, Activity_moveToWatch.class);
                intent.putExtra("intent", R.mipmap.cherry);
                startActivity(intent);
                connectLink = "Cherry";
                break;
            case R.id.id_Aiva:
                intent = new Intent(this, Activity_moveToWatch.class);
                intent.putExtra("intent", R.mipmap.aiva);
                startActivity(intent);
                connectLink = "Aiva";
                break;
            case R.id.id_Lily:
                intent = new Intent(this, Activity_moveToWatch.class);
                intent.putExtra("intent", R.mipmap.lily);
                startActivity(intent);
                connectLink = "Lily";
                part22 = connectLink + "_p2";
                if (MainActivity.mapView.containsKey(part22)) part2 = true;
                break;
            case R.id.id_Lizard:
                intent = new Intent(this, Activity_moveToWatch.class);
                intent.putExtra("intent", R.mipmap.lizard);
                startActivity(intent);
                connectLink = "Lizard";
                part22 = connectLink + "_p2";
                part33 = connectLink + "_p3";
                if (MainActivity.mapView.containsKey(part22)) part2 = true;
                if (MainActivity.mapView.containsKey(part33)) part3 = true;
                break;
            case R.id.id_Tropical_Fish:
                intent = new Intent(this, Activity_moveToWatch.class);
                intent.putExtra("intent", R.mipmap.tropical_fish);
                startActivity(intent);
                connectLink = "Tropical_Fish";
                part22 = connectLink + "_p2";
                part33 = connectLink + "_p3";
                if (MainActivity.mapView.containsKey(part22)) part2 = true;
                if (MainActivity.mapView.containsKey(part33)) part3 = true;
                break;
            case R.id.id_Bumblemee:
                intent = new Intent(this, Activity_moveToWatch.class);
                intent.putExtra("intent", R.mipmap.bumblemee);
                startActivity(intent);
                connectLink = "Bumblemee";
                part22 = connectLink + "_p2";
                part33 = connectLink + "_p3";
                part44 = connectLink + "_p4";
                if (MainActivity.mapView.containsKey(part22)) part2 = true;
                if (MainActivity.mapView.containsKey(part33)) part3 = true;
                if (MainActivity.mapView.containsKey(part44)) part4 = true;
                break;
            case R.id.id_Blueberry:
                intent = new Intent(this, Activity_moveToWatch.class);
                intent.putExtra("intent", R.mipmap.blueberry);
                startActivity(intent);
                connectLink = "Blueberry";
                part22 = connectLink + "_p2";
                part33 = connectLink + "_p3";
                part44 = connectLink + "_p4";
                part55 = connectLink + "_p5";
                if (MainActivity.mapView.containsKey(part22)) part2 = true;
                if (MainActivity.mapView.containsKey(part33)) part3 = true;
                if (MainActivity.mapView.containsKey(part44)) part4 = true;
                if (MainActivity.mapView.containsKey(part55)) part5 = true;
                break;
            case R.id.id_GoldenFish:
                intent = new Intent(this, Activity_moveToWatch.class);
                intent.putExtra("intent", R.mipmap.goldenfish);
                startActivity(intent);
                connectLink = "GoldenFish";
                part22 = connectLink + "_p2";
                part33 = connectLink + "_p3";
                if (MainActivity.mapView.containsKey(part22)) part2 = true;
                if (MainActivity.mapView.containsKey(part33)) part3 = true;
                break;
            case R.id.id_Ametist:
                intent = new Intent(this, Activity_moveToWatch.class);
                intent.putExtra("intent", R.mipmap.amethyst);
                startActivity(intent);
                connectLink = "Ametist";
                part22 = connectLink + "_p2";
                part33 = connectLink + "_p3";
                if (MainActivity.mapView.containsKey(part22)) part2 = true;
                if (MainActivity.mapView.containsKey(part33)) part3 = true;
                break;
            case R.id.id_Cake:
                intent = new Intent(this, Activity_moveToWatch.class);
                intent.putExtra("intent", R.mipmap.cake);
                startActivity(intent);
                connectLink = "Cake";
                part22 = connectLink + "_p2";
                part33 = connectLink + "_p3";
                if (MainActivity.mapView.containsKey(part22)) part2 = true;
                if (MainActivity.mapView.containsKey(part33)) part3 = true;
                break;
            case R.id.id_Christmas:
                intent = new Intent(this, Activity_moveToWatch.class);
                intent.putExtra("intent", R.mipmap.christmas);
                startActivity(intent);
                connectLink = "Christmas";
                part22 = connectLink + "_p2";
                part33 = connectLink + "_p3";
                part44 = connectLink + "_p4";
                if (MainActivity.mapView.containsKey(part22)) part2 = true;
                if (MainActivity.mapView.containsKey(part33)) part3 = true;
                if (MainActivity.mapView.containsKey(part44)) part4 = true;
                break;
            case R.id.id_Silverjug:
                intent = new Intent(this, Activity_moveToWatch.class);
                intent.putExtra("intent", R.mipmap.silverjug);
                startActivity(intent);
                connectLink = "Silverjug";
                part22 = connectLink + "_p2";
                part33 = connectLink + "_p3";
                if (MainActivity.mapView.containsKey(part22)) part2 = true;
                if (MainActivity.mapView.containsKey(part33)) part3 = true;
                break;
            case R.id.id_Woodenmug:
                intent = new Intent(this, Activity_moveToWatch.class);
                intent.putExtra("intent", R.mipmap.woodenmug);
                startActivity(intent);
                connectLink = "Woodenmug";
                part22 = connectLink + "_p2";
                part33 = connectLink + "_p3";
                part44 = connectLink + "_p4";
                if (MainActivity.mapView.containsKey(part22)) part2 = true;
                if (MainActivity.mapView.containsKey(part33)) part3 = true;
                if (MainActivity.mapView.containsKey(part44)) part4 = true;
                break;
            default:
                Toast.makeText(this, "Не установленно!", Toast.LENGTH_LONG).show();
                break;
        }
    }
}
