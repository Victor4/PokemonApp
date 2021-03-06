package com.victor.feature.activities;

import java.lang.System;

@kotlinx.coroutines.ExperimentalCoroutinesApi()
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u000f\u001a\u00020\u0010H\u0002J\u0012\u0010\u0011\u001a\u00020\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0014J\b\u0010\u0014\u001a\u00020\u0010H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0007\u001a\u00020\b8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lcom/victor/feature/activities/HomeActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "adapter", "Lcom/victor/feature/adapters/PokemonsAdapter;", "binding", "Lcom/victor/feature/databinding/ActivityHomeBinding;", "homeViewModel", "Lcom/victor/feature/viewModel/HomeViewModel;", "getHomeViewModel", "()Lcom/victor/feature/viewModel/HomeViewModel;", "homeViewModel$delegate", "Lkotlin/Lazy;", "searchJob", "Lkotlinx/coroutines/Job;", "initAdapter", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "search", "home_debug"})
public final class HomeActivity extends androidx.appcompat.app.AppCompatActivity {
    private com.victor.feature.databinding.ActivityHomeBinding binding;
    private kotlinx.coroutines.Job searchJob;
    private final com.victor.feature.adapters.PokemonsAdapter adapter = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy homeViewModel$delegate = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.victor.feature.viewModel.HomeViewModel getHomeViewModel() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void initAdapter() {
    }
    
    private final void search() {
    }
    
    public HomeActivity() {
        super();
    }
}