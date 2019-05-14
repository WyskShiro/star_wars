package com.example.jera_starwars.model.dataclass

import java.io.Serializable

class Starship : Serializable, Resource, Comparable<Starship> {

    lateinit var name: String private set
    lateinit var model: String private set
    lateinit var MGLT: String private set
    lateinit var cargo_capacity: String private set
    lateinit var consumables: String private set
    lateinit var cost_in_credits: String private set
    lateinit var manufacturer: String private set

    lateinit var crew: String private set
    lateinit var hyperdrive_rating: String private set
    lateinit var length: String private set
    lateinit var max_atmosphering_speed: String private set
    lateinit var passengers: String private set
    lateinit var starship_class: String private set

    override fun compareTo(other: Starship): Int {
        return name.compareTo(other.name)
    }
}

