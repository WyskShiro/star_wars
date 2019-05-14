package com.example.jera_starwars.view.activity

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import com.example.jera_starwars.R
import com.example.jera_starwars.model.dataclass.Movie
import com.example.jera_starwars.presenter.MovieListPresenter
import com.example.jera_starwars.view.adapter.MovieAdapter
import com.example.jera_starwars.view.viewcontract.MovieViewContract
import android.widget.ProgressBar
import android.view.View
import android.widget.LinearLayout




class MovieListActivity : AppCompatActivity(), MovieViewContract {

    lateinit var recyclerView: RecyclerView
    lateinit var progressbar: ProgressBar

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movielist)
        recyclerView = findViewById(R.id.movie_recylerview)
        progressbar = findViewById(R.id.progressbar)
        //TODO mostrar um loading


        val movieListPresenter = MovieListPresenter(this)
        movieListPresenter.getAllMovies()

        recyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        recyclerView.adapter = MovieAdapter(ArrayList(), this)
    }


    /**
     * Quando os filmes terminam de vir da API, coloca-as na lista do Adapter para atualizar a recyclerView
     * */
    override fun updateMoviesOnRecyclerView(movieList: List<Movie>) {
        //TODO finalizar o loading

        progressbar.visibility = View.GONE
        (recyclerView.adapter as MovieAdapter).movieList = movieList
        recyclerView.adapter!!.notifyDataSetChanged()


    }
}
