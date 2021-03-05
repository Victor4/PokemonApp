package com.victor.core.data

import com.google.gson.annotations.SerializedName

data class PokemonColor(
    @SerializedName("color") val color: Color,
)

data class Color(
    @SerializedName("name") val nameColor: String,
)

