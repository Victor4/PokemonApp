package com.victor.core.remote

import com.victor.core.data.PokemonColor
import com.victor.core.data.PokemonData
import com.victor.core.data.PokemonResponse
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface PokemonApi {

    @GET("pokemon")
    suspend fun getPokemons(
        @Query("offset") offset: Int,
        @Query("limit") limit: Int
    ): PokemonResponse

    @GET("pokemon/{id}")
    suspend fun getPokemonsBy(
        @Path(value = "id") id: String
    ): PokemonData

    @GET("pokemon-species/{id}")
    suspend fun getPokemonsColorBy(
        @Path(value = "id") id: String
    ): PokemonColor
}
