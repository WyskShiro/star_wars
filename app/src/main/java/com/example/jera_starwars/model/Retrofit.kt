package com.example.jera_starwars.model

import com.example.jera_starwars.model.service.*
import com.google.gson.GsonBuilder
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class Retrofit {

    private val gsonBuilder = GsonBuilder()
        .create()

    private val retrofit = Retrofit.Builder()
        .baseUrl("https://swapi.co/")
        .addConverterFactory(GsonConverterFactory.create(gsonBuilder))
        .build()

    fun movieService(): MovieService = retrofit.create(MovieService::class.java)
    fun characterService(): CharacterService = retrofit.create(CharacterService::class.java)
    fun specieService(): SpecieService = retrofit.create(SpecieService::class.java)
    fun planetService(): PlanetService = retrofit.create(PlanetService::class.java)
    fun starshipService(): StarshipService = retrofit.create(StarshipService::class.java)


}