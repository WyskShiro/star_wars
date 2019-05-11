package com.example.jera_starwars.presenter

import com.example.jera_starwars.model.call.MovieCall
import com.example.jera_starwars.model.dataclass.Movie
import com.example.jera_starwars.view.viewcontract.MovieViewContract

class MovieListPresenter {
    val movieViewContract: MovieViewContract

    constructor(movieViewContract: MovieViewContract) {
        this.movieViewContract = movieViewContract
    }

    fun getAllMovies() {
        val movieCall = MovieCall(this)
        movieCall.callGetAllMovies()
    }

    fun setAllMovies(movieList: ArrayList<Movie>?) {
        if (movieList != null) {
            movieViewContract.updateMoviesOnRecyclerView(movieList)
        }
    }
}