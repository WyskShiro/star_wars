package com.example.jera_starwars.view.viewholder

import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.TextView
import com.example.jera_starwars.R

class CharacterViewHolder : RecyclerView.ViewHolder {

    var nameTextView: TextView
    var genderTextView: TextView
    var birthYearTextView: TextView

    var eyeColorTextView: TextView
    var hairColorTextView: TextView
    var heightTextView: TextView

    var massTextView: TextView
    var skinColorTextView: TextView

    constructor(itemView: View) : super(itemView) {
        nameTextView = itemView.findViewById(R.id.name_textview)
        genderTextView = itemView.findViewById(R.id.gender_textview)
        birthYearTextView = itemView.findViewById(R.id.birthyear_textview)
        eyeColorTextView = itemView.findViewById(R.id.eyecolor_textview)
        hairColorTextView = itemView.findViewById(R.id.haircolor_textview)
        heightTextView = itemView.findViewById(R.id.height_textview)
        massTextView = itemView.findViewById(R.id.mass_textview)
        skinColorTextView = itemView.findViewById(R.id.skincolor_textview)
    }
}
