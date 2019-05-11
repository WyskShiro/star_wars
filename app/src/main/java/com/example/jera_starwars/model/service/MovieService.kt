package com.example.jera_starwars.model.service

import com.example.jera_starwars.model.datajson.MovieJSON
import retrofit2.Call
import retrofit2.http.GET

interface MovieService {
    @GET("api/films/")
    fun listAllMovies(): Call<MovieJSON>
}