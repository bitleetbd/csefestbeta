package com.csemiu.csefestbeta;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.CircleOptions;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class Venue extends FragmentActivity implements OnMapReadyCallback {

    Button get_direction;
    GoogleMap googleMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_venue);

        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
        get_direction = findViewById(R.id.get_direction);

        get_direction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("geo:23.8777138,90.310617"));
                startActivity(intent);
            }
        });
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        LatLng Manarat = new LatLng(23.8777138, 90.310617);
        googleMap.addMarker(new MarkerOptions().position(Manarat).title("Manarat International University"));
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(Manarat));
        googleMap.animateCamera(CameraUpdateFactory.newLatLngZoom(Manarat, 15), 750, null);
        googleMap.addCircle(new CircleOptions().center(Manarat).radius(10.0).strokeWidth(3f).strokeColor(Color.RED).fillColor(Color.TRANSPARENT));

    }
}
