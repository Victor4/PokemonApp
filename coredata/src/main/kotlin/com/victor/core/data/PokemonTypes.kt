package com.victor.core.data

import com.google.gson.annotations.SerializedName

data class PokemonTypes(
    @SerializedName("slot") val slot: String,
    @SerializedName("type") val type: Type,
)

data class Type(
    @SerializedName("name") val name: String,
    @SerializedName("url") val url: String,
)
