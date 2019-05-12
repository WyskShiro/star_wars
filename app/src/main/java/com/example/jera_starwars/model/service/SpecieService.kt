package com.example.jera_starwars.model.service

import com.example.jera_starwars.model.dataclass.Specie
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface SpecieService {
    @GET("api/species/{id}")
    fun getSpecieWithId(@Path("id") specieId: String): Call<Specie>
}