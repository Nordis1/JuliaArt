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

public class Activity_Galery extends AppCompatActivity implements View.OnClickListener {
    public static final String TAG = "Activity_Galery";
    TextView textSize;
    TextView count_MK1;
    static String connectLink; // Имя рисунка
    static boolean part2, part3 = false;
    static boolean load_galery = false;
    String part22, part33; // Состав строки в одну и проверка на вторую часть.
    ArrayList<Integer> reslist = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__galery);
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
        }
        for (int i = 0; i < reslist.size() ; i++) {
            ImageView v = findViewById(reslist.get(i));
            v.setOnClickListener(this);
            if (i == 1){
                registerForContextMenu(v);

            }
        }
        textSize = findViewById(R.id.id_textSize);
        count_MK1 = findViewById(R.id.id_count_Of_MK_base);
        count_MK1.setText(String.valueOf(reslist.size()));
        part2 = false;
        part3 = false;
        part22 = null;
        part33 = null;
        connectLink = null;
        load_galery = false;

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
        load_galery =  false;
        super.onDestroy();
    }

    @Override
    public void onClick(View v) {
        load_galery = true;
        Intent intent;
        part2 = false;
        part3 = false;
        switch (v.getId()) {
            case R.id.id_Sheet:
                intent = new Intent(this, Descript_activity.class);
                intent.putExtra("intent", R.mipmap.sheet);
                connectLink = "Sheet";
                startActivity(intent);
                break;
            case R.id.id_Tea:
                intent = new Intent(this, Descript_activity.class);
                intent.putExtra("intent", R.mipmap.tea);
                startActivity(intent);
                connectLink = "Tea";
                part22 = connectLink + "_p2";
                if (MainActivity.mapView.containsKey(part22)) part2 = true;
                break;
            case R.id.id_Peach:
                intent = new Intent(this, Descript_activity.class);
                intent.putExtra("intent", R.mipmap.peach);
                startActivity(intent);
                connectLink = "Peach";
                part22 = connectLink + "_p2";
                if (MainActivity.mapView.containsKey(part22)) part2 = true;
                break;
            case R.id.id_Mandarin:
                intent = new Intent(this, Descript_activity.class);
                intent.putExtra("intent", R.mipmap.mandarin);
                startActivity(intent);
                connectLink = "Mandarin";
                break;
            case R.id.id_Sinichka:
                intent = new Intent(this, Descript_activity.class);
                intent.putExtra("intent", R.mipmap.sinichka);
                startActivity(intent);
                connectLink = "Sinichka";
                part22 = connectLink + "_p2";
                if (MainActivity.mapView.containsKey(part22)) part2 = true;
                break;
            case R.id.id_Mushroom:
                intent = new Intent(this, Descript_activity.class);
                intent.putExtra("intent", R.mipmap.mushroom);
                startActivity(intent);
                connectLink = "Mushroom";
                break;
            case R.id.id_Butterfly:
                intent = new Intent(this, Descript_activity.class);
                intent.putExtra("intent", R.mipmap.butterfly);
                startActivity(intent);
                connectLink = "Butterfly";
                break;
            case R.id.id_Pumpkin:
                intent = new Intent(this, Descript_activity.class);
                intent.putExtra("intent", R.mipmap.pumpkin);
                startActivity(intent);
                connectLink = "Pumpkin";
                break;
            case R.id.id_Cherry:
                intent = new Intent(this, Descript_activity.class);
                intent.putExtra("intent", R.mipmap.cherry);
                startActivity(intent);
                connectLink = "Cherry";
                break;
            default:
                Toast.makeText(this, "Не установленно!", Toast.LENGTH_LONG).show();
                break;
        }
    }
}
