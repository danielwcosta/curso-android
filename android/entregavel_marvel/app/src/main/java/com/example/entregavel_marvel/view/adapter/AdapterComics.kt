package com.example.entregavel_marvel.view.adapter

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.support.v4.content.ContextCompat.startActivity
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.entregavel_marvel.R
import com.example.entregavel_marvel.model.Comic
import com.example.entregavel_marvel.view.ComicDetailsActivity
import com.squareup.picasso.Picasso

class AdapterComics(
    private val list: MutableSet<Comic>,
    private val context: Context
): RecyclerView.Adapter<ViewHolderComics>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolderComics {
        val view = LayoutInflater.from(context).inflate(R.layout.cardview_comic, parent, false)
        return ViewHolderComics(view)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    @SuppressLint("SetTextI18n")
    override fun onBindViewHolder(holder: ViewHolderComics, position: Int) {
        val comic = list.elementAt(position)
        if (comic != null) {
            Picasso.get().load(comic.thumbnail.path + "." +comic.thumbnail.extension).into(holder.image)
          holder.tag.text = "#" + comic.issueNumber.toString()
            holder.cardView.setOnClickListener {

            var intent = Intent(it.context,ComicDetailsActivity::class.java)
            intent.putExtra("comic",comic)
            it.context.startActivity(intent)
        }
        }

    }

}