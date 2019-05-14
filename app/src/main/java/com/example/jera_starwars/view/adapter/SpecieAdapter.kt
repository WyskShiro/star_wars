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
        val specie = specieList[listPosition]
        val res = context.resources

        viewHolder.nameTextView.text = res.getString(R.string.specie_name, specie.name)
        viewHolder.classificationTextView.text = res.getString(R.string.specie_classification, specie.classification)
        viewHolder.eyeColorsTextView.text = res.getString(R.string.specie_eyecolors, specie.eye_colors)
        viewHolder.hairColorsTextView.text = res.getString(R.string.specie_haircolors, specie.hair_colors)
        viewHolder.skinColorsTextView.text = res.getString(R.string.specie_skincolors, specie.skin_colors)

        viewHolder.averageHeightTextView.text = res.getString(R.string.specie_averageheight, specie.average_height)
        viewHolder.averageLifeSpanTextView.text = res.getString(R.string.specie_averagelifespan, specie.average_lifespan)
        viewHolder.designationTextView.text = res.getString(R.string.specie_designation, specie.designation)
        viewHolder.languageTextView.text = res.getString(R.string.specie_language, specie.language)
    }

}
