package com.example.jera_starwars.presenter

import com.example.jera_starwars.model.call.CharacterCall
import com.example.jera_starwars.model.call.SpecieCall
import com.example.jera_starwars.model.dataclass.Character
import com.example.jera_starwars.model.dataclass.Resource
import com.example.jera_starwars.view.viewcontract.ResourceViewContract

class ResourceListPresenter(private val resourceViewContract: ResourceViewContract) {

    fun getAllCharactersFromThisMovie(resourcesList: ArrayList<String>) {
        val array = getResourcesId(resourcesList)

        array.forEach { characterId ->
            val characterCall = CharacterCall(this)
            characterCall.callGetCharacterWithId(characterId)
        }
    }

    fun getAllSpeciesFromThisMovie(resourcesList: ArrayList<String>) {
        val array = getResourcesId(resourcesList)

        array.forEach { specieId ->
            val specieCall = SpecieCall(this)
            specieCall.callGetSpecieWithId(specieId)
        }
    }

    fun insertResourceOnList(resource: Resource?) {
        if (resource != null) {
            resourceViewContract.updateResourcesOnRecyclerView(resource)
        }
    }

    private fun getResourcesId(resourcesList: ArrayList<String>): List<String>{
        return resourcesList.map {characterLink ->
            characterLink.filter {
                it.isDigit()
            }
        }
    }
}