package com.example.jera_starwars.view.adapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import com.example.jera_starwars.R
import com.example.jera_starwars.model.dataclass.Character
import com.example.jera_starwars.view.viewholder.CharacterViewHolder


class CharacterAdapter(var characterList: ArrayList<Character>, var context: Context) :
    RecyclerView.Adapter<CharacterViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, p1: Int): CharacterViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.itemcard_character, parent, false)

        return CharacterViewHolder(view)
    }

    override fun getItemCount(): Int = characterList.size

    override fun onBindViewHolder(viewHolder: CharacterViewHolder, listPosition: Int) {
        val character = characterList[listPosition]
        val res = context.resources

        viewHolder.nameTextView.text = res.getString(R.string.character_name, character.name)
        viewHolder.genderTextView.text = res.getString(R.string.character_gender, character.gender)
        viewHolder.birthYearTextView.text = res.getString(R.string.character_birthyear, character.birth_year)
        viewHolder.eyeColorTextView.text = res.getString(R.string.character_eyecolor, character.eye_color)

        viewHolder.hairColorTextView.text = res.getString(R.string.character_haircolor, character.hair_color)
        viewHolder.heightTextView.text = res.getString(R.string.character_height, character.height)
        viewHolder.massTextView.text = res.getString(R.string.character_mass, character.mass)
        viewHolder.skinColorTextView.text = res.getString(R.string.character_skincolor, character.skin_color)
    }
}


