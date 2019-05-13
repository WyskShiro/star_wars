package com.example.jera_starwars.view.activity

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.MenuItem
import android.widget.TextView
import com.example.jera_starwars.R
import com.example.jera_starwars.model.dataclass.Character
import com.example.jera_starwars.model.dataclass.Planet
import com.example.jera_starwars.model.dataclass.Resource
import com.example.jera_starwars.model.dataclass.Specie
import com.example.jera_starwars.presenter.ResourceListPresenter
import com.example.jera_starwars.view.adapter.CharacterAdapter
import com.example.jera_starwars.view.adapter.PlanetAdapter
import com.example.jera_starwars.view.adapter.SpecieAdapter
import com.example.jera_starwars.view.viewcontract.ResourceViewContract

class MovieResourcesListActivity : AppCompatActivity(), ResourceViewContract {

    lateinit var resourcesTitleTextView: TextView
    private lateinit var resourcesList: ArrayList<String>
    private lateinit var resourcesRecyclerView: RecyclerView
    private lateinit var resourceListPresenter: ResourceListPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movie_resources_list)
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)
        supportActionBar!!.setHomeButtonEnabled(true)
        supportActionBar!!.title = getString(R.string.returnToPreviousScreen)

        resourcesTitleTextView = findViewById(R.id.resourcestitle_textview)
        resourcesRecyclerView = findViewById(R.id.resources_recylerview)
        resourcesRecyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)

        //TODO mostrar um loading
        resourceListPresenter= ResourceListPresenter(this)

        if (intent.hasExtra("characters_list")) {
            resourcesList = intent.extras.getStringArrayList("characters_list")
            resourcesTitleTextView.text = getString(R.string.characters)
            resourcesRecyclerView.adapter = CharacterAdapter(ArrayList(), this)

            resourceListPresenter.getAllCharactersFromThisMovie(resourcesList)

        } else if (intent.hasExtra("species_list")) {
            resourcesList = intent.extras.getStringArrayList("species_list")
            resourcesTitleTextView.text = getString(R.string.species)
            resourcesRecyclerView.adapter = SpecieAdapter(ArrayList(), this)

            resourceListPresenter.getAllSpeciesFromThisMovie(resourcesList)
        } else if (intent.hasExtra("planets_list")) {
            resourcesList = intent.extras.getStringArrayList("planets_list")
            resourcesTitleTextView.text = getString(R.string.planets)
            resourcesRecyclerView.adapter = PlanetAdapter(ArrayList(), this)

            resourceListPresenter.getAllPlanetsFromThisMovie(resourcesList)
        }


    }

    override fun updateResourcesOnRecyclerView(resource: Resource) {
        resource.updateResources(resource, resourcesRecyclerView.adapter!!)
        resourcesRecyclerView.adapter!!.notifyDataSetChanged()
    }


    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        finish()
        return true
    }

}
