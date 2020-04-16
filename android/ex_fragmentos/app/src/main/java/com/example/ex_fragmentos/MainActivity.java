package com.example.ex_fragmentos;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    private Button btnEntrar;
    private EditText editNome, editEmail, editSenha;
    private Activity activity = this;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnEntrar = findViewById(R.id.btn_entrar);
        editNome = findViewById(R.id.id_nome);
        editEmail = findViewById(R.id.id_email);
        editSenha = findViewById(R.id.id_senha);

        btnEntrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nome = editNome.getText().toString();
                String email = editEmail.getText().toString();
                String senha = editSenha.getText().toString();

                if(nome.isEmpty() || email.isEmpty() || senha.isEmpty()){
                    Snackbar.make(btnEntrar,"Preencha os dados corretamente pooohhhh!!!",Snackbar.LENGTH_LONG).show();
                }else{
                    Intent intent = new Intent(activity,BemVindoActivity.class);

                    Bundle infosLogin = new Bundle();
                    infosLogin.putString("NOME",nome);
                    infosLogin.putString("EMAIL",email);
                    infosLogin.putString("SENHA",senha);

                    intent.putExtras(infosLogin);

                    startActivity(intent);
                }
            }
        });
    }
}
