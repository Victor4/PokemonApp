package com.victor.core.datasource;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bJ\u000e\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bJ+\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\u000eH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fJ%\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0015R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0016"}, d2 = {"Lcom/victor/core/datasource/PokemonPagingSource;", "Landroidx/paging/PagingSource;", "", "Lcom/victor/core/data/PokemonData;", "pokemonApi", "Lcom/victor/core/remote/PokemonApi;", "(Lcom/victor/core/remote/PokemonApi;)V", "extractIdFrom", "", "url", "extractOffsetFrom", "load", "Landroidx/paging/PagingSource$LoadResult;", "params", "Landroidx/paging/PagingSource$LoadParams;", "(Landroidx/paging/PagingSource$LoadParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadImageTypeFrom", "", "repos", "", "Lcom/victor/core/data/PokemonReference;", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "coredata_debug"})
public final class PokemonPagingSource extends androidx.paging.PagingSource<java.lang.Integer, com.victor.core.data.PokemonData> {
    private final com.victor.core.remote.PokemonApi pokemonApi = null;
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object load(@org.jetbrains.annotations.NotNull()
    androidx.paging.PagingSource.LoadParams<java.lang.Integer> params, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super androidx.paging.PagingSource.LoadResult<java.lang.Integer, com.victor.core.data.PokemonData>> p1) {
        return null;
    }
    
    public final int extractOffsetFrom(@org.jetbrains.annotations.NotNull()
    java.lang.String url) {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String extractIdFrom(@org.jetbrains.annotations.NotNull()
    java.lang.String url) {
        return null;
    }
    
    public PokemonPagingSource(@org.jetbrains.annotations.NotNull()
    com.victor.core.remote.PokemonApi pokemonApi) {
        super();
    }
}