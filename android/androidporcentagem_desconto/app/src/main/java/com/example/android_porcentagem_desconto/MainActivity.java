package com.example.android_porcentagem_desconto;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    EditText nomeProduto;
    EditText precoProduto;
    EditText porcentagemDesconto;
    Button btnCalcular;
    Activity activity = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nomeProduto = findViewById(R.id.name_product);
        precoProduto = findViewById(R.id.price_product);
        porcentagemDesconto = findViewById(R.id.discount_percentege);
        btnCalcular = findViewById(R.id.button1);

        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String preco = precoProduto.getText().toString();
                String porcentagem = porcentagemDesconto.getText().toString();
                String nome = nomeProduto.getText().toString();
                DecimalFormat numeroDecimal = new DecimalFormat("#,###.##");


                if(preco.isEmpty() || porcentagem.isEmpty()){
                    Toast.makeText(activity,"Faltando dados, preencha novamente",Toast.LENGTH_LONG).show();
                }else{
                    double priceProduct = Double.parseDouble(preco);
                    double percentegeDiscount = Double.parseDouble(porcentagem);
                    double resultado = calcular(priceProduct,percentegeDiscount);
                    String resultado2Decimais = numeroDecimal.format(resultado);

                    String resultadoString = "O valor do " + nome + " com desconto é R$" + resultado2Decimais;

                    Toast.makeText(activity,resultadoString,Toast.LENGTH_LONG).show();

                }
            }
        });
    }

    public double calcular(double preco,double porcentagemDesconto) {
        return  preco - (preco * (porcentagemDesconto/100));
    }
    }

