package com.example.viewholders;

import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;

import com.example.viewpager.R;

public class ImagensViewHolder extends RecyclerView.ViewHolder {

    public CardView cardView;
    public ImageView imgBanda;

    public ImagensViewHolder(@NonNull View itemView) {
        super(itemView);
        cardView = itemView.findViewById(R.id.cardview_imagens_id);
        imgBanda = itemView.findViewById(R.id.cardview_imagens_img_banda_id);
    }
}
