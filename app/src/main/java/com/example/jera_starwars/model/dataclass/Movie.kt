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


    /**
     * Pega a url e extrai só a parte que tem o ID do recurso
     * */
    private fun getResourcesId(resourcesList: List<String>): List<String>{
        return resourcesList.map {characterLink ->
            characterLink.filter {
                it.isDigit()
            }
        }
    }


    fun getFirstParagraph() : String {
        var indexEndOfFirstParagraph = opening_crawl.indexOf("\r\n\r\n")

        // Tem um filme que não segue o padrão e separa os \r\n \r\n que são juntos nos outros filmes
        if (indexEndOfFirstParagraph == -1) {
            indexEndOfFirstParagraph = opening_crawl.indexOf("\r\n \r\n")
        }

        return opening_crawl.subSequence(0, indexEndOfFirstParagraph).toString() + "\n..."
    }

}