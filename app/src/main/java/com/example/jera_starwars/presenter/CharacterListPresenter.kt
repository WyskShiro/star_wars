package com.example.jera_starwars.presenter

import com.example.jera_starwars.model.call.CharacterCall
import com.example.jera_starwars.model.dataclass.Character
import com.example.jera_starwars.view.viewcontract.CharacterViewContract

class CharacterListPresenter(private val characterViewContract: CharacterViewContract) {

    fun getCharacterWithId(characterId: String) {
        val characterCall = CharacterCall(this)
        characterCall.callGetCharacterWithId(characterId)
    }

    fun insertCharacterOnList(character: Character?) {
        if (character != null) {
            characterViewContract.updateCharactersOnRecyclerView(character)
        }
    }
}