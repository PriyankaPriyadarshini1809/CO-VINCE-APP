package com.example.android.covidapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationServices;

public class SuppliesActivity extends AppCompatActivity {

    private Button btnb, btnq;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState)  ;
        setContentView(R.layout.activity_supplies);

        btnb=findViewById(R.id.beds);
        btnq=findViewById(R.id.quarantine);

        btnb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.google.com/search?q=hospitals+near+me&oq=hospitals+n&aqs=chrome.1.69i57j0i433i457j0i402l2j0.2895j0j4&client=ms-android-oppo&sourceid=chrome-mobile&ie=UTF-8");
            }
        });
        btnq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.google.com/search?q=quarantine+centre+near+me&oq=quarantine+centre+n&aqs=chrome.1.69i57j0i457j0j46i175i199l2.8094j0j9&client=ms-android-oppo&sourceid=chrome-mobile&ie=UTF-8");
            }
        });



    }

    private void gotoUrl(String s) {
        Uri uri=Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }
}
