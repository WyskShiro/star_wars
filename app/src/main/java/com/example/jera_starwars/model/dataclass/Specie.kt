package com.example.jera_starwars.model.dataclass

import java.io.Serializable

class Specie : Serializable, Resource, Comparable<Specie> {
    lateinit var name: String private set
    lateinit var classification: String private set
    lateinit var eye_colors: String private set
    lateinit var hair_colors: String private set
    lateinit var skin_colors: String private set

    lateinit var average_height: String private set
    lateinit var average_lifespan: String private set
    lateinit var designation: String private set
    lateinit var language: String private set

    override fun compareTo(other: Specie): Int {
        return name.compareTo(other.name)
    }
}
