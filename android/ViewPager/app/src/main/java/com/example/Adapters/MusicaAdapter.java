package com.example.Adapters;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.model.Musica;
import com.example.viewholders.MusicaViewHolder;
import com.example.viewpager.R;

import java.util.List;

public class MusicaAdapter extends RecyclerView.Adapter<MusicaViewHolder> {
    private List<Musica> musicaList;

    public MusicaAdapter(List<Musica> musicaList) {
        this.musicaList = musicaList;
    }

    @NonNull
    @Override
    public MusicaViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View layout = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.cardview_frag_musica, viewGroup,false);
        return new MusicaViewHolder(layout);
    }

    @Override
    public void onBindViewHolder(@NonNull MusicaViewHolder musicaViewHolder, int position) {
        final Musica musica = musicaList.get(position);
        musicaViewHolder.nomeMusica.setText(musica.getNomeMusica());
        musicaViewHolder.nomeBanda.setText(musica.getNomeBanda_artista());
        musicaViewHolder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(),musica.getNomeMusica(),Toast.LENGTH_SHORT).show();
            }
        });

    }

    @Override
    public int getItemCount() {
        return musicaList.size();
    }
}
