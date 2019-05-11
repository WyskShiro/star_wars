package com.example.jera_starwars.view.viewcontract

import com.example.jera_starwars.model.dataclass.Movie

/**
 * Interface para o Presenter se comunicar com a Activity de Movie sem referenciá-la diretamente
 * */
interface MovieViewContract {
    fun updateMoviesOnRecyclerView(movieList: List<Movie>)
}