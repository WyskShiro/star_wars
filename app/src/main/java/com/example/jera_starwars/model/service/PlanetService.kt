package com.example.jera_starwars.model.service

import com.example.jera_starwars.model.dataclass.Planet
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface PlanetService {
    @GET("api/planets/{id}")
    fun getPlanetWithId(@Path("id") planetId: String): Call<Planet>
}