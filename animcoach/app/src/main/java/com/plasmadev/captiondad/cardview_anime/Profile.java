package com.plasmadev.captiondad.cardview_anime;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import com.plasmadev.captiondad.cardview_anime.R;

public class Profile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        ImageButton call = (ImageButton) findViewById(R.id.callp);
        call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //----------------------when the call button is pressed-----------------------------
                final int REQUEST_PHONE_CALL = 1;
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:0956343372"));
                //-----------------checks for permission before placing the call--------------------
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M){
                    if(ContextCompat.checkSelfPermission(Profile.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED){
                        ActivityCompat.requestPermissions(Profile.this, new String[]{Manifest.permission.CALL_PHONE}, REQUEST_PHONE_CALL);
                    }else{
                        //-------------------------------places the call-----------------------------------
                        startActivity(callIntent);
                    }
                }
            }
        });
        ImageButton calls = (ImageButton) findViewById(R.id.callps);
        calls.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //----------------------when the call button is pressed-----------------------------
                final int REQUEST_PHONE_CALL = 1;
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:0956343372"));
                //-----------------checks for permission before placing the call--------------------
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M){
                    if(ContextCompat.checkSelfPermission(Profile.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED){
                        ActivityCompat.requestPermissions(Profile.this, new String[]{Manifest.permission.CALL_PHONE}, REQUEST_PHONE_CALL);
                    }else{
                        //-------------------------------places the call-----------------------------------
                        startActivity(callIntent);
                    }
                }
            }
        });
        ImageButton callsp = (ImageButton) findViewById(R.id.callpsp);
        callsp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //----------------------when the call button is pressed-----------------------------
                final int REQUEST_PHONE_CALL = 1;
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:0956343372"));
                //-----------------checks for permission before placing the call--------------------
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M){
                    if(ContextCompat.checkSelfPermission(Profile.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED){
                        ActivityCompat.requestPermissions(Profile.this, new String[]{Manifest.permission.CALL_PHONE}, REQUEST_PHONE_CALL);
                    }else{
                        //-------------------------------places the call-----------------------------------
                        startActivity(callIntent);
                    }
                }
            }
        });
    }
}