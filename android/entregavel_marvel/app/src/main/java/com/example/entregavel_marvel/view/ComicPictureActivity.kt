package com.example.entregavel_marvel.view

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.example.entregavel_marvel.R
import com.example.entregavel_marvel.model.Comic
import com.squareup.picasso.Picasso

class ComicPictureActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_comic_picture)

        val comic = intent.extras?.getParcelable<Comic>("comic")

        val voltar = findViewById<ImageView>(R.id.comicdpicture_close_id)
        val imagem = findViewById<ImageView>(R.id.comicdpicture_img_id)

        voltar.setOnClickListener {onBackPressed()}


        if (comic != null) {
            Picasso.get().load(comic.thumbnail.path + "." +comic.thumbnail.extension).into(imagem)
        }else{
            Picasso.get().load("https://www.google.com/url?sa=i&url=https%3A%2F%2Fpt.wikipedia.org%2Fwiki%2FFicheiro%3AItem_sem_imagem.svg&psig=AOvVaw1hkxXso2rR6jgOsAV6v6Ug&ust=1591756273559000&source=images&cd=vfe&ved=0CAIQjRxqFwoTCJjy4a_Y8-kCFQAAAAAdAAAAABAD").into(imagem)
        }

    }
}