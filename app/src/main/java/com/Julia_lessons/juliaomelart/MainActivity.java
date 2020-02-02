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
        // 3. Создаём в Activity_Galery.xml новый view элемент.
        // 4. Регистрируем view в Activity_Galery и регистрируем в Onclick внимательно(Там много элементов нужно заменить).
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

        mapView.put("Cat","https://www.patreon.com/posts/mk-kotionok-1-32539008");
        mapView.put("Cat_p2","https://www.patreon.com/posts/mk-kotionok-2-32566937");

        mapView.put("Tigr","https://www.patreon.com/posts/mk-glaz-tigra-1-31747017");
        mapView.put("Tigr_p2","https://www.patreon.com/posts/mk-glaz-tigra-2-31901823");

        mapView.put("Mushroom","https://www.patreon.com/posts/mk-grib-borovik-31387084");

        mapView.put("Butterfly","https://www.patreon.com/posts/mk-babochka-na-31189002");

        mapView.put("Pumpkin","https://www.patreon.com/posts/mk-khellouin-30591129");

        mapView.put("Cherry","https://www.patreon.com/posts/mk-vishni-29231335");

        mapView.put("Frog","https://www.patreon.com/posts/mk-tropicheskaia-33197864");
        mapView.put("Frog_p2","https://www.patreon.com/posts/mk-tropicheskaia-33253277");

        mapView.put("Aiva","https://www.patreon.com/posts/mk-zhivopisnaia-33425163");
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
                intent = new Intent(this,Activity_for_Fragment.class);
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
                intent = new Intent(MainActivity.this,Activity_Galery.class);
                startActivity(intent);
                break;
            case R.id.nav_free_lesson:
                intent = new Intent(MainActivity.this,Activity_Free_Lesson.class);
                startActivity(intent);
                break;
            case R.id.nav_list_Of_learn_advance:
                intent = new Intent(MainActivity.this,Activity_advanced.class);
                startActivity(intent);
                break;
            case R.id.nav_youtube:
                intent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.youtube.com/channel/UCK7r6E4CsgA5-hBMYxS_MsA"));
                startActivity(intent);
                break;
            case R.id.nav_Art_materials:
                intent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://juliaeestivene.wixsite.com/artwork/post/%D1%81%D0%BF%D0%B8%D1%81%D0%BE%D0%BA-%D0%BC%D0%BE%D0%B8%D1%85-%D0%B0%D1%80%D1%82-%D0%BC%D0%B0%D1%82%D0%B5%D1%80%D0%B8%D0%B0%D0%BB%D0%BE%D0%B2"));
                startActivity(intent);
                break;
            case R.id.nav_send:
                intent = new Intent(this,Activity_for_Fragment.class);
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
