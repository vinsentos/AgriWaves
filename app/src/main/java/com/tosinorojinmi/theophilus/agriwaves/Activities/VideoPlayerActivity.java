package com.tosinorojinmi.theophilus.agriwaves.Activities;

import android.os.Bundle;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;
import com.tosinorojinmi.theophilus.agriwaves.R;
import com.tosinorojinmi.theophilus.agriwaves.Utils.DeveloperKeys;

public class VideoPlayerActivity extends YouTubeBaseActivity {

    private String videoId;
    private YouTubePlayer mYouTubePlayer;
    private YouTubePlayerView youTubePlayerView;
    private YouTubePlayer.OnInitializedListener onInitializedListener;

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video_player);

        if(getIntent() != null) {
            videoId = getIntent().getStringExtra("videoId");
        }
        else{
            videoId = "W5Rc-gPhju0";
        }
        youTubePlayerView       = findViewById(R.id.youtubePlayerView);
        onInitializedListener   = new YouTubePlayer.OnInitializedListener() {
            @Override
            public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
                youTubePlayer.setFullscreen(true);
                youTubePlayer.loadVideo(videoId);
            }

            @Override
            public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {

            }
        };
        youTubePlayerView.initialize(DeveloperKeys.getApiKey(), onInitializedListener);

    }
}
