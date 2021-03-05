package com.victor.feature.viewModel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.paging.PagingData
import androidx.paging.cachedIn
import com.victor.core.PokemonRepository
import com.victor.core.data.PokemonData
import com.victor.core.data.PokemonReference
import kotlinx.coroutines.flow.Flow

class HomeViewModel(val repository: PokemonRepository) : ViewModel() {

    fun getPokemons(): Flow<PagingData<PokemonData>> {

        val newResult: Flow<PagingData<PokemonData>> = repository.getPokemons()
            .cachedIn(viewModelScope)
        return newResult
    }
}