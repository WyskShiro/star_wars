package com.example.jera_starwars.model.dataclass

import com.example.jera_starwars.R
import java.io.Serializable

class Movie : Serializable {

    lateinit var title: String private set
    var episode_id: Int = -1
        private set
    lateinit var opening_crawl: String private set
    lateinit var director: String private set
    lateinit var release_date: String private set

    var characters: List<String> = ArrayList()
        get() = getResourcesId(field)
        private set

    var planets: List<String> = ArrayList()
        get() = getResourcesId(field)
        private set

    var starships: List<String> = ArrayList()
        get() = getResourcesId(field)
        private set

    var species: List<String> = ArrayList()
        get() = getResourcesId(field)
        private set

    // Para facilitar qual imagem carregar na lista dependendo do filme sendo renderizado no Recycler View
    val posters = hashMapOf(
        1 to R.drawable.episode1_poster,
        2 to R.drawable.episode2_poster,
        3 to R.drawable.episode3_poster,
        4 to R.drawable.episode4_poster,
        5 to R.drawable.episode5_poster,
        6 to R.drawable.episode6_poster,
        7 to R.drawable.episode7_poster)

    private fun getResourcesId(resourcesList: List<String>): List<String>{
        return resourcesList.map {characterLink ->
            characterLink.filter {
                it.isDigit()
            }
        }
    }

}