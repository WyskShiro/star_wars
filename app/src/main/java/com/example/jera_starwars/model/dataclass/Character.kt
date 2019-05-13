package com.example.jera_starwars.model.dataclass

import android.os.Parcel
import android.os.Parcelable
import java.io.Serializable

class Character : Serializable, Resource, Comparable<Character> {

    override fun compareTo(other: Character): Int {
        return name.compareTo(other.name)
    }

    lateinit var name: String
    lateinit var gender: String
    lateinit var eye_color: String
    lateinit var hair_color: String

    lateinit var birth_year: String
    lateinit var height: String
    lateinit var mass: String
    lateinit var skin_color: String


}