package com.example.jera_starwars.view.adapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import com.example.jera_starwars.R
import com.example.jera_starwars.model.dataclass.Specie
import com.example.jera_starwars.view.viewholder.SpecieViewHolder

class SpecieAdapter(var specieList: ArrayList<Specie>, var context: Context) :
    RecyclerView.Adapter<SpecieViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, p1: Int): SpecieViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.itemcard_specie, parent, false)

        return SpecieViewHolder(view)
    }


    override fun getItemCount(): Int = specieList.size


    override fun onBindViewHolder(viewHolder: SpecieViewHolder, listPosition: Int) {
        val character = specieList[listPosition]

        viewHolder.nameTextView.text = character.name
        viewHolder.classificationTextView.text = character.classification
        viewHolder.eyeColorsTextView.text = character.eye_colors
        viewHolder.hairColorsTextView.text = character.hair_colors
        viewHolder.skinColorsTextView.text = character.skin_colors

        viewHolder.averageHeightTextView.text = character.average_height
        viewHolder.averageLifeSpanTextView.text = character.average_lifespan
        viewHolder.designationTextView.text = character.designation
        viewHolder.languageTextView.text = character.language

    }

}
