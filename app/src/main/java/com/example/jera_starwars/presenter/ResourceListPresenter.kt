package com.example.jera_starwars.presenter

import com.example.jera_starwars.model.call.CharacterCall
import com.example.jera_starwars.model.call.PlanetCall
import com.example.jera_starwars.model.call.SpecieCall
import com.example.jera_starwars.model.call.StarshipCall
import com.example.jera_starwars.model.dataclass.Resource
import com.example.jera_starwars.view.viewcontract.ResourceViewContract

class ResourceListPresenter(private val resourceViewContract: ResourceViewContract) {

    fun getAllCharactersFromThisMovie(resourcesList: ArrayList<String>) {
        resourcesList.forEach { characterId ->
            val characterCall = CharacterCall(this)
            characterCall.callGetCharacterWithId(characterId)
        }
    }

    fun getAllStarshipsFromThisMovie(resourcesList: ArrayList<String>) {
        resourcesList.forEach { starshipId ->
            val starshipCall = StarshipCall(this)
            starshipCall.callGetStarshipWithId(starshipId)
        }
    }

    fun getAllPlanetsFromThisMovie(resourcesList: ArrayList<String>) {
        resourcesList.forEach { planetId ->
            val planetCall = PlanetCall(this)
            planetCall.callGetPlanetWithId(planetId)
        }
    }


    fun getAllSpeciesFromThisMovie(resourcesList: ArrayList<String>) {
        resourcesList.forEach { specieId ->
            val specieCall = SpecieCall(this)
            specieCall.callGetSpecieWithId(specieId)
        }
    }


    fun insertResourceOnList(resource: Resource?) {
        if (resource != null) {
            resourceViewContract.updateResourcesOnRecyclerView(resource)
        }
    }

}