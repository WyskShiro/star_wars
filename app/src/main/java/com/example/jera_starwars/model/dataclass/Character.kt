package com.example.jera_starwars.model.dataclass

import android.os.Parcel
import android.os.Parcelable
import android.support.v7.widget.RecyclerView
import com.example.jera_starwars.view.adapter.CharacterAdapter
import com.example.jera_starwars.view.adapter.PlanetAdapter
import java.io.Serializable

class Character : Serializable, Resource, Comparable<Character> {
    override fun updateResources(resource: Resource, adapter: RecyclerView.Adapter<RecyclerView.ViewHolder>) {
        (adapter as CharacterAdapter).characterList.add(resource as Character)
        (adapter as CharacterAdapter).characterList.sort()
    }

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