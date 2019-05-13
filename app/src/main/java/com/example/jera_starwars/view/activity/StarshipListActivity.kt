package com.example.jera_starwars.view.activity

import android.os.Bundle
import com.example.jera_starwars.R
import com.example.jera_starwars.model.dataclass.Planet
import com.example.jera_starwars.model.dataclass.Resource
import com.example.jera_starwars.model.dataclass.Starship
import com.example.jera_starwars.presenter.ResourceListPresenter
import com.example.jera_starwars.view.adapter.PlanetAdapter
import com.example.jera_starwars.view.adapter.StarshipAdapter

class StarshipListActivity : MovieResourcesListActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar!!.title = getString(R.string.starships)

        resourceListPresenter= ResourceListPresenter(this)

        if (intent.hasExtra("starships_list")) {
            resourcesList = intent.extras.getStringArrayList("starships_list")
            resourcesRecyclerView.adapter = StarshipAdapter(ArrayList(), this)

            resourceListPresenter.getAllStarshipsFromThisMovie(resourcesList)
        }
    }

    override fun updateResourcesOnRecyclerView(resource: Resource) {
        if (resource is Starship) {
            (resourcesRecyclerView.adapter as StarshipAdapter).starshipList.add(resource)
            (resourcesRecyclerView.adapter as StarshipAdapter).starshipList.sort()
        }

        resourcesRecyclerView.adapter!!.notifyDataSetChanged()
    }

}