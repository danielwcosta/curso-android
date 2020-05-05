package com.example.digitalhousefoods.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.digitalhousefoods.R;
import com.example.digitalhousefoods.adapter.RestaurantAdapter;

import java.util.ArrayList;
import java.util.List;

import com.example.digitalhousefoods.Model.Restaurant;

public class RecycleRestaurantActivity extends AppCompatActivity {

    private RecyclerView recycleRestaurants;
    private RecyclerView.LayoutManager layoutManager;
    private RestaurantAdapter adapter;
    private List<Restaurant> restaurantList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycle_restaurant);

        recycleRestaurants = findViewById(R.id.recycle_restaurant_view);
        layoutManager = new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        adapter = new RestaurantAdapter(addRestaurant());

        recycleRestaurants.setLayoutManager(layoutManager);
        recycleRestaurants.setAdapter(adapter);
    }

    private static List<Restaurant> addRestaurant(){
        List<Restaurant> restaurants = new ArrayList<>();

        restaurants.add(new Restaurant(R.drawable.restaurant_tony_img,"Tony Roma's","Logo ali","22:00"));
        restaurants.add(new Restaurant(R.drawable.restaurant_aoyama_img,"Aoyama - Moema","Rua de baixo","23:30"));
        restaurants.add(new Restaurant(R.drawable.restaurant_outback_img,"Outback - Perdizes","Rua de cima","00:00"));
        restaurants.add(new Restaurant(R.drawable.restaurant_sisenor_img,"Si señor!","Lá na Piiiiiiiiiii","23:47"));

        return restaurants;
    }
}
