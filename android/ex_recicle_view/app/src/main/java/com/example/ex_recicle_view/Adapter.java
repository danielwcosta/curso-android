package com.example.ex_recicle_view;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import model.Pessoa;


public class Adapter extends RecyclerView.Adapter<PessoaViewHolder> {
    private List<Pessoa> pessoaList;


    public Adapter(List<Pessoa> pessoaList) {
        this.pessoaList = pessoaList;
    }

    @NonNull
    @Override
    public PessoaViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View layout = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.texto, viewGroup,false);
        return new PessoaViewHolder(layout);
    }

    @Override
    public void onBindViewHolder(@NonNull PessoaViewHolder pessoaViewHolder, int position) {
        final Pessoa pessoa = pessoaList.get(position);
        pessoaViewHolder.nome.setText(pessoa.getNome());
        pessoaViewHolder.sobrenome.setText(pessoa.getSobrenome());
        pessoaViewHolder.idade.setText((pessoa.getIdade()) + " anos");
        pessoaViewHolder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Context context = v.getContext();
                String nome = pessoa.getNome();
                String sobrenome = pessoa.getSobrenome();
                String idade = Integer.toString(pessoa.getIdade());

                Toast.makeText(context,nome + " "+ sobrenome,Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(v.getContext(),BemVindoActivity.class);
                Bundle bundle = new Bundle();
                 bundle.putString("nome",nome);
                 bundle.putString("sobrenome",sobrenome);
                 bundle.putString("idade",idade);

                intent.putExtras(bundle);
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return pessoaList.size();
    }
}
