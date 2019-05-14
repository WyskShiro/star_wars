package com.example.jera_starwars.model.call

import com.example.jera_starwars.model.Retrofit
import com.example.jera_starwars.model.dataclass.Specie
import com.example.jera_starwars.presenter.ResourceListPresenter
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class SpecieCall(val resourceListPresenter: ResourceListPresenter) {

    fun callGetSpecieWithId(specieId: String) {
        val retrofit = Retrofit().specieService()
        val call = retrofit.getSpecieWithId(specieId)

        call.enqueue(object : Callback<Specie> {
            override fun onFailure(call: Call<Specie>, t: Throwable) {}

            override fun onResponse(call: Call<Specie>, response: Response<Specie>) {
                resourceListPresenter.insertResourceOnList(response.body())
            }
        })
    }
}