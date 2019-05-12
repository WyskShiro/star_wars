package com.example.jera_starwars.model.dataclass

import com.example.jera_starwars.R
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

    // Para facilitar qual imagem carregar na lista dependendo do filme sendo renderizado no Recycler View
    val posters = hashMapOf(
        1 to R.drawable.episode1_poster,
        2 to R.drawable.episode2_poster,
        3 to R.drawable.episode3_poster,
        4 to R.drawable.episode4_poster,
        5 to R.drawable.episode5_poster,
        6 to R.drawable.episode6_poster,
        7 to R.drawable.episode7_poster)




}