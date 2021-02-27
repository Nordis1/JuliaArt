package com.Julia_lessons.juliaomelart;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;

public class Activity_Free_Lesson extends YouTubeBaseActivity implements YouTubePlayer.OnInitializedListener, AdapterView.OnItemClickListener, View.OnClickListener {
    public static final String API_KEY = "AIzaSyBP5b4pciPceo40yjBdzzaTveNcwvV7DkM";
    public static final String VIDEO_Cake = "P9Udw0W1Mp4";
    public static final String VIDEO_Cake_part2 = "y1aSqRz2g_E";
    public static final String VIDEO_cake_part3 = "yNc4YO_n2gg";
    Button btntosite;
    YouTubePlayerView youTubePlayerView;
    ListView listview;
    String[] arrayOfnames = {"Торт с клубникой - часть 1", "Торт с клубникой - часть 2", "Торт с клубникой - часть 3"};
    YouTubePlayer Yplayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__free__lesson);
        listview = findViewById(R.id.list_view);
        btntosite = findViewById(R.id.btn_toSite);
        btntosite.setOnClickListener(this);


        youTubePlayerView = findViewById(R.id.youtube_player1);
        youTubePlayerView.initialize(API_KEY, this);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, arrayOfnames);
        listview.setAdapter(adapter);
        listview.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        try {
            switch (position) {
                case 0:
                    Yplayer.loadVideo(VIDEO_Cake);
                    break;
                case 1:
                    Yplayer.loadVideo(VIDEO_Cake_part2);
                    break;
                case 2:
                    Yplayer.loadVideo(VIDEO_cake_part3);
                    break;

            }
        } catch (Exception e) {
            Intent i = new Intent(this, MainActivity.class);
            i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
            Toast.makeText(this, "Проверьте подключение к интернету", Toast.LENGTH_LONG).show();
            startActivity(i);
        }
    }

    @Override
    public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer player, boolean wasrestored) {
        player.setPlayerStateChangeListener(playerStateChangeListener);
        player.setPlaybackEventListener(playbackEventListener);
        Yplayer = player;
        try {
            player.cueVideo(VIDEO_Cake);
        } catch (Exception e) {
            Intent i = new Intent(this, MainActivity.class);
            i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
            Toast.makeText(this, "Проверьте подключение к интернету", Toast.LENGTH_LONG).show();
            startActivity(i);
        }
    }

    private YouTubePlayer.PlaybackEventListener playbackEventListener = new YouTubePlayer.PlaybackEventListener() {
        @Override
        public void onPlaying() {

        }

        @Override
        public void onPaused() {

        }

        @Override
        public void onStopped() {

        }

        @Override
        public void onBuffering(boolean b) {

        }

        @Override
        public void onSeekTo(int i) {

        }
    };
    private YouTubePlayer.PlayerStateChangeListener playerStateChangeListener = new YouTubePlayer.PlayerStateChangeListener() {
        @Override
        public void onLoading() {

        }

        @Override
        public void onLoaded(String s) {

        }

        @Override
        public void onAdStarted() {

        }

        @Override
        public void onVideoStarted() {

        }

        @Override
        public void onVideoEnded() {

        }

        @Override
        public void onError(YouTubePlayer.ErrorReason errorReason) {

        }
    };

    @Override
    public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {
        Toast.makeText(this, "Failured to Initialize!", Toast.LENGTH_LONG).show();
    }

    @Override
    public void onClick(View v) {
        Intent intent;
        if (v.getId() == btntosite.getId()){
            intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.artcolor.online"));
            startActivity(intent);
        }
    }
}
