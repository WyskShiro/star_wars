package com.example.jera_starwars.presenter

import com.example.jera_starwars.model.call.MovieCall
import com.example.jera_starwars.model.dataclass.Movie
import com.example.jera_starwars.view.viewcontract.MovieViewContract

class MovieListPresenter(private val movieViewContract: MovieViewContract) {

    fun getAllMovies() {
        val movieCall = MovieCall(this)
        movieCall.callGetAllMovies()
    }

    fun setAllMovies(movieList: List<Movie>?) {
        if (movieList != null) {
            movieViewContract.updateMoviesOnRecyclerView(movieList)
        }
    }
}