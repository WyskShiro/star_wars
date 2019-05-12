package com.example.jera_starwars.presenter

import com.example.jera_starwars.model.call.CharacterCall
import com.example.jera_starwars.model.call.MovieCall
import com.example.jera_starwars.model.dataclass.Character
import com.example.jera_starwars.model.dataclass.Movie
import com.example.jera_starwars.view.viewcontract.CharacterViewContract
import com.example.jera_starwars.view.viewcontract.MovieViewContract

class CharacterListPresenter(private val characterViewContract: CharacterViewContract) {

    fun getCharacterWithId(characterId: Int) {
        val characterCall = CharacterCall(this)
        characterCall.callGetPeopleWithId(characterId)
    }

    fun setAllMovies(character: Character?) {
        if (character != null) {
            characterViewContract.updateCharactersOnRecyclerView(character)
        }
    }
}