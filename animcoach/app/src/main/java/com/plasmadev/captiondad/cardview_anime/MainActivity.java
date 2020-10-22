package com.plasmadev.captiondad.cardview_anime;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Switch;
import com.plasmadev.captiondad.cardview_anime.R;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private CardView drz, act, myh, dms, sao, one;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        drz = (CardView) findViewById(R.id.drz);
        act = (CardView) findViewById(R.id.act);
        myh = (CardView) findViewById(R.id.myh);
        dms = (CardView) findViewById(R.id.dms);
        sao = (CardView) findViewById(R.id.sao);
        one = (CardView) findViewById(R.id.one);
        //
        drz.setOnClickListener(this);
        act.setOnClickListener(this);
        myh.setOnClickListener(this);
        dms.setOnClickListener(this);
        sao.setOnClickListener(this);
        one.setOnClickListener(this);

        ImageButton imb = (ImageButton) findViewById(R.id.imb);
        imb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openProfile();
            }
        });
    }

    public void openProfile() {
        Intent intent = new Intent(this, Profile.class);
        startActivity(intent);
    }

    @Override
    public void onClick(View v) {
        Intent i;

        switch (v.getId()) {
            case R.id.drz:
                i = new Intent(this, Animeone.class);
                startActivity(i);
                break;
            case R.id.act:
                i = new Intent(this, Animetwo.class);
                startActivity(i);
                break;
            case R.id.myh:
                i = new Intent(this, Animethree.class);
                startActivity(i);
                break;
            case R.id.dms:
                i = new Intent(this, Animefour.class);
                startActivity(i);
                break;
            case R.id.sao:
                i = new Intent(this, Animefive.class);
                startActivity(i);
                break;
            case R.id.one:
                i = new Intent(this, Animesix.class);
                startActivity(i);
                break;
            default:
                break;
        }
    }
}
