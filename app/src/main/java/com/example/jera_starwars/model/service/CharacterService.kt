package com.example.jera_starwars.model.service

import com.example.jera_starwars.model.dataclass.Character
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface CharacterService {
    @GET("api/people/{id}")
    fun getCharacterWithId(@Path("id") characterId: String): Call<Character>
}