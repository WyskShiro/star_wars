package com.example.jera_starwars.view.adapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import com.example.jera_starwars.R
import com.example.jera_starwars.model.dataclass.Planet
import com.example.jera_starwars.view.viewholder.PlanetViewHolder

class PlanetAdapter(var planetList: ArrayList<Planet>, var context: Context) :
    RecyclerView.Adapter<PlanetViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, p1: Int): PlanetViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.itemcard_planet, parent, false)

        return PlanetViewHolder(view)
    }


    override fun getItemCount(): Int = planetList.size


    override fun onBindViewHolder(viewHolder: PlanetViewHolder, listPosition: Int) {
        val planet = planetList[listPosition]
        val res = context.resources

        viewHolder.nameTextView.text = res.getString(R.string.planet_name, planet.name)
        viewHolder.climateTextView.text = res.getString(R.string.planet_climate, planet.climate)
        viewHolder.populationTextView.text = res.getString(R.string.planet_population, planet.population)
        viewHolder.diameterTextView.text = res.getString(R.string.planet_diameter, planet.diameter)
        viewHolder.terrainTextView.text = res.getString(R.string.planet_terrain, planet.terrain)

        viewHolder.gravityTextView.text = res.getString(R.string.planet_gravity, planet.gravity)
        viewHolder.orbitalPeriodTextView.text = res.getString(R.string.planet_orbitalperiod, planet.orbital_period)
        viewHolder.rotationPeriodTextView.text = res.getString(R.string.planet_rotationperiod, planet.rotation_period)
        viewHolder.surfaceWaterTextView.text = res.getString(R.string.planet_surfacewater, planet.surface_water)


    }

}
