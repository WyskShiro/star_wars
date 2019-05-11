package com.example.jera_starwars.model.datajson

import com.example.jera_starwars.model.dataclass.Movie
import com.google.gson.annotations.SerializedName

class MovieJSON {
    lateinit var results: List<Movie>
}