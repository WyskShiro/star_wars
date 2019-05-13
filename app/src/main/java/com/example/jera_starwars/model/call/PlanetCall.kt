package com.example.jera_starwars.model.call

import com.example.jera_starwars.model.Retrofit
import com.example.jera_starwars.model.dataclass.Planet
import com.example.jera_starwars.model.dataclass.Specie
import com.example.jera_starwars.presenter.ResourceListPresenter
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class PlanetCall(val resourceListPresenter: ResourceListPresenter) {

    fun callGetPlanetWithId(planetId: String) {
        val retrofit = Retrofit().planetService()
        val call = retrofit.getPlanetWithId(planetId)

        call.enqueue(object : Callback<Planet> {
            override fun onFailure(call: Call<Planet>, t: Throwable) {
            }

            override fun onResponse(call: Call<Planet>, response: Response<Planet>) {
                resourceListPresenter.insertResourceOnList(response.body())
            }
        })
    }
}