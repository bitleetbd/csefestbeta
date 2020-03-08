package com.csemiu.csefestbeta;



import androidx.fragment.app.FragmentActivity;


import android.location.Location;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class Venue extends FragmentActivity implements OnMapReadyCallback {

    GoogleMap mapAPI;
    SupportMapFragment mapFragment;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_venue);

        mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.mapAPI);
        mapFragment.getMapAsync(this);

    }


    @Override
    public void onMapReady(GoogleMap googleMap) {
        mapAPI = googleMap;
        LatLng ManaratInternationalUniversity = new LatLng(23.8777651,90.3107266);
        mapAPI.addMarker(new MarkerOptions().position(ManaratInternationalUniversity)
                .title("Manarat International University"));
        mapAPI.moveCamera(CameraUpdateFactory.newLatLngZoom(ManaratInternationalUniversity, 16f));


    }
}