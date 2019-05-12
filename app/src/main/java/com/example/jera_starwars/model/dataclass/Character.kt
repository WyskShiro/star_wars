package com.example.jera_starwars.model.dataclass

import java.io.Serializable

class Character : Serializable, Resource {
    lateinit var name: String
    lateinit var gender: String
    lateinit var eye_color: String
    lateinit var hair_color: String

    lateinit var birth_year: String
    lateinit var height: String
    lateinit var mass: String
    lateinit var skin_color: String


}