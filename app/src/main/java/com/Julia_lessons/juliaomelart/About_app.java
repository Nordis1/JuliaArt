package com.Julia_lessons.juliaomelart;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class About_app extends AppCompatActivity implements View.OnClickListener {
    Button share;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_app);
        share = findViewById(R.id.btnshare);
        share.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent intent;
        switch (v.getId()){
            case R.id.btnshare:
                intent = new Intent(Intent.ACTION_SEND);
                intent.setType("text/plain");
                //intent.setType("message/rfc822/text/plain");
                startActivity(Intent.createChooser(intent,"Через что поделиться?"));
                break;
        }
    }
}
