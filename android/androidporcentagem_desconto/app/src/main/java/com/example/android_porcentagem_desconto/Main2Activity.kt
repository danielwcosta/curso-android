package com.example.android_porcentagem_desconto

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.text.isDigitsOnly
import com.example.android_porcentagem_desconto.databinding.ActivityMain2Binding
import java.text.DecimalFormat

class Main2Activity : AppCompatActivity() {

    private lateinit var binding: ActivityMain2Binding
    private lateinit var nomeProduto: EditText
    private lateinit var precoProduto: EditText
    private lateinit var porcentagemDesconto: EditText
    private lateinit var btnCalcular: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button1.setOnClickListener {
            var preco = binding.priceProduct.text.toString().toDoubleOrNull()
            var porcentagem =binding.discountPercentege.text.toString().toDoubleOrNull()
            var nome =binding.nameProduct.text.toString()
            var numeroDecimal = DecimalFormat("#,###.##")

                if (preco == null || porcentagem==null || nome.isBlank()) {
                    Toast.makeText(this, "Ta faltando coisa aeee...", Toast.LENGTH_LONG).show()
                }else{
                    var resultado = numeroDecimal.format(calcular(preco,porcentagem))
                    var fraseResposta = "O valor do " + nome + " com desconto é R$" + resultado

                    Toast.makeText(this, fraseResposta, Toast.LENGTH_LONG).show()
                }

        }

    }

    public fun calcular(preco: Double, porcentagemDescoto: Double): Double {
        var valorComDesconto = preco - (preco*(porcentagemDescoto/100))
        if(valorComDesconto<0){return 0.0
        }
        return valorComDesconto
    }
}
