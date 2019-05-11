package com.example.jera_starwars.model.dataclass

import com.google.gson.annotations.SerializedName
import java.io.Serializable

class Movie : Serializable {

    lateinit var title: String
    var episode_id: Int = -1
    lateinit var opening_crawl: String
    lateinit var director: String
    lateinit var producer: String
    lateinit var release_date: String
    lateinit var characters: List<String>
    lateinit var planets: List<String>
    lateinit var starships: List<String>
    lateinit var vehicles: List<String>
    lateinit var species: List<String>
    lateinit var created: String
    lateinit var edited: String
    lateinit var url: String


}