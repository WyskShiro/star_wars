package com.example.jera_starwars.model.dataclass

import com.google.gson.annotations.SerializedName
import java.io.Serializable

class Movie : Serializable {

    @SerializedName("title")
    lateinit var title: String

    @SerializedName("episode_id")
    var episode_id: Int = -1

    @SerializedName("opening_crawl")
    lateinit var opening_crawl: String

    @SerializedName("director")
    lateinit var director: String

    @SerializedName("producer")
    lateinit var producer: String

    @SerializedName("release_date")
    lateinit var release_date: String

    @SerializedName("characters")
    lateinit var characters: List<String>

    @SerializedName("planets")
    lateinit var planets: List<String>

    @SerializedName("starships")
    lateinit var starships: List<String>

    @SerializedName("vehicles")
    lateinit var vehicles: List<String>

    @SerializedName("species")
    lateinit var species: List<String>

    @SerializedName("created")
    lateinit var created: String

    @SerializedName("edited")
    lateinit var edited: String

    @SerializedName("url")
    lateinit var url: String


}