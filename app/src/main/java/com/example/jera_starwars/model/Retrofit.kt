package com.example.jera_starwars.model

import com.example.jera_starwars.model.dataclass.Movie
import com.example.jera_starwars.model.service.MovieService
import com.google.gson.GsonBuilder
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class Retrofit{

    val gsonBuilder = GsonBuilder()
        //.registerTypeAdapter(Movie::class.java, MovieDeserializer())
        .create()

    val retrofit = Retrofit.Builder()
        .baseUrl("https://swapi.co/")
        .addConverterFactory(GsonConverterFactory.create(gsonBuilder))
        .build()


    fun movieService() : MovieService = retrofit.create(MovieService::class.java)
}