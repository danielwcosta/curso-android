package com.example.digitalhousefoods.view;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.digitalhousefoods.R;

import static com.example.digitalhousefoods.useful.Useful.editTextIsEmpty;
import static com.example.digitalhousefoods.useful.Useful.fazIntent;

public class MainActivity extends AppCompatActivity {


    private EditText editEmail, editPassword;
    private Button btnLogin, btnRegister;
    private Activity activity = this;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (editTextIsEmpty(editEmail, editPassword)) {
                    Toast.makeText(activity, "Preencha todos os campos!", Toast.LENGTH_LONG).show();

                } else {
                    Toast.makeText(activity, "Acertoooooo Mizeraaaaviiiii!!!", Toast.LENGTH_LONG).show();
                    fazIntent(activity,RecycleRestaurantActivity.class);
                }
            }
        });

        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fazIntent(activity,RegisterActivity.class);
                            }
        });
    }

    private void initView() {
        editEmail = findViewById(R.id.main_email_id);
        editPassword = findViewById(R.id.main_password_id);
        btnLogin = findViewById(R.id.main_btn_login_id);
        btnRegister = findViewById(R.id.main_btn_register_id);
    }



}

