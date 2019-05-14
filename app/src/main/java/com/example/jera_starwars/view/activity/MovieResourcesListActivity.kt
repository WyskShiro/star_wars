package com.example.jera_starwars.view.activity

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.MenuItem
import android.widget.ProgressBar
import com.example.jera_starwars.R
import com.example.jera_starwars.model.dataclass.Movie
import com.example.jera_starwars.presenter.ResourceListPresenter
import com.example.jera_starwars.view.adapter.StarshipAdapter
import com.example.jera_starwars.view.viewcontract.ResourceViewContract

/***
 * Parte genérica de toda listagem dos recursos de um filme
 * Para evitar criar uma Activity por completa para cada recurso -> Reaproveitar o que é "genérico"
 */
abstract class MovieResourcesListActivity : AppCompatActivity(), ResourceViewContract {

    lateinit var resourcesList: ArrayList<String>
    lateinit var resourcesRecyclerView: RecyclerView
    lateinit var resourceListPresenter: ResourceListPresenter
    lateinit var progressbar: ProgressBar
    lateinit var movie: Movie


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movie_resources_list)
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)
        supportActionBar!!.setHomeButtonEnabled(true)

        resourcesRecyclerView = findViewById(R.id.resources_recylerview)
        resourcesRecyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        progressbar = findViewById(R.id.progressbar)

        if (intent.hasExtra("movie")) {
            movie = intent.extras.getSerializable("movie") as Movie
        }
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        finish()
        return true
    }

}
