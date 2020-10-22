package com.plasmadev.captiondad.cardview_anime;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;

import java.util.Vector;

import com.plasmadev.captiondad.cardview_anime.R;

public class Animesix extends AppCompatActivity {

    RecyclerView recyclerView;
    Vector<YouTubeVideos> youtubeVideos = new Vector<YouTubeVideos>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animesix);

        recyclerView = (RecyclerView) findViewById(R.id.recyclerView6);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager( new LinearLayoutManager(this));


        youtubeVideos.add( new YouTubeVideos("<iframe width=\"100%\" height=\"match_parent\" src=\"https://www.youtube.com/embed/Vv5hiVyzp_U\" frameborder=\"0\" allowfullscreen></iframe>") );

        VideoAdapter videoAdapter = new VideoAdapter(youtubeVideos);
        recyclerView.setAdapter(videoAdapter);

        ImageView img = (ImageView)findViewById(R.id.fairy6);
        img.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://tv.line.me/search?query=%E0%B8%A7%E0%B8%B1%E0%B8%99%E0%B8%9E%E0%B8%B5%E0%B8%8B"));
                startActivity(intent);
            }
        });
    }
}