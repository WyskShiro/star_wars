package com.example.jera_starwars.view.viewcontract

import com.example.jera_starwars.model.dataclass.Character

interface CharacterViewContract {
    fun updateCharactersOnRecyclerView(character: Character)
}