package com.victor.core.data

import com.google.gson.annotations.SerializedName

data class PokemonData(
    @SerializedName("name") val name: String,
    var color : String,
    @SerializedName("species") val species: PokemonSpecies,
    @SerializedName("sprites") val sprites: PokemonSprites,
    @SerializedName("types") val types: List<PokemonTypes>
)
