package com.example.jera_starwars.view.activity

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.jera_starwars.R
import com.example.jera_starwars.model.dataclass.Movie
import com.example.jera_starwars.presenter.MovieListPresenter
import com.example.jera_starwars.view.viewcontract.MovieViewContract

class MovieListActivity : AppCompatActivity(), MovieViewContract {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movielist)

        val movieListPresenter = MovieListPresenter(this)
        movieListPresenter.getAllMovies()
        //TODO mostrar um loading
    }

    override fun updateMoviesOnRecyclerView(movieList: ArrayList<Movie>) {
        // movieAdapter.movieList = movieList
        // movieAdapter.notifyDataChange()
        //TODO finalizar o loading
    }
}
