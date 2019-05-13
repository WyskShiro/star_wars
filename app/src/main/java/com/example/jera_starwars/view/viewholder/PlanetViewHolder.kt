package com.example.jera_starwars.view.viewholder

import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.TextView
import com.example.jera_starwars.R

class PlanetViewHolder : RecyclerView.ViewHolder {

    var nameTextView: TextView
    var climateTextView: TextView
    var populationTextView: TextView
    var terrainTextView: TextView
    var diameterTextView: TextView

    var gravityTextView: TextView
    var orbitalPeriodTextView: TextView
    var rotationPeriodTextView: TextView
    var surfaceWaterTextView: TextView

    constructor(itemView: View) : super(itemView) {
        nameTextView = itemView.findViewById(R.id.name_textview)
        climateTextView = itemView.findViewById(R.id.climate_textview)
        populationTextView = itemView.findViewById(R.id.population_textview)
        terrainTextView = itemView.findViewById(R.id.terrain_textview)
        diameterTextView = itemView.findViewById(R.id.diameter_textview)

        gravityTextView = itemView.findViewById(R.id.gravity_textview)
        orbitalPeriodTextView = itemView.findViewById(R.id.orbitalperiod_textview)
        rotationPeriodTextView = itemView.findViewById(R.id.rotationperiod_textview)
        surfaceWaterTextView = itemView.findViewById(R.id.surfacewater_textview)
    }
}
