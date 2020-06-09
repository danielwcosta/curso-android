package com.example.entregavel_marvel.network

import com.example.entregavel_marvel.model.ComicResponse
import retrofit2.http.GET
import retrofit2.http.Query


interface ServiceMarvel {

    @GET("comics?")
    suspend fun getComic(
        @Query("limit") limit :Int,
        @Query("ts") ts : String,
        @Query("hash") hash : String,
        @Query("apikey") apikey : String
    ) : ComicResponse
}