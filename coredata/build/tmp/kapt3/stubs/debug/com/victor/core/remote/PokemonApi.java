package com.victor.core.remote;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J%\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007J\u001b\u0010\b\u001a\u00020\t2\b\b\u0001\u0010\n\u001a\u00020\u000bH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fJ\u001b\u0010\r\u001a\u00020\u000e2\b\b\u0001\u0010\n\u001a\u00020\u000bH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\f\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000f"}, d2 = {"Lcom/victor/core/remote/PokemonApi;", "", "getPokemons", "Lcom/victor/core/data/PokemonResponse;", "offset", "", "limit", "(IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPokemonsBy", "Lcom/victor/core/data/PokemonData;", "id", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPokemonsColorBy", "Lcom/victor/core/data/PokemonColor;", "coredata_debug"})
public abstract interface PokemonApi {
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "pokemon")
    public abstract java.lang.Object getPokemons(@retrofit2.http.Query(value = "offset")
    int offset, @retrofit2.http.Query(value = "limit")
    int limit, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.victor.core.data.PokemonResponse> p2);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "pokemon/{id}")
    public abstract java.lang.Object getPokemonsBy(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "id")
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.victor.core.data.PokemonData> p1);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "pokemon-species/{id}")
    public abstract java.lang.Object getPokemonsColorBy(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "id")
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.victor.core.data.PokemonColor> p1);
}