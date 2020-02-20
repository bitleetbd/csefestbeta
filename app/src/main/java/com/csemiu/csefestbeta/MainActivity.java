package com.csemiu.csefestbeta;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;
import androidx.drawerlayout.widget.DrawerLayout;


import android.content.Intent;
import android.view.View;
import android.widget.Button;

import android.os.Bundle;
import android.widget.GridLayout;

import com.google.android.material.navigation.NavigationView;



public class MainActivity extends AppCompatActivity {

    GridLayout gridLayout;
    DrawerLayout drawerLayout;
    ActionBarDrawerToggle toggle;
    NavigationView navigationView;


    public Button eventButton, speakerButton, VenueButton, ExhibitorButton, KeyfactsButton, AttractionButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        eventButton = findViewById(R.id.eventButton);
        speakerButton = findViewById(R.id.SpeakerButton);
        VenueButton = findViewById(R.id.VenueButton);
        ExhibitorButton = findViewById(R.id.ExhibitorsButton);
        KeyfactsButton = findViewById(R.id.KeyfactButton);
        AttractionButton = findViewById(R.id.AttractionButton);
        gridLayout = findViewById(R.id.gridLayout);


        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        drawerLayout = findViewById(R.id.drawer);
        navigationView = findViewById(R.id.nav_view);

        toggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar,
                R.string.nav_app_bar_open_drawer_description, R.string.navigation_drawer_close);
        drawerLayout.addDrawerListener(toggle);
        toggle.setDrawerIndicatorEnabled(true);
        toggle.syncState();

        eventButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Event.class);
                startActivity(intent);

            }
        });
        speakerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Speaker.class);
                startActivity(intent);

            }
        });
        VenueButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Venue.class);
                startActivity(intent);

            }
        });
        ExhibitorButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Exhebitior.class);
                startActivity(intent);

            }
        });
        AttractionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Attraction.class);
                startActivity(intent);

            }
        });
    }

}
