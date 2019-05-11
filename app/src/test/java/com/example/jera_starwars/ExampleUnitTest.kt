package com.example.jera_starwars

import com.example.jera_starwars.model.Retrofit
import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {

    @Test
    fun get_all_movies_test() {
        val retrofit = Retrofit().movieService()
        val call = retrofit.listAllMovies()

        val response = call
            .execute()
            .body()

        val allMoviesCount = response!!.results.size

        assertEquals(7, allMoviesCount)
    }
}
