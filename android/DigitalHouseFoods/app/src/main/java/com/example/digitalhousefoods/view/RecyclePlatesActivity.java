package com.example.digitalhousefoods.view;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.digitalhousefoods.R;
import com.example.digitalhousefoods.adapter.PlateAdapter;
import com.example.digitalhousefoods.adapter.RestaurantAdapter;

import java.util.ArrayList;
import java.util.List;

import com.example.digitalhousefoods.Model.Plate;
import com.example.digitalhousefoods.Model.Restaurant;

import static com.example.digitalhousefoods.useful.Useful.fazIntent;

public class RecyclePlatesActivity extends AppCompatActivity {

    private ImageView setaVoltar,imgRestaurante;
    private TextView nomeRestaurante;
    private RecyclerView recyclePlates;
    private RecyclerView.LayoutManager layoutManager;
    private PlateAdapter adapterPlate;
    private List<Plate> platesList = new ArrayList<>();

    private Activity activity = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycle_plates);

        initView();
        if(getIntent() != null) {
            geraViewsFixas();
        }

        adapterPlate = new PlateAdapter(listaDePratos());
        recyclePlates.setAdapter(adapterPlate);
        layoutManager = new GridLayoutManager(this,2);
        recyclePlates.setLayoutManager(layoutManager);



    }
    private List<Plate> listaDePratos(){
        List<Plate> prato = new ArrayList<>();

        for (int i = 0; i < 15; i++) {
            prato.add(new Plate(R.drawable.plate_salada_img, "Salada ao molho de Gengibre", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vivamus eu velit tempor."));
        }

        return prato;
    }
    private void geraViewsFixas() {
            Restaurant restaurant = getIntent().getExtras().getParcelable("restaurant");
            nomeRestaurante.setText(restaurant.getNome());
            imgRestaurante.setImageResource(restaurant.getFoto());

        setaVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fazIntent(activity, RecycleRestaurantActivity.class);
            }
        });
    }

    private void initView() {
        setaVoltar = findViewById(R.id.recycle_plates_backarrow_id);
        nomeRestaurante = findViewById(R.id.recycle_plates_name_id);
        imgRestaurante = findViewById(R.id.recycle_plates_restaurant_img_id);
        recyclePlates = findViewById(R.id.recycle_plates_recycleview_id);
    }


}
