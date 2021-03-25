package com.victor.core.remote

import androidx.paging.PagingData
import com.victor.core.data.PokemonData
import kotlinx.coroutines.flow.Flow

interface PokemonRepository {

    abstract class Remote {

        abstract fun getPokemons(): Flow<PagingData<PokemonData>>
    }
}
