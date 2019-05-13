package com.example.jera_starwars.model.call

import com.example.jera_starwars.model.Retrofit
import com.example.jera_starwars.model.dataclass.Specie
import com.example.jera_starwars.model.dataclass.Starship
import com.example.jera_starwars.presenter.ResourceListPresenter
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class StarshipCall(val resourceListPresenter: ResourceListPresenter) {

    fun callGetStarshipWithId(starshipId: String) {
        val retrofit = Retrofit().starshipService()
        val call = retrofit.getStarshipWithId(starshipId)

        call.enqueue(object : Callback<Starship> {
            override fun onFailure(call: Call<Starship>, t: Throwable) {
            }

            override fun onResponse(call: Call<Starship>, response: Response<Starship>) {
                resourceListPresenter.insertResourceOnList(response.body())
            }
        })
    }
}