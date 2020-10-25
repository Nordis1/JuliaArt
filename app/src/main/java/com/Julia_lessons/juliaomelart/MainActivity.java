package com.Julia_lessons.juliaomelart;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import com.google.android.material.navigation.NavigationView;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import android.view.Menu;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener, View.OnClickListener {
     public static HashMap<String, String> mapView = new HashMap<String,String>();

    NavigationView home;
    private AppBarConfiguration mAppBarConfiguration;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.drawer_panel);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        //mobile_navigatsion.xml  and activity_main_draiver  смотри там онинаковые id
        //mobile_navigatsion.xml - изменяет название кнопки на главном экране
        mAppBarConfiguration = new AppBarConfiguration.Builder(
                R.id.nav_home,R.id.nav_Art_materials,R.id.nav_list_Of_learn,R.id.nav_list_Of_learn_advance,
                R.id.nav_free_lesson, R.id.nav_youtube,R.id.nav_work_of_Student, R.id.nav_send)
                .setDrawerLayout(drawer)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.main_fragment);
        NavigationUI.setupActionBarWithNavController(this, navController, mAppBarConfiguration);
        NavigationUI.setupWithNavController(navigationView, navController);
        //home = findViewById(R.id.nav_home);
        navigationView.setNavigationItemSelectedListener(this);
        //NavigationUI.setupWithNavController(home,navController);
        if (mapView.isEmpty()){
            createMap();
        }
    }
    // конец onCreate

    public static void createMap() {
        // 1. Добавляем Элемент картинки.
        // 2. Закидываем ссылки на элемент сюда.
        // 3. Создаём в Activity_6_Dollars.xml новый view элемент.
        // 4. Регистрируем view в Activity_6_Dollars и регистрируем в Onclick внимательно(Там много элементов нужно заменить).
        // 5. Запускаем программу.
        // mapView(key,value) - key Всегда с большой буквы
        mapView.put("Sheet","https://www.patreon.com/posts/tsvetnye-risuem-29220651");

        mapView.put("Smile","https://www.patreon.com/posts/tsvetnye-ulybka-29262023");
        mapView.put("Smile_p2","https://www.patreon.com/posts/tsvetnye-ulybka-29380195");

        mapView.put("Beetle","https://www.patreon.com/posts/mk-zhuk-chast-1-30261579");
        mapView.put("Beetle_p2","https://www.patreon.com/posts/mk-zhuk-chast-2-30433600");
        mapView.put("Beetle_p3","https://www.patreon.com/posts/mk-zhuk-chast-3-30719903");

        mapView.put("Tea","https://www.patreon.com/posts/mk-chashka-chaia-30929768");
        mapView.put("Tea_p2","https://www.patreon.com/posts/mk-chashka-chaia-30975846");

        mapView.put("Eyes","https://www.patreon.com/posts/mk-glaz-31550571");

        mapView.put("Peach","https://www.patreon.com/posts/tsvetnye-chast-1-29430213");
        mapView.put("Peach_p2","https://www.patreon.com/posts/tsvetnye-chast-2-29561744");

        mapView.put("Mandarin","https://www.patreon.com/posts/mk-zapakhi-goda-32127170");

        mapView.put("Sinichka","https://www.patreon.com/posts/mk-sinichka-1-32299857");
        mapView.put("Sinichka_p2","https://www.patreon.com/posts/mk-sinichka-2-i-32398957");

        mapView.put("Cat"   ,"https://www.patreon.com/posts/mk-kotionok-1-32539008");
        mapView.put("Cat_p2","https://www.patreon.com/posts/mk-kotionok-2-32566937");

        mapView.put("Tigr"   ,"https://www.patreon.com/posts/mk-glaz-tigra-1-31747017");
        mapView.put("Tigr_p2","https://www.patreon.com/posts/mk-glaz-tigra-2-31901823");

        mapView.put("Mushroom","https://www.patreon.com/posts/mk-grib-borovik-31387084");

        mapView.put("Butterfly","https://www.patreon.com/posts/mk-babochka-na-31189002");

        mapView.put("Pumpkin","https://www.patreon.com/posts/mk-khellouin-30591129");

        mapView.put("Cherry","https://www.patreon.com/posts/mk-vishni-29231335");

        mapView.put("Frog"   ,"https://www.patreon.com/posts/mk-tropicheskaia-33197864");
        mapView.put("Frog_p2","https://www.patreon.com/posts/mk-tropicheskaia-33253277");

        mapView.put("Aiva","https://www.patreon.com/posts/mk-zhivopisnaia-33425163");

        mapView.put("Lily"   ,"https://www.patreon.com/posts/mk-volshebnye-1-33832369");
        mapView.put("Lily_p2","https://www.patreon.com/posts/mk-volshebnye-2-34020719");

        mapView.put("Child"   ,"https://www.patreon.com/posts/mk-portret-chast-34381382");
        mapView.put("Child_p2","https://www.patreon.com/posts/mk-portret-chast-34449497");
        mapView.put("Child_p3","https://www.patreon.com/posts/mk-portret-chast-34801309");

        mapView.put("Lizard"   ,"https://www.patreon.com/posts/mk-iashcheritsa-35107857");
        mapView.put("Lizard_p2","https://www.patreon.com/posts/mk-iashcheritsa-35319622");
        mapView.put("Lizard_p3","https://www.patreon.com/posts/mk-iashcheritsa-35663605");

        mapView.put("Dog"   ,"https://www.patreon.com/posts/mk-luchshii-drug-36093147");
        mapView.put("Dog_p2","https://www.patreon.com/posts/mk-luchshii-drug-36239737");
        mapView.put("Dog_p3","https://www.patreon.com/posts/mk-luchshii-drug-36306711");
        mapView.put("Dog_p4","https://www.patreon.com/posts/mk-luchshii-drug-37139533");

        mapView.put("Tropical_Fish"   ,"https://www.patreon.com/posts/mk-tropicheskaia-36453779");
        mapView.put("Tropical_Fish_p2","https://www.patreon.com/posts/mk-tropicheskaia-36846340");
        mapView.put("Tropical_Fish_p3","https://www.patreon.com/posts/mk-tropicheskaia-36926230");

        mapView.put("Cloudlandscape"   ,"https://www.patreon.com/posts/mk-peizazh-s-1-i-37578312");
        mapView.put("Cloudlandscape_p2","https://www.patreon.com/posts/mk-peizazh-s-2-i-37764801");
        mapView.put("Cloudlandscape_p3","https://www.patreon.com/posts/mk-peizazh-s-3-37846112");
        mapView.put("Cloudlandscape_p4","https://www.patreon.com/posts/mk-peizazh-s-4-1-38119638");
        mapView.put("Cloudlandscape_p5","https://www.patreon.com/posts/mk-peizazh-s-5-2-38159726");

        mapView.put("Bumblemee"   ,"https://www.patreon.com/posts/mk-mokhnatyi-1-38407522");
        mapView.put("Bumblemee_p2","https://www.patreon.com/posts/mk-mokhnatyi-2-38703063");
        mapView.put("Bumblemee_p3","https://www.patreon.com/posts/mk-mokhnatyi-3-38755199");
        mapView.put("Bumblemee_p4","https://www.patreon.com/posts/mk-mokhnatyi-4-38789249");

        mapView.put("Leopard"   ,"https://www.patreon.com/posts/mk-leopard-chast-39276553");
        mapView.put("Leopard_p2","https://www.patreon.com/posts/39307430");
        mapView.put("Leopard_p3","https://www.patreon.com/posts/mk-leopard-chast-39346348");
        mapView.put("Leopard_p4","https://www.patreon.com/posts/mk-leopard-chast-39412316");
        mapView.put("Leopard_p5","https://www.patreon.com/posts/mk-leopard-chast-40911715");
        mapView.put("Leopard_p6","https://www.patreon.com/posts/mk-leopard-chast-40952718");
        mapView.put("Leopard_p7","https://www.patreon.com/posts/mk-leopard-chast-41303145");

        mapView.put("Blueberry"   ,"https://www.patreon.com/posts/mk-golubika-1-40012508");
        mapView.put("Blueberry_p2","https://www.patreon.com/posts/mk-golubika-2-40411329");
        mapView.put("Blueberry_p3","https://www.patreon.com/posts/mk-golubika-3-40624205");
        mapView.put("Blueberry_p4","https://www.patreon.com/posts/mk-golubika-4-41449528");
        mapView.put("Blueberry_p5","https://www.patreon.com/posts/mk-golubika-5-41452486");


        mapView.put("Owl"   ,"https://www.patreon.com/posts/mk-sova-chast-1-41737422");
        mapView.put("Owl_p2","https://www.patreon.com/posts/mk-sova-chast-2-41999947");
        mapView.put("Owl_p3","https://www.patreon.com/posts/mk-sova-3-chast-42324912");
        mapView.put("Owl_p4","https://www.patreon.com/posts/mk-sova-4-chast-42481629");
        mapView.put("Owl_p5","https://www.patreon.com/posts/mk-sova-5-chast-42553283");

        mapView.put("GoldenFish"   ,"https://www.patreon.com/posts/mk-zolotaia-1-42879640");
        mapView.put("GoldenFish_p2","https://www.patreon.com/posts/mk-zolotaia-2-42919499");
        mapView.put("GoldenFish_p3","https://www.patreon.com/posts/mk-zolotaia-3-43024310");
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) { // Взаимодейсвие для контекстного меню
        return super.onContextItemSelected(item);
    }

    @SuppressLint("ResourceAsColor")
    @Override
    public boolean onOptionsItemSelected(MenuItem item) { // Взаимодейсвие для обычной меню
        Intent intent;
        switch (item.getItemId()) {
            case R.id.action_settings:
                intent = new Intent(this,About_app.class);
                startActivity(intent);
                break;
            case R.id.abot_Patreon:
                intent = new Intent(this, Activity_DescriptionOfPatron.class);
                startActivity(intent);
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.main_fragment);
        return NavigationUI.navigateUp(navController, mAppBarConfiguration)
                || super.onSupportNavigateUp();
    }

    @Override
    public void onClick(View v) {
    }


    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) { // метод для взаимодейсвия навигационого меню
        Intent intent;
        switch (menuItem.getItemId()) {
            case R.id.nav_home:
                intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://patreon.com/juliaomelchenko"));
                startActivity(intent);
                break;
            case R.id.nav_list_Of_learn:
                intent = new Intent(MainActivity.this, Activity_6_Dollars.class);
                startActivity(intent);
                break;
            case R.id.nav_free_lesson:
                intent = new Intent(MainActivity.this,Activity_Free_Lesson.class);
                startActivity(intent);
                break;
            case R.id.nav_list_Of_learn_advance:
                intent = new Intent(MainActivity.this, Activity_9_Dollars.class);
                startActivity(intent);
                break;
            case R.id.nav_youtube:
                intent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.youtube.com/channel/UCK7r6E4CsgA5-hBMYxS_MsA"));
                startActivity(intent);
                break;
            case R.id.nav_Art_materials:
                intent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.artcolor.online/artsupplies"));
                startActivity(intent);
                break;
            case R.id.nav_send:
                intent = new Intent(this, Activity_DescriptionOfPatron.class);
                startActivity(intent);
                break;
            case R.id.nav_work_of_Student:
                intent = new Intent(this,Activity_best_student.class);
                startActivity(intent);
                break;
        }
        return false;
    }
}
