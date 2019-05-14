package com.example.jera_starwars.view.activity

import android.os.Bundle
import android.view.View
import android.widget.ProgressBar
import com.example.jera_starwars.R
import com.example.jera_starwars.model.dataclass.Character
import com.example.jera_starwars.model.dataclass.Resource
import com.example.jera_starwars.presenter.ResourceListPresenter
import com.example.jera_starwars.view.adapter.CharacterAdapter

class CharactersListActivity : MovieResourcesListActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar!!.title = getString(R.string.characters)

        resourceListPresenter= ResourceListPresenter(this)

        resourcesList = movie.characters as ArrayList<String>
        resourcesRecyclerView.adapter = CharacterAdapter(ArrayList(), this)
        resourceListPresenter.getAllCharactersFromThisMovie(resourcesList)
    }

    override fun updateResourcesOnRecyclerView(resource: Resource) {
        if (resource is Character) {
            progressbar.visibility = View.GONE
            val characterAdater = resourcesRecyclerView.adapter as CharacterAdapter

            characterAdater.characterList.add(resource)
            characterAdater.characterList.sort()
            characterAdater.notifyDataSetChanged()
        }
    }

}