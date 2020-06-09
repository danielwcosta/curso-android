package com.example.entregavel_marvel.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class ItemX(
    val name: String,
    val resourceURI: String,
    val role: String
):Parcelable