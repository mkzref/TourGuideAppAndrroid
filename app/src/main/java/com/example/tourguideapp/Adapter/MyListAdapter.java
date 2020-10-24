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

public class MyListAdapter extends RecyclerView.Adapter<MyListAdapter.ViewHolder> {
    private Context mcontext;
    private List<actions> listdata;

    public MyListAdapter(Context mcontext, List<actions> listdata) {
        this.mcontext = mcontext;
        this.listdata = listdata;

    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View listItem = layoutInflater.inflate(R.layout.listitem, parent, false);
        ViewHolder viewHolder = new ViewHolder(listItem);
        return viewHolder;
    }


    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        final actions myListData = listdata.get(position);
        holder.img.setImageResource(listdata.get(position).getimag());
        holder.nameitem.setText(listdata.get(position).getnameitem());

        holder.arrowimg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (holder.getAdapterPosition() == 0) {
                    Intent i = new Intent(mcontext, TabbedActivity.class);
                    i.putExtra(mcontext.getString(R.string.tabs), 0);
                    mcontext.startActivity(i);


                }

                if (holder.getAdapterPosition() == 1) {

                    Intent i = new Intent(mcontext, TabbedActivity.class);
                    i.putExtra(mcontext.getString(R.string.tabs), 1);
                    mcontext.startActivity(i);

                }

                if (holder.getAdapterPosition() == 2) {

                    Intent i = new Intent(mcontext, TabbedActivity.class);
                    i.putExtra(mcontext.getString(R.string.tabs), 2);
                    mcontext.startActivity(i);
                }
                if (holder.getAdapterPosition() == 3) {

                    Intent i = new Intent(mcontext, TabbedActivity.class);
                    i.putExtra(mcontext.getString(R.string.tabs), 3);
                    mcontext.startActivity(i);
                }
                if (holder.getAdapterPosition() == 4) {

                    Intent i = new Intent(mcontext, TabbedActivity.class);
                    i.putExtra(mcontext.getString(R.string.tabs), 4);
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
