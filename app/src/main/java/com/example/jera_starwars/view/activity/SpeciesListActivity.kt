package com.example.jera_starwars.view.activity

import android.os.Bundle
import com.example.jera_starwars.R
import com.example.jera_starwars.model.dataclass.Resource
import com.example.jera_starwars.model.dataclass.Specie
import com.example.jera_starwars.presenter.ResourceListPresenter
import com.example.jera_starwars.view.adapter.SpecieAdapter

class SpeciesListActivity : MovieResourcesListActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        resourceListPresenter= ResourceListPresenter(this)

        if (intent.hasExtra("species_list")) {
            resourcesList = intent.extras.getStringArrayList("species_list")
            resourcesTitleTextView.text = getString(R.string.species)
            resourcesRecyclerView.adapter = SpecieAdapter(ArrayList(), this)
            resourceListPresenter.getAllSpeciesFromThisMovie(resourcesList)
        }
    }

    override fun updateResourcesOnRecyclerView(resource: Resource) {
        if (resource is Specie) {
            (resourcesRecyclerView.adapter as SpecieAdapter).specieList.add(resource)
            (resourcesRecyclerView.adapter as SpecieAdapter).specieList.sort()
        }

        resourcesRecyclerView.adapter!!.notifyDataSetChanged()
    }

}