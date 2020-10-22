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

public class Animefive extends AppCompatActivity {

    RecyclerView recyclerView;
    Vector<YouTubeVideos> youtubeVideos = new Vector<YouTubeVideos>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animefive);

        recyclerView = (RecyclerView) findViewById(R.id.recyclerView5);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager( new LinearLayoutManager(this));


        youtubeVideos.add( new YouTubeVideos("<iframe width=\"100%\" height=\"match_parent\" src=\"https://www.youtube.com/embed/EWoJr5z__cs\" frameborder=\"0\" allowfullscreen></iframe>") );

        VideoAdapter videoAdapter = new VideoAdapter(youtubeVideos);
        recyclerView.setAdapter(videoAdapter);

        ImageView img = (ImageView)findViewById(R.id.fairy5);
        img.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://aisplay.ais.co.th/portal/get_section/5df0ba2aaae7311e2ed11f68/"));
                startActivity(intent);
            }
        });
    }
}