package com.example.jera_starwars.model.dataclass

import android.support.v7.widget.RecyclerView
import com.example.jera_starwars.view.adapter.CharacterAdapter
import com.example.jera_starwars.view.adapter.SpecieAdapter
import java.io.Serializable

class Specie : Serializable, Resource, Comparable<Specie> {
    override fun updateResources(resource: Resource, adapter: RecyclerView.Adapter<RecyclerView.ViewHolder>) {
        (adapter as SpecieAdapter).specieList.add(resource as Specie)
        (adapter as SpecieAdapter).specieList.sort()
    }

    override fun compareTo(other: Specie): Int {
        return name.compareTo(other.name)
    }

    lateinit var name: String
    lateinit var classification: String
    lateinit var eye_colors: String
    lateinit var hair_colors: String
    lateinit var skin_colors: String

    lateinit var average_height: String
    lateinit var average_lifespan: String
    lateinit var designation: String
    lateinit var language: String

}
