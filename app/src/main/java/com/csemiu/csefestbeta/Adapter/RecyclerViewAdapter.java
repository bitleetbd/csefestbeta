package com.csemiu.csefestbeta.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.csemiu.csefestbeta.Event_Item;
import com.csemiu.csefestbeta.R;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.EventViewHolder> {


    Context context;
    List<Event_Item> data;

    public RecyclerViewAdapter(Context context, List<Event_Item> data) {
        this.context = context;
        this.data = data;
        //this.data1 = data1;
    }

    @NonNull
    @Override
    public EventViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;
        view = LayoutInflater.from(context).inflate(R.layout.event_item, parent, false);
        EventViewHolder viewHolder = new EventViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull EventViewHolder holder, int position) {

        holder.event_name.setText(data.get(position).getEvent_name());
        holder.venue_name.setText(data.get(position).getVenue_name());
        holder.time_name.setText(data.get(position).getTime_name());

    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public static class EventViewHolder extends RecyclerView.ViewHolder {

        private TextView event_name;
        private TextView venue_name;
        private TextView time_name;


        public EventViewHolder(@NonNull View itemView) {
            super(itemView);

            event_name = itemView.findViewById(R.id.event_name);
            venue_name = itemView.findViewById(R.id.venue_name);
            time_name = itemView.findViewById(R.id.time_name);

        }
    }
}
