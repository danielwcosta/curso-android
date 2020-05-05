package com.example.digitalhousefoods.adapter;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.digitalhousefoods.Model.Plate;
import com.example.digitalhousefoods.R;
import com.example.digitalhousefoods.view.PlateActivity;
import com.example.digitalhousefoods.view.RecyclePlatesActivity;

import java.util.List;

public class PlateAdapter extends RecyclerView.Adapter<PlateViewHolder> {

    private List<Plate> plateList;

    public PlateAdapter(List<Plate> plateList) {
        this.plateList = plateList;
    }

    @NonNull
    @Override
    public PlateViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.cardview_plate,viewGroup,false);
        return new PlateViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PlateViewHolder plateViewHolder, int position) {
        final Plate prato = plateList.get(position);
        plateViewHolder.foto.setImageResource(prato.getFotoPrato());
        plateViewHolder.nome.setText(prato.getNomePrato());
        plateViewHolder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(), "Olha o piriri chegando...", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(v.getContext(), PlateActivity.class);
                intent.putExtra("prato",prato);
                v.getContext().startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return plateList.size();
    }
}
