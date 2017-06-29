package com.example.draagamadhuri.upcomingmovies;

import android.graphics.drawable.Drawable;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by D.RAAGA MADHURI on 28-Jun-17.
 */

public class AdapterCreate extends RecyclerView.Adapter<AdapterCreate.ViewHolder> {

    public ArrayList<String> names_list;
    public ArrayList<Drawable> image_list;
    public ArrayList<String> dates_list;

    public AdapterCreate(ArrayList<String> names, ArrayList<Drawable> images, ArrayList<String> dates){
        names_list = names;
        image_list = images;
        dates_list = dates;
}

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_type, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.item_name.setText(names_list.get(position));
        holder.item_date.setText(dates_list.get(position));
        holder.item_background.setImageDrawable(image_list.get(position));

        holder.item_background.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }

    @Override
    public int getItemCount() {
        return names_list.size();
    }

public class ViewHolder extends RecyclerView.ViewHolder {
    ImageView item_background;
    TextView item_name;
    TextView item_date;
    public ViewHolder(View itemView) {
        super(itemView);

        item_name = (TextView) itemView.findViewById(R.id.textView);
        item_background = (ImageView) itemView.findViewById(R.id.image);
        item_date = (TextView) itemView.findViewById(R.id.textView3);
    }
}
}

