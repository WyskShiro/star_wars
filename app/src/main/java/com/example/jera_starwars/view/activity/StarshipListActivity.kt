package com.example.jera_starwars.view.activity

import android.os.Bundle
import com.example.jera_starwars.R
import com.example.jera_starwars.model.dataclass.Movie
import com.example.jera_starwars.model.dataclass.Resource
import com.example.jera_starwars.model.dataclass.Starship
import com.example.jera_starwars.presenter.ResourceListPresenter
import com.example.jera_starwars.view.adapter.StarshipAdapter

class StarshipListActivity : MovieResourcesListActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar!!.title = getString(R.string.starships)

        resourceListPresenter= ResourceListPresenter(this)

        resourcesList = movie.starships as ArrayList<String>
        resourcesRecyclerView.adapter = StarshipAdapter(ArrayList(), this)
        resourceListPresenter.getAllStarshipsFromThisMovie(resourcesList)
    }

    override fun updateResourcesOnRecyclerView(resource: Resource) {
        if (resource is Starship) {
            val starshipAdapter = (resourcesRecyclerView.adapter as StarshipAdapter)

            starshipAdapter.starshipList.add(resource)
            starshipAdapter.starshipList.sort()
            starshipAdapter.notifyDataSetChanged()
        }
    }

}