package com.Julia_lessons.juliaomelart;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class About_app extends AppCompatActivity implements View.OnClickListener {
    Button share,versionCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_app);
        share = findViewById(R.id.btnshare);
        share.setOnClickListener(this);
        versionCount = findViewById(R.id.btn_countOfVersion);
        versionCount.setText("Версия сборки 3.0");

    }

    @Override
    public void onClick(View v) {
        Intent intent;
        switch (v.getId()){
            case R.id.btnshare:
                intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=com.Julia_lessons.juliaomelart"));
                startActivity(intent);
                break;
        }
    }
}
