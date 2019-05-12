package com.example.jera_starwars.model.call

import com.example.jera_starwars.model.Retrofit
import com.example.jera_starwars.model.dataclass.Character
import com.example.jera_starwars.model.datajson.MovieJSON
import com.example.jera_starwars.presenter.CharacterListPresenter
import com.example.jera_starwars.presenter.MovieListPresenter
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class CharacterCall(val characterListPresenter: CharacterListPresenter) {
    fun callGetCharacterWithId(characterId: String) {
        val retrofit = Retrofit().characterService()
        val call = retrofit.getCharacterWithId(characterId)

        call.enqueue(object : Callback<Character> {
            override fun onFailure(call: Call<Character>, t: Throwable) {
            }

            override fun onResponse(call: Call<Character>, response: Response<Character>) {
                characterListPresenter.insertCharacterOnList(response.body())
            }
        })

    }
}
