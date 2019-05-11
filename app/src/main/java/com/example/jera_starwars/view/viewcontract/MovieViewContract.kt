package com.example.jera_starwars.view.viewcontract

import com.example.jera_starwars.model.dataclass.Movie

interface MovieViewContract {
    fun updateMoviesOnRecyclerView(movieList: ArrayList<Movie>)
}