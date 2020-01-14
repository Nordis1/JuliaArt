package com.Julia_lessons.juliaomelart;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.ContextMenu;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Descript_activity extends AppCompatActivity implements View.OnClickListener {
    private static Button btnLink,btnLink_Part2,btnLink_Part3;
    static String s,s2,s3 = "";
    TextView textfor_size;
    ImageView linkView;
    public static final String TAG = "Descript_Activity";
    public static FrameLayout frameLayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.descript_activity);
        Intent intent = getIntent();
        int viewElement = intent.getIntExtra("intent", 0);

        btnLink = findViewById(R.id.btn_linkToPatreon);
        btnLink_Part2 = findViewById(R.id.btn_linkToPatreon_part2);
        btnLink_Part3 = findViewById(R.id.btn_linkToPatreon_part3);
        linkView = findViewById(R.id.linkView);
        linkView.setOnClickListener(this);
        btnLink.setOnClickListener(this);
        btnLink_Part2.setOnClickListener(this);
        btnLink_Part3.setOnClickListener(this);

        textfor_size = findViewById(R.id.id_textSize1);

        frameLayout = findViewById(R.id.frame_from_ActivityDescription);
        registerForContextMenu(frameLayout);
        Log.d(TAG, "номер картинки " + viewElement);
        setFrameLayout(viewElement); // рабочий
        buttonView();
        getLiks();
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        switch (v.getId()){
            case R.id.frame_from_ActivityDescription:
                Toast.makeText(this,"Size = "+ textfor_size.getText(),Toast.LENGTH_LONG ).show();
        }
    }

    public static void setFrameLayout(Integer i) {
        frameLayout.setBackgroundResource(i);
    }

    public static void getLiks(){
        if (Activity_Galery.load_galery) {
            s = MainActivity.mapView.get(Activity_Galery.connectLink);
            if (Activity_Galery.part2) {
                s2 = MainActivity.mapView.get(Activity_Galery.connectLink + "_p2");
            }
            if (Activity_Galery.part3) {
                s3 = MainActivity.mapView.get(Activity_Galery.connectLink + "_p3");
            }
        }else {
            s = MainActivity.mapView.get(Activity_advanced.connectLink_of_advanced);
            if (Activity_advanced.part2) {
                s2 = MainActivity.mapView.get(Activity_advanced.connectLink_of_advanced + "_p2");
            }
            if (Activity_advanced.part3) {
                s3 = MainActivity.mapView.get(Activity_advanced.connectLink_of_advanced + "_p3");
            }
        }

    }
    public static void buttonView(){
        if (Activity_Galery.load_galery) {
            if (Activity_Galery.part2) {
                btnLink_Part2.setVisibility(View.VISIBLE);
            }
            if (Activity_Galery.part3) {
                btnLink_Part3.setVisibility(View.VISIBLE);
            }
        }else {
            if (Activity_advanced.part2) {
                btnLink_Part2.setVisibility(View.VISIBLE);
            }
            if (Activity_advanced.part3) {
                btnLink_Part3.setVisibility(View.VISIBLE);
            }

        }

    }

    @Override
    protected void onStop() {
        onRestart();
        onStart();
        super.onStop();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onPostResume() {
        super.onPostResume();
    }

    @Override
    protected void onDestroy() {
        s = "";
        s2 = "";
        s3 = "";
        super.onDestroy();
    }

    @Override
    public void onClick(View v) {
        Intent intent;
        switch (v.getId()) {
            case R.id.btn_linkToPatreon:
                if (Activity_Galery.load_galery) {
                    intent = new Intent(Intent.ACTION_VIEW, Uri.parse(s));
                    startActivity(intent);
                }else {
                    intent = new Intent(Intent.ACTION_VIEW, Uri.parse(s));
                    startActivity(intent);
                }
                break;
            case R.id.btn_linkToPatreon_part2:
                if (Activity_Galery.load_galery) {
                    intent = new Intent(Intent.ACTION_VIEW, Uri.parse(s2));
                    startActivity(intent);
                }else {
                    intent = new Intent(Intent.ACTION_VIEW, Uri.parse(s2));
                    startActivity(intent);
                }
                break;
            case R.id.btn_linkToPatreon_part3:
                if (Activity_Galery.load_galery) {
                    intent = new Intent(Intent.ACTION_VIEW, Uri.parse(s3));
                    startActivity(intent);
                }else {
                    intent = new Intent(Intent.ACTION_VIEW, Uri.parse(s3));
                    startActivity(intent);
                }
                break;
            case R.id.linkView:
                intent = new Intent(Intent.ACTION_SEND);
                intent.setType("text/plain");
                intent.putExtra(Intent.EXTRA_SUBJECT,"Ссылки на урок");
                intent.putExtra(Intent.EXTRA_TEXT,s+"\n"+s2+"\n"+s3);
                startActivity(Intent.createChooser(intent,"Через что передать?"));
                break;
        }

    }
}
