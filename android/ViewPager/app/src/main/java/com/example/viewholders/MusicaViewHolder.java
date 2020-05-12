package com.example.viewholders;

import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.viewpager.R;

public class MusicaViewHolder extends RecyclerView.ViewHolder {
    public CardView cardView;
    public TextView nomeMusica,nomeBanda;

    public MusicaViewHolder(@NonNull View itemView) {
        super(itemView);
        cardView = itemView.findViewById(R.id.cardview_musica_id);
        nomeMusica = itemView.findViewById(R.id.cardview_musica_nome_id);
        nomeBanda = itemView.findViewById(R.id.cardview_musica_banda_id);
    }
}
