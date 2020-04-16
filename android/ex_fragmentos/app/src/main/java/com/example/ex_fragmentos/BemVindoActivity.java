package com.example.ex_fragmentos;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class BemVindoActivity extends AppCompatActivity {

    private Button btn_avancar;
    private TextView nomePerfil,emailPerfil,senhaPerfil;
    private Activity activity = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bem_vindo);

        btn_avancar = findViewById(R.id.btn_vamos);
        nomePerfil = findViewById(R.id.id_bemVindo_nome);
        emailPerfil = findViewById(R.id.id_bemVindo_email);
        senhaPerfil = findViewById(R.id.id_bemVindo_senha);

        if(getIntent() != null){
            Bundle infosLogin = getIntent().getExtras();
            if(infosLogin != null){
                nomePerfil.setText(infosLogin.getString("NOME"));
                emailPerfil.setText(infosLogin.getString("EMAIL"));
                senhaPerfil.setText(infosLogin.getString("SENHA"));
            }
        }

        btn_avancar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(activity,CarrosActivity.class);
                startActivity(intent);
            }
        });
    }
}
