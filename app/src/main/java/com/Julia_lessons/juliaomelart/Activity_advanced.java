package com.Julia_lessons.juliaomelart;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class Activity_advanced extends AppCompatActivity implements View.OnClickListener {
    TextView textSize;
    TextView count_MK;
    static String connectLink_of_advanced; // Имя рисунка
    static boolean part2, part3 = false;
    String part22, part33; // Состав строки в одну и проверка на вторую часть.
    ArrayList<Integer> reslist1 = new ArrayList<>();
    public static final String TAG = "Activity_Advanced";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_advanced);
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
        }
        for (int i = 0; i < reslist1.size() ; i++) {
            ImageView v = findViewById(reslist1.get(i));
            v.setOnClickListener(this);
            if (i == 1){
                registerForContextMenu(v);

            }
        }
        textSize = findViewById(R.id.id_textSize);
        count_MK = findViewById(R.id.id_count_Of_MK);
        count_MK.setText(String.valueOf(reslist1.size()));
        part2 = false;
        part3 = false;
        part22 = null;
        part33 = null;
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
        Intent intent;
        part2 = false;
        part3 = false;
        part22 = null;
        part33 = null;
        switch (v.getId()) {
            case R.id.id_Sheet:
                intent = new Intent(this, Descript_activity.class);
                intent.putExtra("intent", R.mipmap.sheet);
                connectLink_of_advanced = "Sheet";
                startActivity(intent);
                break;
            case R.id.id_Smile:
                intent = new Intent(this, Descript_activity.class);
                intent.putExtra("intent", R.mipmap.smile);
                startActivity(intent);
                connectLink_of_advanced = "Smile";
                part22 = connectLink_of_advanced + "_p2";
                if (MainActivity.mapView.containsKey(part22)) part2 = true;
                break;
            case R.id.id_Beetle:
                intent = new Intent(this, Descript_activity.class);
                intent.putExtra("intent", R.mipmap.beetle);
                startActivity(intent);
                connectLink_of_advanced = "Beetle";
                part22 = connectLink_of_advanced + "_p2";
                part33 = connectLink_of_advanced + "_p3";
                if (MainActivity.mapView.containsKey(part22)) part2 = true;
                if (MainActivity.mapView.containsKey(part33)) part3 = true;
                break;
            case R.id.id_Tea:
                intent = new Intent(this, Descript_activity.class);
                intent.putExtra("intent", R.mipmap.tea);
                startActivity(intent);
                connectLink_of_advanced = "Tea";
                part22 = connectLink_of_advanced + "_p2";
                if (MainActivity.mapView.containsKey(part22)) part2 = true;
                break;
            case R.id.id_Eyes:
                intent = new Intent(this, Descript_activity.class);
                intent.putExtra("intent", R.mipmap.eye);
                startActivity(intent);
                connectLink_of_advanced = "Eyes";
                break;
            case R.id.id_Peach:
                intent = new Intent(this, Descript_activity.class);
                intent.putExtra("intent", R.mipmap.peach);
                startActivity(intent);
                connectLink_of_advanced = "Peach";
                part22 = connectLink_of_advanced + "_p2";
                if (MainActivity.mapView.containsKey(part22)) part2 = true;
                break;
            case R.id.id_Mandarin:
                intent = new Intent(this, Descript_activity.class);
                intent.putExtra("intent", R.mipmap.mandarin);
                startActivity(intent);
                connectLink_of_advanced = "Mandarin";
                break;
            case R.id.id_Sinichka:
                intent = new Intent(this, Descript_activity.class);
                intent.putExtra("intent", R.mipmap.sinichka);
                startActivity(intent);
                connectLink_of_advanced = "Sinichka";
                part22 = connectLink_of_advanced + "_p2";
                if (MainActivity.mapView.containsKey(part22)) part2 = true;
                break;
            case R.id.id_Cat:
                intent = new Intent(this, Descript_activity.class);
                intent.putExtra("intent", R.mipmap.cat);
                startActivity(intent);
                connectLink_of_advanced = "Cat";
                part22 = connectLink_of_advanced + "_p2";
                if (MainActivity.mapView.containsKey(part22)) part2 = true;
                break;
            case R.id.id_Tigr:
                intent = new Intent(this, Descript_activity.class);
                intent.putExtra("intent", R.mipmap.tigr);
                startActivity(intent);
                connectLink_of_advanced = "Tigr";
                part22 = connectLink_of_advanced + "_p2";
                if (MainActivity.mapView.containsKey(part22)) part2 = true;
                break;
            case R.id.id_Mushroom:
                intent = new Intent(this, Descript_activity.class);
                intent.putExtra("intent", R.mipmap.mushroom);
                startActivity(intent);
                connectLink_of_advanced = "Mushroom";
                break;
            case R.id.id_Butterfly:
                intent = new Intent(this, Descript_activity.class);
                intent.putExtra("intent", R.mipmap.butterfly);
                startActivity(intent);
                connectLink_of_advanced = "Butterfly";
                break;
            case R.id.id_Pumpkin:
                intent = new Intent(this, Descript_activity.class);
                intent.putExtra("intent", R.mipmap.pumpkin);
                startActivity(intent);
                connectLink_of_advanced = "Pumpkin";
                break;
            case R.id.id_Cherry:
                intent = new Intent(this, Descript_activity.class);
                intent.putExtra("intent", R.mipmap.cherry);
                startActivity(intent);
                connectLink_of_advanced = "Cherry";
                break;
            default:
                Toast.makeText(this, "Не установленно!", Toast.LENGTH_LONG).show();
                break;
        }
    }
}
