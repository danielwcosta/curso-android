package com.example.entregavel_marvel.view

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.example.entregavel_marvel.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val nome = findViewById<EditText>(R.id.login_name)
        val email = findViewById<EditText>(R.id.login_email)
        val senha = findViewById<EditText>(R.id.login_password)
        val btnSave = findViewById<Button>(R.id.login_btnsave)
    btnSave.setOnClickListener {
        if(editTextIsEmpty(nome,email,senha)){
            Toast.makeText(it.context, "Preencha todos os campos!", Toast.LENGTH_LONG).show()

        }else{
        startActivity(Intent(this,ComicsActivity::class.java))}
    }
    }

}

fun editTextIsEmpty(vararg editTexts: EditText): Boolean {
    for (editText in editTexts) {
        if (editText.text.toString().isEmpty()) {
            return true
        }
    }
    return false
}