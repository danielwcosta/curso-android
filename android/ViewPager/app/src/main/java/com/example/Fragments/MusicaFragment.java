package com.example.Fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.Adapters.MusicaAdapter;
import com.example.model.Musica;
import com.example.viewpager.R;

import java.util.ArrayList;
import java.util.List;


public class MusicaFragment extends Fragment {

    private RecyclerView recyclerView;
    private RecyclerView.LayoutManager layoutManager;
    private MusicaAdapter musicaAdapter;
    private List<Musica> musicaList = new ArrayList<>();

    public MusicaFragment() {
        // Required empty public constructor
    }

    public static Fragment newInstance() {
        MusicaFragment musicaFragment = new MusicaFragment();
        return musicaFragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_musica, container, false);

        recyclerView = view.findViewById(R.id.frag_musica_recycler_id);
        recyclerView.setLayoutManager(new LinearLayoutManager(view.getContext(),LinearLayoutManager.VERTICAL,false));

        musicaAdapter = new MusicaAdapter(adicionarMusicas());
        recyclerView.setAdapter(musicaAdapter);

        return view;
    }

    private static List<Musica> adicionarMusicas() {
        List<Musica> musicas = new ArrayList<>();

        musicas.add(new Musica("PummCaa tsss","Rocke barulhento"));
        musicas.add(new Musica("Ele comeu tudo","Calypso"));
        musicas.add(new Musica("Ui are de ordi","Simpsons"));
        musicas.add(new Musica("ielom subimarine","Beatles"));
        musicas.add(new Musica("Arrastão do Forró!","Zeca & banda Musical"));
        musicas.add(new Musica("PummCaa tsss","Rocke barulhento"));
        musicas.add(new Musica("Ele comeu tudo","Calypso"));
        musicas.add(new Musica("Ui are de ordi","Simpsons"));
        musicas.add(new Musica("ielom subimarine","Beatles"));
        musicas.add(new Musica("Arrastão do Forró!","Zeca & banda Musical"));
        musicas.add(new Musica("PummCaa tsss","Rocke barulhento"));
        musicas.add(new Musica("Ele comeu tudo","Calypso"));
        musicas.add(new Musica("Ui are de ordi","Simpsons"));
        musicas.add(new Musica("ielom subimarine","Beatles"));
        musicas.add(new Musica("Arrastão do Forró!","Zeca & banda Musical"));
        musicas.add(new Musica("PummCaa tsss","Rocke barulhento"));
        musicas.add(new Musica("Ele comeu tudo","Calypso"));
        musicas.add(new Musica("Ui are de ordi","Simpsons"));
        musicas.add(new Musica("ielom subimarine","Beatles"));
        musicas.add(new Musica("Arrastão do Forró!","Zeca & banda Musical"));

        return musicas;
    }
}
