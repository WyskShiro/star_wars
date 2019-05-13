package com.example.jera_starwars.view.activity

import android.os.Bundle
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

        if (intent.hasExtra("characters_list")) {
            resourcesList = intent.extras.getStringArrayList("characters_list")
            resourcesRecyclerView.adapter = CharacterAdapter(ArrayList(), this)
            resourceListPresenter.getAllCharactersFromThisMovie(resourcesList)
        }
    }

    override fun updateResourcesOnRecyclerView(resource: Resource) {
        if (resource is Character) {
            (resourcesRecyclerView.adapter as CharacterAdapter).characterList.add(resource)
            (resourcesRecyclerView.adapter as CharacterAdapter).characterList.sort()
        }

        resourcesRecyclerView.adapter!!.notifyDataSetChanged()
    }

}