package com.example.ex_fragmentos;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import frags.CamaroFragment;
import frags.FuscaFragment;

public class CarrosActivity extends AppCompatActivity {

   private Button btn_camaro, btn_fusca;
   private FragmentManager fragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_carros);

        btn_camaro = findViewById(R.id.btn_camaro);
        btn_fusca = findViewById(R.id.btn_fusca);

        btn_camaro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                carregaFragment(new CamaroFragment());
            }
        });

        btn_fusca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                carregaFragment(new FuscaFragment());
            }
        });
    }

    public void carregaFragment(Fragment fragment){
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.container_frag, fragment);
        fragmentTransaction.commit();
    }


}
