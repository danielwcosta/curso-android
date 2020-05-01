package com.example.ex_recicle_view;

import android.view.View;
import android.widget.TextView;

import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;

public class PessoaViewHolder extends RecyclerView.ViewHolder {
    public TextView nome;
    public TextView sobrenome;
    public TextView idade;
    public CardView cardView;

    public PessoaViewHolder(View layout){
        super(layout);
        nome = layout.findViewById(R.id.nome_id);
        sobrenome = layout.findViewById(R.id.sobrenome_id);
        idade = layout.findViewById(R.id.idade_id);
        cardView = layout.findViewById(R.id.cardView);
    }
}
