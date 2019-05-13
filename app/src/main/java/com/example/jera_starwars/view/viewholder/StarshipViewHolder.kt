package com.example.jera_starwars.view.viewholder

import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.TextView
import com.example.jera_starwars.R

class StarshipViewHolder : RecyclerView.ViewHolder {

    var nameTextView: TextView
    var modelTextView: TextView
    var mgltTextView: TextView
    var cargoCapacityTextView: TextView
    var consumablesTextView: TextView
    var costInCreditsTextView: TextView
    var manufacturerTextView: TextView

    var crewTextView: TextView
    var hyperDriveRatingTextView: TextView
    var lengthTextView: TextView
    var maxAtmospheringSpeedTextView: TextView
    var passengersTextView: TextView
    var starshipClassTextView: TextView

    constructor(itemView: View) : super(itemView) {
        nameTextView = itemView.findViewById(R.id.name_textview)
        modelTextView = itemView.findViewById(R.id.model_textview)
        mgltTextView = itemView.findViewById(R.id.mglt_textview)
        cargoCapacityTextView = itemView.findViewById(R.id.cargocapacity_textview)
        consumablesTextView = itemView.findViewById(R.id.consumables_textview)
        costInCreditsTextView = itemView.findViewById(R.id.costincredits_textview)
        manufacturerTextView = itemView.findViewById(R.id.manufacturer_textview)

        crewTextView = itemView.findViewById(R.id.crew_textview)
        hyperDriveRatingTextView = itemView.findViewById(R.id.hyperdriverating_textview)
        lengthTextView = itemView.findViewById(R.id.length_textview)
        maxAtmospheringSpeedTextView = itemView.findViewById(R.id.maxatmospheringspeed_textview)
        passengersTextView = itemView.findViewById(R.id.passengers_textview)
        starshipClassTextView = itemView.findViewById(R.id.starshipclass_textview)
    }
}
