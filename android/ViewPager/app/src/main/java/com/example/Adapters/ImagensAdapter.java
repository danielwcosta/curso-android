package com.example.Adapters;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.model.Musica;
import com.example.viewholders.ImagensViewHolder;
import com.example.viewpager.R;

import java.util.List;

public class ImagensAdapter extends RecyclerView.Adapter<ImagensViewHolder> {
    private List<Musica> musicaList;

    public ImagensAdapter(List<Musica> musicaList) {
        this.musicaList = musicaList;
    }

    @NonNull
    @Override
    public ImagensViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View layout = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.cardview_frag_imagens, viewGroup,false);
        return new ImagensViewHolder(layout);
    }

    @Override
    public void onBindViewHolder(@NonNull ImagensViewHolder imagensViewHolder, int position) {
        final Musica musica = musicaList.get(position);
            imagensViewHolder.imgBanda.setImageResource(musica.getImgAlbum());
            imagensViewHolder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(),"Banda dahora.",Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return musicaList.size();
    }
}
