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
     public static HashMap<String, String> mapViewPatreon = new HashMap<String,String>();
     public static HashMap<String, String> mapViewBoosty = new HashMap<String,String>();

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
        if (mapViewPatreon.isEmpty()){
            createMap();
        }
        if (mapViewBoosty.isEmpty()){
            createBoostymap();
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
        mapViewPatreon.put("Sheet","https://www.patreon.com/posts/tsvetnye-risuem-29220651");

        mapViewPatreon.put("Smile","https://www.patreon.com/posts/tsvetnye-ulybka-29262023");
        mapViewPatreon.put("Smile_p2","https://www.patreon.com/posts/tsvetnye-ulybka-29380195");

        mapViewPatreon.put("Beetle","https://www.patreon.com/posts/mk-zhuk-chast-1-30261579");
        mapViewPatreon.put("Beetle_p2","https://www.patreon.com/posts/mk-zhuk-chast-2-30433600");
        mapViewPatreon.put("Beetle_p3","https://www.patreon.com/posts/mk-zhuk-chast-3-30719903");

        mapViewPatreon.put("Tea","https://www.patreon.com/posts/mk-chashka-chaia-30929768");
        mapViewPatreon.put("Tea_p2","https://www.patreon.com/posts/mk-chashka-chaia-30975846");

        mapViewPatreon.put("Eyes","https://www.patreon.com/posts/mk-glaz-31550571");

        mapViewPatreon.put("Peach","https://www.patreon.com/posts/tsvetnye-chast-1-29430213");
        mapViewPatreon.put("Peach_p2","https://www.patreon.com/posts/tsvetnye-chast-2-29561744");

        mapViewPatreon.put("Mandarin","https://www.patreon.com/posts/mk-zapakhi-goda-32127170");

        mapViewPatreon.put("Sinichka","https://www.patreon.com/posts/mk-sinichka-1-32299857");
        mapViewPatreon.put("Sinichka_p2","https://www.patreon.com/posts/mk-sinichka-2-i-32398957");

        mapViewPatreon.put("Cat"   ,"https://www.patreon.com/posts/mk-kotionok-1-32539008");
        mapViewPatreon.put("Cat_p2","https://www.patreon.com/posts/mk-kotionok-2-32566937");

        mapViewPatreon.put("Tigr"   ,"https://www.patreon.com/posts/mk-glaz-tigra-1-31747017");
        mapViewPatreon.put("Tigr_p2","https://www.patreon.com/posts/mk-glaz-tigra-2-31901823");

        mapViewPatreon.put("Mushroom","https://www.patreon.com/posts/mk-grib-borovik-31387084");

        mapViewPatreon.put("Butterfly","https://www.patreon.com/posts/mk-babochka-na-31189002");

        mapViewPatreon.put("Pumpkin","https://www.patreon.com/posts/mk-khellouin-30591129");

        mapViewPatreon.put("Cherry","https://www.patreon.com/posts/mk-vishni-29231335");

        mapViewPatreon.put("Frog"   ,"https://www.patreon.com/posts/mk-tropicheskaia-33197864");
        mapViewPatreon.put("Frog_p2","https://www.patreon.com/posts/mk-tropicheskaia-33253277");

        mapViewPatreon.put("Aiva","https://www.patreon.com/posts/mk-zhivopisnaia-33425163");

        mapViewPatreon.put("Lily"   ,"https://www.patreon.com/posts/mk-volshebnye-1-33832369");
        mapViewPatreon.put("Lily_p2","https://www.patreon.com/posts/mk-volshebnye-2-34020719");

        mapViewPatreon.put("Child"   ,"https://www.patreon.com/posts/mk-portret-chast-34381382");
        mapViewPatreon.put("Child_p2","https://www.patreon.com/posts/mk-portret-chast-34449497");
        mapViewPatreon.put("Child_p3","https://www.patreon.com/posts/mk-portret-chast-34801309");

        mapViewPatreon.put("Lizard"   ,"https://www.patreon.com/posts/mk-iashcheritsa-35107857");
        mapViewPatreon.put("Lizard_p2","https://www.patreon.com/posts/mk-iashcheritsa-35319622");
        mapViewPatreon.put("Lizard_p3","https://www.patreon.com/posts/mk-iashcheritsa-35663605");

        mapViewPatreon.put("Dog"   ,"https://www.patreon.com/posts/mk-luchshii-drug-36093147");
        mapViewPatreon.put("Dog_p2","https://www.patreon.com/posts/mk-luchshii-drug-36239737");
        mapViewPatreon.put("Dog_p3","https://www.patreon.com/posts/mk-luchshii-drug-36306711");
        mapViewPatreon.put("Dog_p4","https://www.patreon.com/posts/mk-luchshii-drug-37139533");

        mapViewPatreon.put("Tropical_Fish"   ,"https://www.patreon.com/posts/mk-tropicheskaia-36453779");
        mapViewPatreon.put("Tropical_Fish_p2","https://www.patreon.com/posts/mk-tropicheskaia-36846340");
        mapViewPatreon.put("Tropical_Fish_p3","https://www.patreon.com/posts/mk-tropicheskaia-36926230");

        mapViewPatreon.put("Cloudlandscape"   ,"https://www.patreon.com/posts/mk-peizazh-s-1-i-37578312");
        mapViewPatreon.put("Cloudlandscape_p2","https://www.patreon.com/posts/mk-peizazh-s-2-i-37764801");
        mapViewPatreon.put("Cloudlandscape_p3","https://www.patreon.com/posts/mk-peizazh-s-3-37846112");
        mapViewPatreon.put("Cloudlandscape_p4","https://www.patreon.com/posts/mk-peizazh-s-4-1-38119638");
        mapViewPatreon.put("Cloudlandscape_p5","https://www.patreon.com/posts/mk-peizazh-s-5-2-38159726");

        mapViewPatreon.put("Bumblemee"   ,"https://www.patreon.com/posts/mk-mokhnatyi-1-38407522");
        mapViewPatreon.put("Bumblemee_p2","https://www.patreon.com/posts/mk-mokhnatyi-2-38703063");
        mapViewPatreon.put("Bumblemee_p3","https://www.patreon.com/posts/mk-mokhnatyi-3-38755199");
        mapViewPatreon.put("Bumblemee_p4","https://www.patreon.com/posts/mk-mokhnatyi-4-38789249");

        mapViewPatreon.put("Leopard"   ,"https://www.patreon.com/posts/mk-leopard-chast-39276553");
        mapViewPatreon.put("Leopard_p2","https://www.patreon.com/posts/39307430");
        mapViewPatreon.put("Leopard_p3","https://www.patreon.com/posts/mk-leopard-chast-39346348");
        mapViewPatreon.put("Leopard_p4","https://www.patreon.com/posts/mk-leopard-chast-39412316");
        mapViewPatreon.put("Leopard_p5","https://www.patreon.com/posts/mk-leopard-chast-40911715");
        mapViewPatreon.put("Leopard_p6","https://www.patreon.com/posts/mk-leopard-chast-40952718");
        mapViewPatreon.put("Leopard_p7","https://www.patreon.com/posts/mk-leopard-chast-41303145");

        mapViewPatreon.put("Blueberry"   ,"https://www.patreon.com/posts/mk-golubika-1-40012508");
        mapViewPatreon.put("Blueberry_p2","https://www.patreon.com/posts/mk-golubika-2-40411329");
        mapViewPatreon.put("Blueberry_p3","https://www.patreon.com/posts/mk-golubika-3-40624205");
        mapViewPatreon.put("Blueberry_p4","https://www.patreon.com/posts/mk-golubika-4-41449528");
        mapViewPatreon.put("Blueberry_p5","https://www.patreon.com/posts/mk-golubika-5-41452486");


        mapViewPatreon.put("Owl"   ,"https://www.patreon.com/posts/mk-sova-chast-1-41737422");
        mapViewPatreon.put("Owl_p2","https://www.patreon.com/posts/mk-sova-chast-2-41999947");
        mapViewPatreon.put("Owl_p3","https://www.patreon.com/posts/mk-sova-3-chast-42324912");
        mapViewPatreon.put("Owl_p4","https://www.patreon.com/posts/mk-sova-4-chast-42481629");
        mapViewPatreon.put("Owl_p5","https://www.patreon.com/posts/mk-sova-5-chast-42553283");

        mapViewPatreon.put("GoldenFish"   ,"https://www.patreon.com/posts/mk-zolotaia-1-42879640");
        mapViewPatreon.put("GoldenFish_p2","https://www.patreon.com/posts/mk-zolotaia-2-42919499");
        mapViewPatreon.put("GoldenFish_p3","https://www.patreon.com/posts/mk-zolotaia-3-43024310");

        mapViewPatreon.put("Christmas"   ,"https://www.patreon.com/posts/mk-svet-chast-1-44923684");
        mapViewPatreon.put("Christmas_p2","https://www.patreon.com/posts/mk-svet-chast-2-45141580");
        mapViewPatreon.put("Christmas_p3","https://www.patreon.com/posts/mk-svet-chast-3-45175828");
        mapViewPatreon.put("Christmas_p4","https://www.patreon.com/posts/mk-svet-chast-4-45389331");

        mapViewPatreon.put("Ametist"   ,"https://www.patreon.com/posts/mk-ametist-chast-46823482");
        mapViewPatreon.put("Ametist_p2","https://www.patreon.com/posts/ametist-chast-2-47113863");
        mapViewPatreon.put("Ametist_p3","https://www.patreon.com/posts/ametist-chast-3-47158953");

        mapViewPatreon.put("Squirrel"   ,"https://www.patreon.com/posts/mk-zimniaia-1-45966969");
        mapViewPatreon.put("Squirrel_p2","https://www.patreon.com/posts/mk-zimniaia-2-46197769");
        mapViewPatreon.put("Squirrel_p3","https://www.patreon.com/posts/mk-zimniaia-3-46245611");
        mapViewPatreon.put("Squirrel_p4","https://www.patreon.com/posts/mk-zimniaia-4-46487075");
        mapViewPatreon.put("Squirrel_p5","https://www.patreon.com/posts/mk-zimniaia-5-46530296");

    }
    public static void createBoostymap() {
        mapViewBoosty.put("Sheet", "https://www.patreon.com/posts/tsvetnye-risuem-29220Boosty");

        mapViewBoosty.put("Beetle", "https://www.patreon.com/posts/mk-zhuk-chast-1-30261579");


        mapViewBoosty.put("Tea", "https://www.patreon.com/posts/mk-chashka-chaia-30929768");

        mapViewBoosty.put("Eyes", "https://www.patreon.com/posts/mk-glaz-31550Boosty");

        mapViewBoosty.put("Peach", "https://www.patreon.com/posts/tsvetnye-chast-1-29430213");

        mapViewBoosty.put("Mandarin", "https://www.patreon.com/posts/mk-zapakhi-goda-32127Boosty");

        mapViewBoosty.put("Sinichka", "https://www.patreon.com/posts/mk-sinichka-1-32299857");

        mapViewBoosty.put("Cat", "https://www.patreon.com/posts/mk-kotionok-1-32539008");

        mapViewBoosty.put("Tigr", "https://www.patreon.com/posts/mk-glaz-tigra-1-31747017");

        mapViewBoosty.put("Mushroom", "https://www.patreon.com/posts/mk-grib-borovik-31387Boosty");

        mapViewBoosty.put("Butterfly", "https://www.patreon.com/posts/mk-babochka-na-31189Boosty");

        mapViewBoosty.put("Pumpkin", "https://www.patreon.com/posts/mk-khellouin-30591Boosty");

        mapViewBoosty.put("Cherry", "https://www.patreon.com/posts/mk-vishni-29231Boosty");

        mapViewBoosty.put("Frog", "https://www.patreon.com/posts/mk-tropicheskaia-33197864");

        mapViewBoosty.put("Aiva", "https://www.patreon.com/posts/mk-zhivopisnaia-33425Boosty");

        mapViewBoosty.put("Lily", "https://www.patreon.com/posts/mk-volshebnye-1-33832369");

        mapViewBoosty.put("Child", "https://www.patreon.com/posts/mk-portret-chast-34381382");

        mapViewBoosty.put("Lizard", "https://www.patreon.com/posts/mk-iashcheritsa-35107857");

        mapViewBoosty.put("Dog", "https://www.patreon.com/posts/mk-luchshii-drug-36093147");

        mapViewBoosty.put("Tropical_Fish", "https://www.patreon.com/posts/mk-tropicheskaia-36453779");

        mapViewBoosty.put("Cloudlandscape", "https://www.patreon.com/posts/mk-peizazh-s-1-i-37578312");

        mapViewBoosty.put("Bumblemee", "https://www.patreon.com/posts/mk-mokhnatyi-1-38407522");

        mapViewBoosty.put("Leopard", "https://www.patreon.com/posts/mk-leopard-chast-39276553");

        mapViewBoosty.put("Blueberry", "https://www.patreon.com/posts/mk-golubika-1-40012508");

        mapViewBoosty.put("Owl", "https://www.patreon.com/posts/mk-sova-chast-1-41737422");

        mapViewBoosty.put("GoldenFish", "https://www.patreon.com/posts/mk-zolotaia-1-42879640");

        mapViewBoosty.put("Christmas", "https://www.patreon.com/posts/mk-svet-chast-1-44923684");

        mapViewBoosty.put("Ametist", "https://www.patreon.com/posts/mk-ametist-chast-46823482");

        mapViewBoosty.put("Squirrel", "https://www.patreon.com/posts/mk-zimniaia-1-45966969");
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
