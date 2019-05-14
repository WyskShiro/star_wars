package com.example.jera_starwars.model.dataclass


/**
 * Classe somente para pegar os results/lista de filmes do JSON retornado pela API
 * */
class MovieJSON {
    lateinit var results: List<Movie>
}