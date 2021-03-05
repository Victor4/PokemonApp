package com.victor.feature.adapters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u000f\u001a\u00020\u00102\b\u0010\u000b\u001a\u0004\u0018\u00010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\nH\u0003J\u0010\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\fH\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lcom/victor/feature/adapters/PokemonViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Landroid/view/View;)V", "imagePokemon", "Landroid/widget/ImageView;", "namePokemon", "Landroid/widget/TextView;", "pokemonCardView", "Landroidx/cardview/widget/CardView;", "pokemonData", "Lcom/victor/core/data/PokemonData;", "typeOne", "typeTwo", "bind", "", "defineBackGroundCard", "color", "", "typeOneCardView", "typeTwoCardView", "showPokemonData", "Companion", "home_debug"})
public final class PokemonViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
    private final android.widget.TextView namePokemon = null;
    private final android.widget.ImageView imagePokemon = null;
    private final android.view.View typeOne = null;
    private final android.view.View typeTwo = null;
    private final androidx.cardview.widget.CardView pokemonCardView = null;
    private com.victor.core.data.PokemonData pokemonData;
    @org.jetbrains.annotations.NotNull()
    public static final com.victor.feature.adapters.PokemonViewHolder.Companion Companion = null;
    
    public final void bind(@org.jetbrains.annotations.Nullable()
    com.victor.core.data.PokemonData pokemonData) {
    }
    
    private final void showPokemonData(com.victor.core.data.PokemonData pokemonData) {
    }
    
    @android.annotation.SuppressLint(value = {"ResourceAsColor"})
    private final void defineBackGroundCard(java.lang.String color, androidx.cardview.widget.CardView typeOneCardView, androidx.cardview.widget.CardView typeTwoCardView) {
    }
    
    public PokemonViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.View view) {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/victor/feature/adapters/PokemonViewHolder$Companion;", "", "()V", "create", "Lcom/victor/feature/adapters/PokemonViewHolder;", "parent", "Landroid/view/ViewGroup;", "home_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.victor.feature.adapters.PokemonViewHolder create(@org.jetbrains.annotations.NotNull()
        android.view.ViewGroup parent) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}