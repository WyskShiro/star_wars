package com.example.jera_starwars.model.dataclass

import java.io.Serializable

class Character : Serializable, Resource, Comparable<Character> {

    lateinit var name: String private set
    lateinit var gender: String private set
    lateinit var eye_color: String private set
    lateinit var hair_color: String private set

    lateinit var birth_year: String private set
    lateinit var height: String private set
    lateinit var mass: String private set
    lateinit var skin_color: String private set

    override fun compareTo(other: Character): Int {
        return name.compareTo(other.name)
    }

}