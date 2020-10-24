package com.example.tourguideapp.Adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.tourguideapp.Infomartions_Detalis_Activity;
import com.example.tourguideapp.R;
import com.example.tourguideapp.classes.HotelandResturant;


import java.util.List;

public class ResturnatsAdapter extends RecyclerView.Adapter<ResturnatsAdapter.ViewHolder> {
    private Context mcontext;
    private List<HotelandResturant> listdata;

    public ResturnatsAdapter(Context mcontext, List<HotelandResturant> listdata) {
        this.mcontext = mcontext;
        this.listdata = listdata;

    }


    @Override
    public ResturnatsAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View listItem = layoutInflater.inflate(R.layout.layout_listitem2, parent, false);
        ResturnatsAdapter.ViewHolder viewHolder = new ResturnatsAdapter.ViewHolder(listItem);
        return viewHolder;
    }


    @Override
    public void onBindViewHolder(ResturnatsAdapter.ViewHolder holder, int position) {
        final HotelandResturant myListData = listdata.get(position);
        holder.img.setImageResource(listdata.get(position).getimag());
        holder.TopRate.setText(listdata.get(position).getTopRate());
        holder.nameitem.setText(listdata.get(position).getnameitem());


        holder.arrowimg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (holder.getAdapterPosition() == 0) {
                    String text = mcontext.getResources().getString(R.string.MountEverest);
                    Intent i = new Intent(mcontext, Infomartions_Detalis_Activity.class);
                    i.putExtra(mcontext.getString(R.string.resouce), R.drawable.view1);
                    i.putExtra(mcontext.getString(R.string.information), text);
                    i.putExtra(mcontext.getString(R.string.latitiude), 57.2027567);
                    i.putExtra(mcontext.getString(R.string.Longitiude), -2.2893597);
                    mcontext.startActivity(i);
                }

                if (holder.getAdapterPosition() == 1) {

                    String text = mcontext.getResources().getString(R.string.FloribbeanFlo);
                    Intent i = new Intent(mcontext, Infomartions_Detalis_Activity.class);
                    i.putExtra(mcontext.getString(R.string.resouce), R.drawable.view2);
                    i.putExtra(mcontext.getString(R.string.information), text);
                    i.putExtra(mcontext.getString(R.string.latitiude), 27.2426875);
                    i.putExtra(mcontext.getString(R.string.Longitiude), -82.5094806);
                    mcontext.startActivity(i);

                }

                if (holder.getAdapterPosition() == 2) {

                    String text = mcontext.getResources().getString(R.string.Mediterrano);
                    Intent i = new Intent(mcontext, Infomartions_Detalis_Activity.class);
                    i.putExtra(mcontext.getString(R.string.resouce), R.drawable.view3);
                    i.putExtra(mcontext.getString(R.string.information), text);
                    i.putExtra(mcontext.getString(R.string.latitiude), 26.1308214);
                    i.putExtra(mcontext.getString(R.string.Longitiude), -81.8010022);
                    mcontext.startActivity(i);
                }
                if (holder.getAdapterPosition() == 3) {

                    String text = mcontext.getResources().getString(R.string.ilPastaiolo);
                    Intent i = new Intent(mcontext, Infomartions_Detalis_Activity.class);
                    i.putExtra(mcontext.getString(R.string.resouce), R.drawable.view4);
                    i.putExtra(mcontext.getString(R.string.information), text);
                    i.putExtra(mcontext.getString(R.string.latitiude), 25.7823582);
                    i.putExtra(mcontext.getString(R.string.Longitiude), -80.131518);
                    mcontext.startActivity(i);
                }
                if (holder.getAdapterPosition() == 4) {

                    String text = mcontext.getResources().getString(R.string.Collage);
                    Intent i = new Intent(mcontext, Infomartions_Detalis_Activity.class);
                    i.putExtra(mcontext.getString(R.string.resouce), R.drawable.view5);
                    i.putExtra(mcontext.getString(R.string.information), text);
                    i.putExtra(mcontext.getString(R.string.latitiude), 29.8948001);
                    i.putExtra(mcontext.getString(R.string.Longitiude), -81.3138026);
                    mcontext.startActivity(i);
                }

            }
        });
    }

    @Override
    public int getItemCount() {
        return listdata.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public TextView nameitem;
        public TextView TopRate;
        public ImageView img;
        public ImageView arrowimg;

        public ViewHolder(View itemView) {
            super(itemView);
            this.img = itemView.findViewById(R.id.list_item1_imageView);
            this.nameitem = itemView.findViewById(R.id.list_item1_title_textView);
            this.TopRate = itemView.findViewById(R.id.toprate);
            this.arrowimg = itemView.findViewById(R.id.list_item1_arrow);


        }
    }
}

