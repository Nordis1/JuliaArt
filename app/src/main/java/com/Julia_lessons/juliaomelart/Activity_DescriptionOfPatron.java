package com.Julia_lessons.juliaomelart;

import android.os.Bundle;
import android.widget.Toast;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;

public class Activity_DescriptionOfPatron extends YouTubeBaseActivity implements YouTubePlayer.OnInitializedListener {
    public static final String API_KEY = "AIzaSyBP5b4pciPceo40yjBdzzaTveNcwvV7DkM";
    public static final String VIDEO_PREVIEW = "JGoTWbsxp14";
    YouTubePlayerView youTubePlayerView;
    YouTubePlayer Yplayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_descriptionofpatron);

        youTubePlayerView = findViewById(R.id.youtube_player);
        youTubePlayerView.initialize(API_KEY,this);
    }


    @Override
    public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer player, boolean wasrestored) {
        player.setPlayerStateChangeListener(playerStateChangeListener);
        player.setPlaybackEventListener(playbackEventListener);
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
