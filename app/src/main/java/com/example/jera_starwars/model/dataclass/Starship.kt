package com.example.jera_starwars.model.dataclass

import java.io.Serializable

class Starship : Serializable, Resource, Comparable<Starship> {
    override fun compareTo(other: Starship): Int {
        return name.compareTo(other.name)
    }
    lateinit var name: String
    lateinit var model: String
    lateinit var MGLT: String
    lateinit var cargo_capacity: String
    lateinit var consumables: String
    lateinit var cost_in_credits: String
    lateinit var manufacturer: String

    lateinit var crew: String
    lateinit var hyperdrive_rating: String
    lateinit var length: String
    lateinit var max_atmosphering_speed: String
    lateinit var passengers: String
    lateinit var starship_class: String
}

