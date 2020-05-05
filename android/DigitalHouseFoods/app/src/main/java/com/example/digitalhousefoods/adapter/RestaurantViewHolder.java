package com.example.digitalhousefoods.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.digitalhousefoods.R;

class RestaurantViewHolder extends ViewHolder {
    public ImageView foto;
    public TextView nome,endereco,horaFechar;
    public CardView cardView;

    public RestaurantViewHolder(@NonNull View itemView) {
        super(itemView);
        foto = itemView.findViewById(R.id.cardview_restaurant_img_id);
        nome = itemView.findViewById(R.id.cardview_restaurant_name_id);
        endereco = itemView.findViewById(R.id.cardview_restaurant_adress_id);
        horaFechar = itemView.findViewById(R.id.cardview_restaurant_closed_time_id);
        cardView = itemView.findViewById(R.id.cardview_restaurant_card_id);
    }
}
