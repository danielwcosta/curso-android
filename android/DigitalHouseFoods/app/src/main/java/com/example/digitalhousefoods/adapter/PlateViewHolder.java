package com.example.digitalhousefoods.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.digitalhousefoods.R;


public class PlateViewHolder extends RecyclerView.ViewHolder {
    public ImageView foto;
    public TextView nome;
    public CardView cardView;

    public PlateViewHolder(@NonNull View itemView) {
        super(itemView);
        foto = itemView.findViewById(R.id.cardview_plate_img_id);
        nome = itemView.findViewById(R.id.cardview_plate_name_id);
        cardView = itemView.findViewById(R.id.cardview_plate_card_id);
    }
}
