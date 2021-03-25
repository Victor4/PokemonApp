package com.victor.feature.adapters

import android.annotation.SuppressLint
import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import com.victor.core.data.PokemonData
import com.victor.feature.R

class PokemonViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    private val namePokemon: TextView = view.findViewById(R.id.namePokemonTextView)
    private val imagePokemon: ImageView = view.findViewById(R.id.pokemonImageView)
    private val typeOne: View = view.findViewById(R.id.typeOneLayout)
    private val typeTwo: View = view.findViewById(R.id.typeTwoLayout)
    private val pokemonCardView: CardView = view.findViewById(R.id.pokemonCardView)
    private var pokemonData: PokemonData? = null

    fun bind(pokemonData: PokemonData?) {
        if (pokemonData == null) {
            val resources = itemView.resources

            namePokemon.text = resources.getString(R.string.loading)
        } else {
            showPokemonData(pokemonData)
        }
    }

    private fun showPokemonData(pokemonData: PokemonData) {
        this.pokemonData = pokemonData
        val typeOneTextView: TextView = typeOne.findViewById(R.id.typeTextView)
        val typeTwoTextView: TextView = typeTwo.findViewById(R.id.typeTextView)
        val typeOneCardView: CardView = typeOne.findViewById(R.id.typeCardView)
        val typeTwoCardView: CardView = typeTwo.findViewById(R.id.typeCardView)

        if (pokemonData.color.equals("white")) {
            namePokemon.setTextColor(Color.parseColor("#000000"))
            typeOneTextView.setTextColor(Color.parseColor("#000000"))
            typeTwoTextView.setTextColor(Color.parseColor("#000000"))
        } else {
            namePokemon.setTextColor(Color.parseColor("#FFFFFF"))
            typeOneTextView.setTextColor(Color.parseColor("#FFFFFF"))
            typeTwoTextView.setTextColor(Color.parseColor("#FFFFFF"))
        }

        typeOneTextView.text = pokemonData.types.first().type.name.capitalize()
        typeTwoTextView.text = pokemonData.types.last().type.name.capitalize()

        Picasso.get()
            .load(pokemonData.sprites.other.officialArtwork.frontDefault)
            .placeholder(R.drawable.ic_snorlax)
            .into(imagePokemon)

        namePokemon.text = pokemonData.name.capitalize()
        defineBackGroundCard(pokemonData.color, typeOneCardView, typeTwoCardView)
    }

    @SuppressLint("ResourceAsColor")
    private fun defineBackGroundCard(
        color: String,
        typeOneCardView: CardView,
        typeTwoCardView: CardView
    ) {
        when (color) {
            "black" -> {
                pokemonCardView.setCardBackgroundColor(Color.parseColor("#000000"))
                typeOneCardView.setCardBackgroundColor(Color.parseColor("#000000"))
                typeTwoCardView.setCardBackgroundColor(Color.parseColor("#000000"))
            }
            "blue" -> {
                pokemonCardView.setCardBackgroundColor(Color.parseColor("#21618C"))
                typeOneCardView.setCardBackgroundColor(Color.parseColor("#21618C"))
                typeTwoCardView.setCardBackgroundColor(Color.parseColor("#21618C"))
            }
            "brown" -> {
                pokemonCardView.setCardBackgroundColor(Color.parseColor("#641E16"))
                typeOneCardView.setCardBackgroundColor(Color.parseColor("#641E16"))
                typeTwoCardView.setCardBackgroundColor(Color.parseColor("#641E16"))
            }
            "gray" -> {
                pokemonCardView.setCardBackgroundColor(Color.parseColor("#808080"))
                typeOneCardView.setCardBackgroundColor(Color.parseColor("#808080"))
                typeTwoCardView.setCardBackgroundColor(Color.parseColor("#808080"))
            }
            "green" -> {
                pokemonCardView.setCardBackgroundColor(Color.parseColor("#008000"))
                typeOneCardView.setCardBackgroundColor(Color.parseColor("#008000"))
                typeTwoCardView.setCardBackgroundColor(Color.parseColor("#008000"))
            }
            "pink" -> {
                pokemonCardView.setCardBackgroundColor(Color.parseColor("#E034B8"))
                typeOneCardView.setCardBackgroundColor(Color.parseColor("#E034B8"))
                typeTwoCardView.setCardBackgroundColor(Color.parseColor("#E034B8"))
            }
            "purple" -> {
                pokemonCardView.setCardBackgroundColor(Color.parseColor("#800080"))
                typeOneCardView.setCardBackgroundColor(Color.parseColor("#800080"))
                typeTwoCardView.setCardBackgroundColor(Color.parseColor("#800080"))
            }
            "red" -> {
                pokemonCardView.setCardBackgroundColor(Color.parseColor("#B03A2E"))
                typeOneCardView.setCardBackgroundColor(Color.parseColor("#B03A2E"))
                typeTwoCardView.setCardBackgroundColor(Color.parseColor("#B03A2E"))
            }
            "white" -> {
                pokemonCardView.setCardBackgroundColor(Color.parseColor("#FFFFFF"))
                typeOneCardView.setCardBackgroundColor(Color.parseColor("#FFFFFF"))
                typeTwoCardView.setCardBackgroundColor(Color.parseColor("#FFFFFF"))
            }
            "yellow" -> {
                pokemonCardView.setCardBackgroundColor(Color.parseColor("#B7950B"))
                typeOneCardView.setCardBackgroundColor(Color.parseColor("#B7950B"))
                typeTwoCardView.setCardBackgroundColor(Color.parseColor("#B7950B"))
            }
        }
    }

    companion object {
        fun create(parent: ViewGroup): PokemonViewHolder {
            val view = LayoutInflater.from(parent.context)
                .inflate(R.layout.pokemon_item, parent, false)
            return PokemonViewHolder(view)
        }
    }
}
