package com.victor.feature.viewModel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0012\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u000b"}, d2 = {"Lcom/victor/feature/viewModel/HomeViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/victor/core/PokemonRepository;", "(Lcom/victor/core/PokemonRepository;)V", "getRepository", "()Lcom/victor/core/PokemonRepository;", "getPokemons", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/paging/PagingData;", "Lcom/victor/core/data/PokemonData;", "home_debug"})
public final class HomeViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.victor.core.PokemonRepository repository = null;
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.victor.core.data.PokemonData>> getPokemons() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.victor.core.PokemonRepository getRepository() {
        return null;
    }
    
    public HomeViewModel(@org.jetbrains.annotations.NotNull()
    com.victor.core.PokemonRepository repository) {
        super();
    }
}