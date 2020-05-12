package com.example.sobestudo;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.viewpager.R;


public class ImagensViewFragment extends Fragment {

    private ImageView imagemBandas;

    public ImagensViewFragment() {
        // Required empty public constructor
    }

    public static ImagensViewFragment newInstance(int id_imagem) {
        ImagensViewFragment imagensFragment = new ImagensViewFragment();
        Bundle bundle = new Bundle();
        bundle.putInt("IMAGEM",id_imagem);

        imagensFragment.setArguments(bundle);
        return imagensFragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_imagens_view, container, false);


        ImageView imagemBandas = view.findViewById(R.id.frag_imagens_img_banda_id);

        imagemBandas.setImageResource(Integer.parseInt(getArguments().getString("IMAGEM")));
        return view;
    }
}
