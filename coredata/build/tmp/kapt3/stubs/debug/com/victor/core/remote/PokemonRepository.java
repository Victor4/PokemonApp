package com.victor.core.remote;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/victor/core/remote/PokemonRepository;", "", "Remote", "coredata_debug"})
public abstract interface PokemonRepository {
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0014\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004H&\u00a8\u0006\u0007"}, d2 = {"Lcom/victor/core/remote/PokemonRepository$Remote;", "", "()V", "getPokemons", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/paging/PagingData;", "Lcom/victor/core/data/PokemonData;", "coredata_debug"})
    public static abstract class Remote {
        
        @org.jetbrains.annotations.NotNull()
        public abstract kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.victor.core.data.PokemonData>> getPokemons();
        
        public Remote() {
            super();
        }
    }
}