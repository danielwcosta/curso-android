package com.example.digitalhousefoods.view;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.digitalhousefoods.R;

import static com.example.digitalhousefoods.useful.Useful.editTextIsEmpty;
import static com.example.digitalhousefoods.useful.Useful.fazIntent;

public class RegisterActivity extends AppCompatActivity {

    private ImageView setaVoltar;
    private EditText nome,email,password,confirmPassword;
    private Button btnRegistrar;

    private Activity activity = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        initView();

        setaVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fazIntent(activity,MainActivity.class);
            }
        });

        btnRegistrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(editTextIsEmpty(nome,email,password,confirmPassword)){
                    Toast.makeText(activity, "Preencha todos os campos!", Toast.LENGTH_LONG).show();
                }else{
                    Toast.makeText(activity, "Tudo registrado bunitinho!", Toast.LENGTH_SHORT).show();
                    fazIntent(activity,MainActivity.class);
                }
            }
        });


    }

    private void initView() {
        setaVoltar = findViewById(R.id.register_img_seta_voltar_id);
        nome = findViewById(R.id.register_nome_id);
        email = findViewById(R.id.register_email_id);
        password = findViewById(R.id.register_password_id);
        confirmPassword = findViewById(R.id.register_confirm_password_id);
        btnRegistrar = findViewById(R.id.register_btn_register_id);
    }
}
