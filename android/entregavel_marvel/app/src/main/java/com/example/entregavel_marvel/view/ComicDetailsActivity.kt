package com.example.entregavel_marvel.view

import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.support.annotation.RequiresApi
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import com.example.entregavel_marvel.databinding.ActivityComicDetailsBinding
import com.example.entregavel_marvel.model.Comic
import com.squareup.picasso.Picasso


class ComicDetailsActivity : AppCompatActivity() {
    private lateinit var binding: ActivityComicDetailsBinding

    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityComicDetailsBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val comic = intent.extras?.getParcelable<Comic>("comic")
        binding.comicdetailsBackarrowId.setOnClickListener {onBackPressed()}

        binding.comicdetailsGibiId.setOnClickListener {
            if (comic != null) {
                var intent = Intent(it.context, ComicPictureActivity::class.java)
            intent.putExtra("comic", comic)
            it.context.startActivity(intent)
            }else{
                Toast.makeText(it.context, "Este quadrinho não se encontra mais nos dados.", Toast.LENGTH_LONG).show()

            }
        }

        if (comic != null) {
            Picasso.get().load(comic.thumbnail.path + "." +comic.thumbnail.extension).into(binding.comicdetailsImgId)
            Picasso.get().load(comic.images[0].path + "." +comic.images[0].extension).into(binding.comicdetailsGibiId)
            binding.comicdetailsTitleId.text = comic.title
            binding.comicdetailsDescriptionId.text = comic.description
            binding.comicdetailsPublishedId.text = comic.dates[0].date
            binding.comicdetailsPriceId.text = comic.prices[0].price.toString()
            binding.comicdetailsPagesId.text = comic.pageCount.toString()
        }
    }
}