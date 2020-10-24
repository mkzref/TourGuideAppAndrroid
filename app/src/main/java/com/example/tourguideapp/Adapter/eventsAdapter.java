package com.example.tourguideapp.Adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.tourguideapp.R;
import com.example.tourguideapp.TabbedActivity;
import com.example.tourguideapp.classes.actions;

import java.util.List;

public class eventsAdapter extends RecyclerView.Adapter<eventsAdapter.ViewHolder> {
    private Context mcontext;
    private List<actions> listdata;

    public eventsAdapter(Context mcontext, List<actions> listdata) {
        this.mcontext = mcontext;
        this.listdata = listdata;

    }

    @Override
    public eventsAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View listItem = layoutInflater.inflate(R.layout.layout_events, parent, false);
        eventsAdapter.ViewHolder viewHolder = new eventsAdapter.ViewHolder(listItem);
        return viewHolder;
    }


    @Override
    public void onBindViewHolder(eventsAdapter.ViewHolder holder, int position) {
        final actions myListData = listdata.get(position);
        holder.img.setImageResource(listdata.get(position).getimag());
        holder.nameitem.setText(listdata.get(position).getnameitem());

    }

    @Override
    public int getItemCount() {
        return listdata.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public TextView nameitem;
        public ImageView img;


        public ViewHolder(View itemView) {
            super(itemView);
            this.img = itemView.findViewById(R.id.list_item1_imageView);
            this.nameitem = itemView.findViewById(R.id.list_item1_title_textView);


        }
    }
}

