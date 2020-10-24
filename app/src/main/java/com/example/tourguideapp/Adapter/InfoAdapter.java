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

import com.example.tourguideapp.Infomartions_Detalis_Activity;
import com.example.tourguideapp.R;
import com.example.tourguideapp.classes.HotelandResturant;
import com.example.tourguideapp.classes.actions;

import java.util.List;

public class InfoAdapter extends RecyclerView.Adapter<InfoAdapter.ViewHolder> {
    private Context mcontext;
    private List<actions> listdata;

    public InfoAdapter(Context mcontext, List<actions> listdata) {
        this.mcontext = mcontext;
        this.listdata = listdata;

    }


    @Override
    public InfoAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View listItem = layoutInflater.inflate(R.layout.listitem, parent, false);
        InfoAdapter.ViewHolder viewHolder = new InfoAdapter.ViewHolder(listItem);
        return viewHolder;
    }


    @Override
    public void onBindViewHolder(InfoAdapter.ViewHolder holder, int position) {
        final actions myListData = listdata.get(position);
        holder.img.setImageResource(listdata.get(position).getimag());
        holder.nameitem.setText(listdata.get(position).getnameitem());

        holder.arrowimg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (holder.getAdapterPosition() == 0) {
                    String text = mcontext.getResources().getString(R.string.Aberdeen);
                    Intent i = new Intent(mcontext, Infomartions_Detalis_Activity.class);
                    i.putExtra(mcontext.getString(R.string.resouce), R.drawable.abd1);
                    i.putExtra(mcontext.getString(R.string.information), text);
                    i.putExtra(mcontext.getString(R.string.latitiude), 26.5504474);
                    i.putExtra(mcontext.getString(R.string.Longitiude), -80.1484385);
                    mcontext.startActivity(i);

                }

                if (holder.getAdapterPosition() == 1) {

                    String text = mcontext.getResources().getString(R.string.Sarasota);
                    Intent i = new Intent(mcontext, Infomartions_Detalis_Activity.class);
                    i.putExtra(mcontext.getString(R.string.resouce), R.drawable.place2);
                    i.putExtra(mcontext.getString(R.string.information), text);
                    i.putExtra(mcontext.getString(R.string.latitiude), 27.3358198);
                    i.putExtra(mcontext.getString(R.string.Longitiude), -82.5299466);
                    mcontext.startActivity(i);

                }

                if (holder.getAdapterPosition() == 2) {

                    String text = mcontext.getResources().getString(R.string.Naples);
                    Intent i = new Intent(mcontext, Infomartions_Detalis_Activity.class);
                    i.putExtra(mcontext.getString(R.string.resouce), R.drawable.place3);
                    i.putExtra(mcontext.getString(R.string.information), text);
                    i.putExtra(mcontext.getString(R.string.latitiude), 26.1523068);
                    i.putExtra(mcontext.getString(R.string.Longitiude), -81.7737796);
                    mcontext.startActivity(i);
                }
                if (holder.getAdapterPosition() == 3) {

                    String text = mcontext.getResources().getString(R.string.Miami);
                    Intent i = new Intent(mcontext, Infomartions_Detalis_Activity.class);
                    i.putExtra(mcontext.getString(R.string.resouce), R.drawable.place4);
                    i.putExtra(mcontext.getString(R.string.information), text);
                    i.putExtra(mcontext.getString(R.string.latitiude), 25.7636761);
                    i.putExtra(mcontext.getString(R.string.Longitiude), -80.1890004);
                    mcontext.startActivity(i);
                }
                if (holder.getAdapterPosition() == 4) {

                    String text = mcontext.getResources().getString(R.string.Augustine);
                    Intent i = new Intent(mcontext, Infomartions_Detalis_Activity.class);
                    i.putExtra(mcontext.getString(R.string.resouce), R.drawable.place5);
                    i.putExtra(mcontext.getString(R.string.information), text);
                    i.putExtra(mcontext.getString(R.string.latitiude), 29.8860397);
                    i.putExtra(mcontext.getString(R.string.Longitiude), -81.2862045);
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
        public ImageView img;
        public RelativeLayout relativeLayout;
        ImageView arrowimg;

        public ViewHolder(View itemView) {
            super(itemView);
            this.img = itemView.findViewById(R.id.list_item1_imageView);
            this.arrowimg = itemView.findViewById(R.id.list_item1_arrow);
            this.nameitem = itemView.findViewById(R.id.list_item1_title_textView);


        }
    }
}
