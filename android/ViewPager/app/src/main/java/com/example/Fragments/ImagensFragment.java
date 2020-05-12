package com.example.Fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.Adapters.ImagensAdapter;
import com.example.model.Musica;
import com.example.sobestudo.ImagensFragAdapter;
import com.example.viewholders.ImagensViewHolder;
import com.example.viewpager.R;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class ImagensFragment extends Fragment {
    private RecyclerView recyclerView;
    private RecyclerView.LayoutManager layoutManager;
    private ImagensAdapter imagensAdapter;
    private List<Musica> musicaList = new ArrayList<>();


    public ImagensFragment() {
        // Required empty public constructor
    }


    public static ImagensFragment newInstance() {
        ImagensFragment imagensFragment = new ImagensFragment();

        return imagensFragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_imagens, container, false);
//        ViewPager viewPager = view.findViewById(R.id.imagens_viewpager_id);

        recyclerView = view.findViewById(R.id.frag_imagens_recycler_id);
        recyclerView.setLayoutManager(new LinearLayoutManager(view.getContext(),LinearLayoutManager.VERTICAL,false));

        imagensAdapter = new ImagensAdapter(adicionarImagens());
        recyclerView.setAdapter(imagensAdapter);

        return view;
    }

    private List<Musica> adicionarImagens() {
        List<Musica> imagensList = new ArrayList<>();
            imagensList.add(new Musica(R.drawable.banda1));
            imagensList.add(new Musica(R.drawable.banda2));
            imagensList.add(new Musica(R.drawable.banda3));
            imagensList.add(new Musica(R.drawable.banda4));
            imagensList.add(new Musica(R.drawable.banda5));
        return imagensList;
    }


}
