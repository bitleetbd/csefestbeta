package com.csemiu.csefestbeta;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;

import com.csemiu.csefestbeta.Adapter.RecyclerViewAdapter;

import java.util.ArrayList;
import java.util.List;

import static java.security.AccessController.getContext;

public class Exhibitor extends AppCompatActivity {


    public Exhibitor() {

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exhebitior);
    }


}
