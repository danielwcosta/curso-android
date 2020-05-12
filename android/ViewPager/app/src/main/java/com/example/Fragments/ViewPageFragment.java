package com.example.Fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.viewpager.R;

public class ViewPageFragment extends Fragment {

    public ViewPageFragment() {
        // Required empty public constructor
    }

    public static ViewPageFragment newInstance(String text){
        ViewPageFragment fragment = new ViewPageFragment();
        Bundle bundle = new Bundle();
        bundle.putString("TEXT",text);

        fragment.setArguments(bundle);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_view_page, container, false);
        TextView texto = view.findViewById(R.id.txt_bacanudo_id);
        texto.setText(getArguments().getString("TEXT"));
        return view;
    }
}
