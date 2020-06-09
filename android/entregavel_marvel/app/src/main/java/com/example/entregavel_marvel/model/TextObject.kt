package com.example.entregavel_marvel.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class TextObject(
    val language: String,
    val text: String,
    val type: String
):Parcelable