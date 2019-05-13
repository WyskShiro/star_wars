package com.example.jera_starwars.model.dataclass

import java.io.Serializable

class Planet : Serializable, Resource, Comparable<Planet> {

    lateinit var name: String
    lateinit var climate: String
    lateinit var population: String
    lateinit var terrain: String
    lateinit var diameter: String

    lateinit var gravity: String
    lateinit var orbital_period: String
    lateinit var rotation_period: String
    lateinit var surface_water: String

    override fun compareTo(other: Planet): Int {
        return name.compareTo(other.name)
    }

}
