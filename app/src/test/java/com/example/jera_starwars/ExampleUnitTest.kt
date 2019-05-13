package com.example.jera_starwars

import com.example.jera_starwars.model.Retrofit
import org.junit.Assert.assertEquals
import org.junit.Assert.assertNotNull
import org.junit.Test

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {

    @Test
    fun get_all_movies() {
        val retrofit = Retrofit().movieService()
        val call = retrofit.getAllMovies()

        val response = call
            .execute()
            .body()

        val allMoviesCount = response!!.results.size

        assertEquals(7, allMoviesCount)
    }

    @Test
    fun get_a_character() {
        val retrofit = Retrofit().characterService()
        val call = retrofit.getCharacterWithId("1")
        val response = call.execute().body()

        assertNotNull(response)
        assertEquals("19BBY", response!!.birth_year)
    }
}
