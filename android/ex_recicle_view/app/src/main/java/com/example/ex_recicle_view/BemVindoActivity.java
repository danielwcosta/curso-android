package com.example.ex_recicle_view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class BemVindoActivity extends AppCompatActivity {

    private TextView nomeCompleto, idade;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bem_vindo);

        nomeCompleto = findViewById(R.id.bemvindo_nome_sobrenome_id);
        idade = findViewById(R.id.bemvindo_idade_id);

        if (getIntent() != null){
            Bundle bundle = getIntent().getExtras();
                if(bundle != null){
                    String nome = bundle.getString("nome");
                    String sobrenome = bundle.getString("sobrenome");
                    String qtdAniversarios = bundle.getString("idade");
                    nomeCompleto.setText(nome + " "+ sobrenome);
                    idade.setText("Tem " + qtdAniversarios + " anos");
                }
        }
    }
}
