package com.example.viewholders;

import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.viewpager.R;

public class AlbunsViewHolder extends RecyclerView.ViewHolder {
    public CardView cardView;
    public ImageView imgBanda;
    public TextView nomeAlbum,anoAlbum;

    public AlbunsViewHolder(@NonNull View itemView) {
        super(itemView);
        cardView = itemView.findViewById(R.id.cardview_albuns_id);
        imgBanda = itemView.findViewById(R.id.cardview_albuns_img_banda_id);
        nomeAlbum = itemView.findViewById(R.id.cardview_albuns_nome_id);
        anoAlbum = itemView.findViewById(R.id.cardview_albuns_ano_id);
    }
}
