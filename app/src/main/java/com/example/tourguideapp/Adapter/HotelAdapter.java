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

public class HotelAdapter extends RecyclerView.Adapter<HotelAdapter.ViewHolder> {
    private Context mcontext;
    private List<HotelandResturant> listdata;

    public HotelAdapter(Context mcontext, List<HotelandResturant> listdata) {
        this.mcontext = mcontext;
        this.listdata = listdata;

    }


    @Override
    public HotelAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View listItem = layoutInflater.inflate(R.layout.layout_listitem2, parent, false);
        HotelAdapter.ViewHolder viewHolder = new HotelAdapter.ViewHolder(listItem);
        return viewHolder;
    }


    @Override
    public void onBindViewHolder(HotelAdapter.ViewHolder holder, int position) {
        final HotelandResturant myListData = listdata.get(position);
        holder.img.setImageResource(listdata.get(position).getimag());
        holder.TopRate.setText(listdata.get(position).getTopRate());
        holder.nameitem.setText(listdata.get(position).getnameitem());


        holder.arrowimg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (holder.getAdapterPosition() == 0) {
                    String text = mcontext.getResources().getString(R.string.hotel1);
                    Intent i = new Intent(mcontext, Infomartions_Detalis_Activity.class);
                    i.putExtra(mcontext.getString(R.string.resouce), R.drawable.hotel1);
                    i.putExtra(mcontext.getString(R.string.information), text);
                    i.putExtra(mcontext.getString(R.string.latitiude), 57.1497996);
                    i.putExtra(mcontext.getString(R.string.Longitiude), -2.1036568);
                    mcontext.startActivity(i);
                }

                if (holder.getAdapterPosition() == 1) {

                    String text = mcontext.getResources().getString(R.string.hotel2);
                    Intent i = new Intent(mcontext, Infomartions_Detalis_Activity.class);
                    i.putExtra(mcontext.getString(R.string.resouce), R.drawable.hotel2);
                    i.putExtra(mcontext.getString(R.string.information), text);
                    i.putExtra(mcontext.getString(R.string.latitiude), 27.3376094);
                    i.putExtra(mcontext.getString(R.string.Longitiude), -82.5486228);
                    mcontext.startActivity(i);

                }

                if (holder.getAdapterPosition() == 2) {

                    String text = mcontext.getResources().getString(R.string.hotel3);
                    Intent i = new Intent(mcontext, Infomartions_Detalis_Activity.class);
                    i.putExtra(mcontext.getString(R.string.resouce), R.drawable.hotel3);
                    i.putExtra(mcontext.getString(R.string.information), text);
                    i.putExtra(mcontext.getString(R.string.latitiude), 26.2121701);
                    i.putExtra(mcontext.getString(R.string.Longitiude), -81.809457);
                    mcontext.startActivity(i);
                }
                if (holder.getAdapterPosition() == 3) {

                    String text = mcontext.getResources().getString(R.string.hotel4);
                    Intent i = new Intent(mcontext, Infomartions_Detalis_Activity.class);
                    i.putExtra(mcontext.getString(R.string.resouce), R.drawable.hotel4);
                    i.putExtra(mcontext.getString(R.string.information), text);
                    i.putExtra(mcontext.getString(R.string.latitiude), 25.8074284);
                    i.putExtra(mcontext.getString(R.string.Longitiude), -80.1234498);
                    mcontext.startActivity(i);
                }
                if (holder.getAdapterPosition() == 4) {

                    String text = mcontext.getResources().getString(R.string.hotel5);
                    Intent i = new Intent(mcontext, Infomartions_Detalis_Activity.class);
                    i.putExtra(mcontext.getString(R.string.resouce), R.drawable.hotel5);
                    i.putExtra(mcontext.getString(R.string.information), text);
                    i.putExtra(mcontext.getString(R.string.latitiude), 29.8943379);
                    i.putExtra(mcontext.getString(R.string.Longitiude), -81.3114622);
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

