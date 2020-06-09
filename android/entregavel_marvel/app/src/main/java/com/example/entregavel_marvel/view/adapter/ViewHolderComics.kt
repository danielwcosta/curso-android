package com.example.entregavel_marvel.view.adapter

import android.support.v7.widget.CardView
import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import com.example.entregavel_marvel.R

class ViewHolderComics(itemView: View) : RecyclerView.ViewHolder(itemView) {

    val image : ImageView = itemView.findViewById(R.id.cardview_comic_img_id)
    val tag: TextView = itemView.findViewById(R.id.cardview_comic_txt_id)
    val cardView: CardView = itemView.findViewById(R.id.cardview_comic_card_id)
}