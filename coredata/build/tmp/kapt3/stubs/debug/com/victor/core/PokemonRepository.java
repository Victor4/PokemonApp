package com.victor.core;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \t2\u00020\u0001:\u0001\tB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0014\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/victor/core/PokemonRepository;", "Lcom/victor/core/remote/PokemonRepository$Remote;", "pokemonApi", "Lcom/victor/core/remote/PokemonApi;", "(Lcom/victor/core/remote/PokemonApi;)V", "getPokemons", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/paging/PagingData;", "Lcom/victor/core/data/PokemonData;", "Companion", "coredata_debug"})
public final class PokemonRepository extends com.victor.core.remote.PokemonRepository.Remote {
    private final com.victor.core.remote.PokemonApi pokemonApi = null;
    private static final int NETWORK_PAGE_SIZE = 20;
    @org.jetbrains.annotations.NotNull()
    public static final com.victor.core.PokemonRepository.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.victor.core.data.PokemonData>> getPokemons() {
        return null;
    }
    
    public PokemonRepository(@org.jetbrains.annotations.NotNull()
    com.victor.core.remote.PokemonApi pokemonApi) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/victor/core/PokemonRepository$Companion;", "", "()V", "NETWORK_PAGE_SIZE", "", "coredata_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}