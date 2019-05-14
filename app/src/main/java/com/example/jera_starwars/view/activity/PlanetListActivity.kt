package com.example.jera_starwars.view.activity

import android.os.Bundle
import android.view.View
import com.example.jera_starwars.R
import com.example.jera_starwars.model.dataclass.Movie
import com.example.jera_starwars.model.dataclass.Planet
import com.example.jera_starwars.model.dataclass.Resource
import com.example.jera_starwars.presenter.ResourceListPresenter
import com.example.jera_starwars.view.adapter.PlanetAdapter

class PlanetListActivity : MovieResourcesListActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar!!.title = getString(R.string.planets)

        resourceListPresenter= ResourceListPresenter(this)

        resourcesList = movie.planets as ArrayList<String>
        resourcesRecyclerView.adapter = PlanetAdapter(ArrayList(), this)
        resourceListPresenter.getAllPlanetsFromThisMovie(resourcesList)
    }

    override fun updateResourcesOnRecyclerView(resource: Resource) {
        if (resource is Planet) {
            progressbar.visibility = View.GONE
            val planetAdapter = resourcesRecyclerView.adapter as PlanetAdapter

            planetAdapter.planetList.add(resource)
            planetAdapter.planetList.sort()
            resourcesRecyclerView.adapter!!.notifyDataSetChanged()
        }
    }

}