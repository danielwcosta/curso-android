package com.example.Fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.Adapters.AlbunsAdapter;
import com.example.Adapters.MusicaAdapter;
import com.example.model.Musica;
import com.example.viewpager.R;

import java.util.ArrayList;
import java.util.List;


public class AlbunsFragment extends Fragment {
    private RecyclerView recyclerView;
    private RecyclerView.LayoutManager layoutManager;
    private AlbunsAdapter albunsAdapter;
    private List<Musica> musicaList = new ArrayList<>();

    public AlbunsFragment() {
        // Required empty public constructor
    }
    public static Fragment newInstance() {
        AlbunsFragment albunsFragment = new AlbunsFragment();
        return albunsFragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_albuns, container, false);

        recyclerView = view.findViewById(R.id.frag_albuns_recycler_id);
        recyclerView.setLayoutManager(new LinearLayoutManager(view.getContext(),LinearLayoutManager.VERTICAL,false));

        albunsAdapter = new AlbunsAdapter(adicionarAlbuns());
        recyclerView.setAdapter(albunsAdapter);

        return view;
    }

    private List<Musica> adicionarAlbuns() {
        List<Musica> albunsList = new ArrayList<>();

        albunsList.add(new Musica("Barulho","2001",R.drawable.banda1));
        albunsList.add(new Musica("Calypso","1986",R.drawable.banda2));
        albunsList.add(new Musica("Bar do Moe","1999",R.drawable.banda3));
        albunsList.add(new Musica("Bonecos de bolo","2013",R.drawable.banda4));
        albunsList.add(new Musica("Forrozão baum!!","2020",R.drawable.banda5));

        return  albunsList;
    }
}
