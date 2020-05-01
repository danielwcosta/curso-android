package com.example.ex_recicle_view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import model.Pessoa;

public class RecycleActivity extends AppCompatActivity {

   private RecyclerView recycler;
   private RecyclerView.LayoutManager layoutManager;
   private Adapter adapter;
   private List<Pessoa> pessoaList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycle);


        recycler = findViewById(R.id.recycler);
        layoutManager = new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        adapter = new Adapter(adicionarPessoas());

        recycler.setLayoutManager(layoutManager);
        recycler.setAdapter(adapter);
    }

    private static List<Pessoa> adicionarPessoas() {
        List<Pessoa> pessoas = new ArrayList<>();

        pessoas.add(new  Pessoa("Daniel","Wong",12));
        pessoas.add(new Pessoa("Samuel","Tong",13));
        pessoas.add(new Pessoa("Ariel","Kong",14));
        pessoas.add(new Pessoa("Miguel","Long",15));
        pessoas.add(new Pessoa("Gabriel","Pong",16));
        pessoas.add(new Pessoa("Muriel","Zong",17));

        return pessoas;
    }
}
