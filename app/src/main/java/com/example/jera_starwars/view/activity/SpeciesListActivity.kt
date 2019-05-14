package com.example.jera_starwars.view.activity

import android.os.Bundle
import com.example.jera_starwars.R
import com.example.jera_starwars.model.dataclass.Movie
import com.example.jera_starwars.model.dataclass.Resource
import com.example.jera_starwars.model.dataclass.Specie
import com.example.jera_starwars.presenter.ResourceListPresenter
import com.example.jera_starwars.view.adapter.SpecieAdapter

class SpeciesListActivity : MovieResourcesListActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar!!.title = getString(R.string.species)

        resourceListPresenter= ResourceListPresenter(this)

        resourcesList = movie.species as ArrayList<String>
        resourcesRecyclerView.adapter = SpecieAdapter(ArrayList(), this)
        resourceListPresenter.getAllSpeciesFromThisMovie(resourcesList)
    }

    override fun updateResourcesOnRecyclerView(resource: Resource) {
        if (resource is Specie) {
            val specieAdapter = (resourcesRecyclerView.adapter as SpecieAdapter)

            specieAdapter.specieList.add(resource)
            specieAdapter.specieList.sort()
            specieAdapter.notifyDataSetChanged()
        }


    }

}