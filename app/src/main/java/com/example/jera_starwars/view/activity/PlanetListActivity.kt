package com.example.jera_starwars.view.activity

import android.os.Bundle
import com.example.jera_starwars.R
import com.example.jera_starwars.model.dataclass.Planet
import com.example.jera_starwars.model.dataclass.Resource
import com.example.jera_starwars.presenter.ResourceListPresenter
import com.example.jera_starwars.view.adapter.PlanetAdapter

class PlanetListActivity : MovieResourcesListActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar!!.title = getString(R.string.planets)

        resourceListPresenter= ResourceListPresenter(this)

        if (intent.hasExtra("planets_list")) {
            resourcesList = intent.extras.getStringArrayList("planets_list")
            resourcesRecyclerView.adapter = PlanetAdapter(ArrayList(), this)

            resourceListPresenter.getAllPlanetsFromThisMovie(resourcesList)
        }
    }

    override fun updateResourcesOnRecyclerView(resource: Resource) {
        if (resource is Planet) {
            (resourcesRecyclerView.adapter as PlanetAdapter).planetList.add(resource)
            (resourcesRecyclerView.adapter as PlanetAdapter).planetList.sort()
        }

        resourcesRecyclerView.adapter!!.notifyDataSetChanged()
    }

}