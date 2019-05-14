package com.example.jera_starwars.model.service

import com.example.jera_starwars.model.dataclass.Starship
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface StarshipService {
    @GET("api/starships/{id}")
    fun getStarshipWithId(@Path("id") starshipId: String): Call<Starship>
}