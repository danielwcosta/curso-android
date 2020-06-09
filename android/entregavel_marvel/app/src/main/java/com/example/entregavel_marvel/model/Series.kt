package com.example.entregavel_marvel.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Series(
    val name: String,
    val resourceURI: String
):Parcelable