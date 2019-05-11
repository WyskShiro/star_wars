package com.example.jera_starwars.model.call

import com.example.jera_starwars.model.Retrofit
import com.example.jera_starwars.model.datajson.MovieJSON
import com.example.jera_starwars.presenter.MovieListPresenter
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MovieCall(val movieListPresenter: MovieListPresenter) {

    fun callGetAllMovies() {
        val retrofit = Retrofit().movieService()
        val call = retrofit.listAllMovies()

        call.enqueue(object : Callback<MovieJSON> {
            override fun onFailure(call: Call<MovieJSON>, t: Throwable) {
                //TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            }

            override fun onResponse(call: Call<MovieJSON>, response: Response<MovieJSON>) {
                val movieList = response.body()
                //System.out.println(movieList!![0])

                //TODO implementar
            }

        })

        //call.enqueue.onResponse(movieListPresenter.setAllMovies(response))
    }
}