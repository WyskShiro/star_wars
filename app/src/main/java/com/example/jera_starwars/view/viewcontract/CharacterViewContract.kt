package com.example.jera_starwars.view.viewcontract

import com.example.jera_starwars.model.dataclass.Character
import com.example.jera_starwars.model.dataclass.Movie

interface CharacterViewContract {
    fun updateCharactersOnRecyclerView(character: Character)
}