package com.example.jera_starwars.model.datajson

import com.example.jera_starwars.model.dataclass.Movie
import com.google.gson.annotations.SerializedName

class MovieJSON {
    @SerializedName("count")
    var count: Int = -1

    @SerializedName("next")
    var next: String? = null

    @SerializedName("previous")
    var previous: String? = null

    @SerializedName("results")
    lateinit var results: List<Movie>
}