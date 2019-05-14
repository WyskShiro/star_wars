package com.example.jera_starwars.model.dataclass

import java.io.Serializable

class Planet : Serializable, Resource, Comparable<Planet> {

    lateinit var name: String private set
    lateinit var climate: String private set
    lateinit var population: String private set
    lateinit var terrain: String private set
    lateinit var diameter: String private set

    lateinit var gravity: String private set
    lateinit var orbital_period: String private set
    lateinit var rotation_period: String private set
    lateinit var surface_water: String private set

    override fun compareTo(other: Planet): Int {
        return name.compareTo(other.name)
    }

}
