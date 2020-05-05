package com.example.digitalhousefoods.adapter;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.digitalhousefoods.R;
import com.example.digitalhousefoods.view.RecyclePlatesActivity;

import java.util.List;

import com.example.digitalhousefoods.Model.Restaurant;


public class RestaurantAdapter extends RecyclerView.Adapter<RestaurantViewHolder> {
    private List<Restaurant> restaurantList;

    public RestaurantAdapter(List<Restaurant> restaurantList) {
        this.restaurantList = restaurantList;
    }

    @NonNull
    @Override
    public RestaurantViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View layout = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.cardview_restaurant, viewGroup,false);
        return new RestaurantViewHolder(layout);
    }

    @Override
    public void onBindViewHolder(@NonNull RestaurantViewHolder restaurantViewHolder, int position) {
        final Restaurant restaurant = restaurantList.get(position);
        restaurantViewHolder.nome.setText(restaurant.getNome());
        restaurantViewHolder.endereco.setText(restaurant.getEndereco());
        restaurantViewHolder.horaFechar.setText(restaurant.getHoraFechar());
        restaurantViewHolder.foto.setImageResource(restaurant.getFoto());
        restaurantViewHolder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(), "Restaurante ruim da porra...", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(v.getContext(), RecyclePlatesActivity.class);
                intent.putExtra("restaurant",restaurant);
                v.getContext().startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return restaurantList.size();
    }
}
