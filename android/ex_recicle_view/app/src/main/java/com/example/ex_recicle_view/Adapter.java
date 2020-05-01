package com.example.ex_recicle_view;

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
                Toast.makeText(v.getContext(),pessoa.getNome() + " "+ pessoa.getSobrenome(),Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return pessoaList.size();
    }
}
