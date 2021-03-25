package com.victor.core

import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.PagingData
import com.victor.core.data.PokemonData
import com.victor.core.datasource.PokemonPagingSource
import com.victor.core.remote.PokemonApi
import com.victor.core.remote.PokemonRepository
import kotlinx.coroutines.flow.Flow

class PokemonRepository(private val pokemonApi: PokemonApi) : PokemonRepository.Remote() {

    override fun getPokemons(): Flow<PagingData<PokemonData>> {
        return Pager(
            config = PagingConfig(
                pageSize = NETWORK_PAGE_SIZE,
                enablePlaceholders = true
            ),
            pagingSourceFactory = { PokemonPagingSource(pokemonApi) }
        ).flow
    }

    companion object {
        private const val NETWORK_PAGE_SIZE = 20
    }
}
