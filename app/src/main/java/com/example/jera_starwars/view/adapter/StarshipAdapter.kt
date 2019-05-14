package com.example.jera_starwars.view.adapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import com.example.jera_starwars.R
import com.example.jera_starwars.model.dataclass.Starship
import com.example.jera_starwars.view.viewholder.StarshipViewHolder

class StarshipAdapter(var starshipList: ArrayList<Starship>, var context: Context) :
    RecyclerView.Adapter<StarshipViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, p1: Int): StarshipViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.itemcard_starship, parent, false)

        return StarshipViewHolder(view)
    }


    override fun getItemCount(): Int = starshipList.size


    override fun onBindViewHolder(viewHolder: StarshipViewHolder, listPosition: Int) {
        val starship = starshipList[listPosition]
        val res = context.resources

        viewHolder.nameTextView.text = res.getString(R.string.starship_name, starship.name)
        viewHolder.modelTextView.text = res.getString(R.string.starship_model, starship.model)
        viewHolder.mgltTextView.text = res.getString(R.string.starship_mglt, starship.MGLT)
        viewHolder.cargoCapacityTextView.text = res.getString(R.string.starship_cargocapacity, starship.cargo_capacity)
        viewHolder.consumablesTextView.text = res.getString(R.string.starship_consumables, starship.consumables)
        viewHolder.costInCreditsTextView.text = res.getString(R.string.starship_costincredits, starship.cost_in_credits)
        viewHolder.manufacturerTextView.text = res.getString(R.string.starship_manufacturer, starship.manufacturer)

        viewHolder.crewTextView.text = res.getString(R.string.starship_crew, starship.crew)
        viewHolder.hyperDriveRatingTextView.text = res.getString(R.string.starship_hyperdriverating, starship.hyperdrive_rating)
        viewHolder.lengthTextView.text = res.getString(R.string.starship_length, starship.length)
        viewHolder.maxAtmospheringSpeedTextView.text = res.getString(R.string.starship_maxatmospheringspeed, starship.max_atmosphering_speed)
        viewHolder.passengersTextView.text = res.getString(R.string.starship_passengers, starship.passengers)
        viewHolder.starshipClassTextView.text = res.getString(R.string.starship_starshipclass, starship.starship_class)


    }

}
