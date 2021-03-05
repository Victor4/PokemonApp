package com.victor.core.data

import com.google.gson.annotations.SerializedName

data class PokemonSprites(
    @SerializedName("other") val other: PokemonOthersSprites
)

data class PokemonOthersSprites(
    @SerializedName("official-artwork") val officialArtwork: DreamWorld
)

data class DreamWorld(
    @SerializedName("front_default") val frontDefault: String
)
