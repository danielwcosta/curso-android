package com.example.Adapters;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.model.Musica;
import com.example.viewholders.AlbunsViewHolder;
import com.example.viewholders.ImagensViewHolder;
import com.example.viewpager.R;

import java.util.List;

public class AlbunsAdapter extends RecyclerView.Adapter<AlbunsViewHolder> {
    private List<Musica> albunsList;

    public AlbunsAdapter(List<Musica> albunsList) {
        this.albunsList = albunsList;
    }

    @NonNull
    @Override
    public AlbunsViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int position) {
        View layout = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.cardview_frag_albuns, viewGroup,false);
        return new AlbunsViewHolder(layout);
    }

    @Override
    public void onBindViewHolder(@NonNull AlbunsViewHolder albunsViewHolder, int position) {
        final Musica musica = albunsList.get(position);
        albunsViewHolder.imgBanda.setImageResource(musica.getImgAlbum());
        albunsViewHolder.nomeAlbum.setText(musica.getNomeAlbum());
        albunsViewHolder.anoAlbum.setText("Ano - " + musica.getAnoAlbum());
        albunsViewHolder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(),musica.getNomeAlbum(),Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return albunsList.size();
    }
}
