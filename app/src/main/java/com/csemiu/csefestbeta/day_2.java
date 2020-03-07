package com.csemiu.csefestbeta;


import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.csemiu.csefestbeta.Adapter.RecyclerViewAdapter;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class day_2 extends Fragment {


    View view;
    private RecyclerView recyclerView;
    private List<Event_Item> event_items;


    public day_2() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_day_2, container, false);
        recyclerView = (RecyclerView) view.findViewById(R.id.day_1_recyclerView);
        RecyclerViewAdapter recyclerViewAdapter = new RecyclerViewAdapter(getContext(), event_items);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(recyclerViewAdapter);
        return view;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        event_items = new ArrayList<>();
        event_items.add(new Event_Item("Inauguration Ceremony", "Seminar Hall", "10:00 AM - 11:00 AM"));
        event_items.add(new Event_Item("Programming Contest", "LAB 207", "11:00 AM - 01:00 PM"));
        event_items.add(new Event_Item("Idea Showcase", "ROOM 105", "11:00 AM - 01:00 PM"));
        event_items.add(new Event_Item("Project Showcase", "Room 103", "11:00 AM - 01:00 PM"));
        event_items.add(new Event_Item("Seminar 1", "Seminar Hall", "03:00 PM - 04:00 PM"));
        event_items.add(new Event_Item("Seminar 2", "Seminar Hall", "04:00 PM - 05:00 PM"));

    }

}
