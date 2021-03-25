package com.victor.pokemonapp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.victor.core.modules.PokemonApiModule
import com.victor.core.modules.PokemonNetworkModule
import com.victor.core.modules.PokemonRepositoryModule
import com.victor.feature.activities.HomeActivity
import com.victor.feature.modules.homeViewModelModule
import org.koin.core.context.startKoin

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        startKoin {
            modules(homeViewModelModule)
            modules(PokemonApiModule)
            modules(PokemonNetworkModule)
            modules(PokemonRepositoryModule)
        }

        val intent = Intent(this, HomeActivity::class.java)
        startActivity(intent)
    }
}
