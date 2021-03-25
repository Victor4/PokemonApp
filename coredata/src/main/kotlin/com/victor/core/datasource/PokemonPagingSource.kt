package com.victor.core.datasource

import androidx.paging.PagingSource
import com.victor.core.data.PokemonData
import com.victor.core.data.PokemonReference
import com.victor.core.remote.PokemonApi
import retrofit2.HttpException
import java.io.IOException

private const val POKEMON_STARTING_PAGE_OFFSET = 0
private const val POKEMON_PAGE_LIMIT = 10

class PokemonPagingSource(
    private val pokemonApi: PokemonApi
) : PagingSource<Int, PokemonData>() {
    override suspend fun load(params: LoadParams<Int>): LoadResult<Int, PokemonData> {
        var position = params.key ?: POKEMON_STARTING_PAGE_OFFSET
        return try {
            val response = pokemonApi.getPokemons(position, POKEMON_PAGE_LIMIT)
            val repos = loadImageTypeFrom(response.results)
            LoadResult.Page(
                data = repos,
                prevKey = if (response.previous.isNullOrEmpty()) null else extractOffsetFrom(response.previous),
                nextKey = if (response.next.isNullOrEmpty()) null else extractOffsetFrom(response.next)
            )
        } catch (exception: IOException) {
            return LoadResult.Error(exception)
        } catch (exception: HttpException) {
            return LoadResult.Error(exception)
        }
    }

    private suspend fun loadImageTypeFrom(repos: List<PokemonReference>): MutableList<PokemonData> {
        val pokemonData: MutableList<PokemonData> = mutableListOf()
        repos.forEach { pokemon ->
            pokemonData.add(pokemonApi.getPokemonsBy(extractIdFrom(pokemon.url)))
        }
        pokemonData.forEach { pokemon ->
            pokemon.color = (pokemonApi.getPokemonsColorBy(extractIdFrom(pokemon.species.url))).color.nameColor
        }
        return pokemonData
    }

    fun extractOffsetFrom(url: String): Int {
        val regexOffsetAndLimit = "[0-9]+".toRegex()
        return regexOffsetAndLimit.find(url, 33)?.value!!.toInt()
    }

    fun extractIdFrom(url: String): String {
        val regexOffsetAndLimit = "[0-9]+".toRegex()
        return regexOffsetAndLimit.find(url, 33)?.value!!
    }
}
