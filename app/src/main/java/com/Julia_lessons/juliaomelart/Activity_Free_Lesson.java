package com.Julia_lessons.juliaomelart;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;

public class Activity_Free_Lesson extends YouTubeBaseActivity implements YouTubePlayer.OnInitializedListener, AdapterView.OnItemClickListener {
    public static final String API_KEY = "";
    public static final String VIDEO_PREVIEW = "JYsNySLuF-c";
    public static final String VIDEO_part2 = "Xkp-RYFI1do";
    public static final String VIDEO_burd1 = "T68OPSMvEJQ";
    public static final String VIDEO_Nectarin = "Eehov9NPj8k";
    YouTubePlayerView youTubePlayerView;
    ListView listview;
    String[] arrayOfnames = {"Голубь часть 1", "Голубь часть 2", "Айва", "Нектарин"};
    YouTubePlayer Yplayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__free__lesson);
        listview = findViewById(R.id.list_view);


        youTubePlayerView = findViewById(R.id.youtube_player1);
        youTubePlayerView.initialize(API_KEY, this);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, arrayOfnames);
        listview.setAdapter(adapter);
        listview.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        switch (position) {
            case 0:
                Yplayer.loadVideo(VIDEO_PREVIEW);
                break;
            case 1:
                Yplayer.loadVideo(VIDEO_part2);
                break;
            case 2:
                Yplayer.loadVideo(VIDEO_burd1);
                break;
            case 3:
                Yplayer.loadVideo(VIDEO_Nectarin);
                break;

        }
    }

    @Override
    public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer player, boolean wasrestored) {
        player.setPlayerStateChangeListener(playerStateChangeListener);
        player.setPlaybackEventListener(playbackEventListener);
        Yplayer = player;
        player.cueVideo(VIDEO_PREVIEW);
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

}
