package com.example.jera_starwars.view.adapter

import android.content.Context
import android.support.v4.content.ContextCompat
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import com.example.jera_starwars.R
import com.example.jera_starwars.model.dataclass.Movie
import com.example.jera_starwars.view.viewholder.CharacterViewHolder
import com.example.jera_starwars.view.viewholder.MovieViewHolder
import com.example.jera_starwars.model.dataclass.Character


class CharacterAdapter(var characterList: ArrayList<Character>, var context: Context) :
    RecyclerView.Adapter<CharacterViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, p1: Int): CharacterViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.itemcard_character, parent, false)

        return CharacterViewHolder(view)
    }


    override fun getItemCount(): Int = characterList.size


    override fun onBindViewHolder(viewHolder: CharacterViewHolder, listPosition: Int) {
        val character = characterList[listPosition]

        viewHolder.nameTextView.text = character.name
        viewHolder.genderTextView.text = character.gender
        viewHolder.birthYearTextView.text = character.birth_year
        viewHolder.eyeColorTextView.text = character.eye_color
        viewHolder.hairColorTextView.text = character.hair_color
        viewHolder.heightTextView.text = character.height
        viewHolder.massTextView.text = character.mass
        viewHolder.skinColorTextView.text = character.skin_color

    }



}


