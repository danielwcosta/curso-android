package com.example.digitalhousefoods.view;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.digitalhousefoods.Model.Plate;
import com.example.digitalhousefoods.Model.Restaurant;
import com.example.digitalhousefoods.R;

import static com.example.digitalhousefoods.useful.Useful.fazIntent;

public class PlateActivity extends AppCompatActivity {

    private ImageView setaVoltar, imgPrato;
    private TextView nomePrato;
    private TextView descricaoPrato;

    private Activity activity = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plate);

        initView();
        if(getIntent() != null) {
            geraViewsFixas();
        }
    }

    private void geraViewsFixas() {
        Plate prato = getIntent().getExtras().getParcelable("prato");
        nomePrato.setText(prato.getNomePrato());
        imgPrato.setImageResource(prato.getFotoPrato());
        descricaoPrato.setText(prato.getDescricaoPrato());

        setaVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fazIntent(activity, RecyclePlatesActivity.class);
            }
        });
    }

    private void initView() {
        setaVoltar = findViewById(R.id.plate_backarrow_id);
        nomePrato = findViewById(R.id.plate_name_id);
        imgPrato = findViewById(R.id.plate_img_id);
        descricaoPrato = findViewById(R.id.plate_description_id);

    }
}
