package com.example.jera_starwars.view.activity

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.MenuItem
import android.widget.TextView
import android.widget.Toast
import com.example.jera_starwars.R
import com.example.jera_starwars.model.dataclass.Character
import com.example.jera_starwars.model.dataclass.Movie
import com.example.jera_starwars.presenter.CharacterListPresenter
import com.example.jera_starwars.view.adapter.CharacterAdapter
import com.example.jera_starwars.view.adapter.MovieAdapter
import com.example.jera_starwars.view.viewcontract.CharacterViewContract

class MovieResourcesList : AppCompatActivity(), CharacterViewContract {

    lateinit var resourcesTitleTextView: TextView
    private lateinit var resourcesList: ArrayList<String>
    private lateinit var resourcesRecyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movie_resources_list)
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)
        supportActionBar!!.setHomeButtonEnabled(true)
        supportActionBar!!.title = getString(R.string.returnToPreviousScreen)

        resourcesTitleTextView = findViewById(R.id.resourcestitle_textview)
        resourcesRecyclerView = findViewById(R.id.resources_recylerview)

        //TODO mostrar um loading

        if (intent.hasExtra("characters_list")) {
            resourcesList = intent.extras.getStringArrayList("characters_list")
            Toast.makeText(this, resourcesList[0], Toast.LENGTH_LONG).show()

            resourcesTitleTextView.text = getString(R.string.characters)
        }

        val resourceListPresenter = CharacterListPresenter(this)


        val array = resourcesList.map {characterLink ->
            characterLink.filter {
                it.isDigit()
            }
        }

        Toast.makeText(this, array[0], Toast.LENGTH_LONG).show()

        array.forEach { characterId ->
            resourceListPresenter.getCharacterWithId(characterId)
        }

        resourcesRecyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        resourcesRecyclerView.adapter = CharacterAdapter(ArrayList(), this)
    }

    override fun updateCharactersOnRecyclerView(character: Character) {
        (resourcesRecyclerView.adapter as CharacterAdapter).characterList.add(character)
        resourcesRecyclerView.adapter!!.notifyDataSetChanged()
    }


    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        finish()
        return true
    }

}
