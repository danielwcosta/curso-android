package com.example.entregavel_marvel.view

import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModelProviders
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.GridLayoutManager
import android.support.v7.widget.RecyclerView
import com.example.entregavel_marvel.R
import com.example.entregavel_marvel.model.Comic
import com.example.entregavel_marvel.view.adapter.AdapterComics
import com.example.entregavel_marvel.viewmodel.ViewModelMarvel


class ComicsActivity : AppCompatActivity() {

    private var results = mutableSetOf<Comic>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_comics)

        val recycler = findViewById<RecyclerView>(R.id.comics_recyclerview)
        val  viewModelComics = ViewModelProviders.of(this).get(ViewModelMarvel::class.java)

        val adapterComics = AdapterComics(results,this)
        recycler.adapter = adapterComics
        val layoutManager = GridLayoutManager(this, 3)
        recycler.layoutManager = layoutManager

        viewModelComics.getAllComics()
        viewModelComics.listMutableComic.observe(this,Observer {it?.let {
                    results.addAll(it)
                    adapterComics.notifyDataSetChanged()
                }
            }
        )
    }
}

