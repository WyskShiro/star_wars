package com.example.jera_starwars.view.adapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import com.example.jera_starwars.R
import com.example.jera_starwars.model.dataclass.Planet
import com.example.jera_starwars.model.dataclass.Specie
import com.example.jera_starwars.view.viewholder.PlanetViewHolder
import com.example.jera_starwars.view.viewholder.SpecieViewHolder

class PlanetAdapter(var planetList: ArrayList<Planet>, var context: Context) :
    RecyclerView.Adapter<PlanetViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, p1: Int): PlanetViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.itemcard_planet, parent, false)

        return PlanetViewHolder(view)
    }


    override fun getItemCount(): Int = planetList.size


    override fun onBindViewHolder(viewHolder: PlanetViewHolder, listPosition: Int) {
        val planet = planetList[listPosition]

        viewHolder.nameTextView.text = planet.name
        viewHolder.climateTextView.text = planet.climate
        viewHolder.populationTextView.text = planet.population
        viewHolder.terrainTextView.text = planet.terrain
        viewHolder.diameterTextView.text = planet.diameter

        viewHolder.gravityTextView.text = planet.gravity
        viewHolder.orbitalPeriodTextView.text = planet.orbital_period
        viewHolder.rotationPeriodTextView.text = planet.rotation_period
        viewHolder.surfaceWaterTextView.text = planet.surface_water

    }

}
