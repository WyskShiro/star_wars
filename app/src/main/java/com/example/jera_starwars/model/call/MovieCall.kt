package com.example.jera_starwars.model.call

import com.example.jera_starwars.presenter.MovieListPresenter

class MovieCall(val movieListPresenter: MovieListPresenter) {

    fun callGetAllMovies() {
        //call.enqueue.onResponse(movieListPresenter.setAllMovies(response))
    }
}