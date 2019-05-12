package com.example.jera_starwars.view.viewholder

import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.TextView
import com.example.jera_starwars.R

class SpecieViewHolder : RecyclerView.ViewHolder {

    var nameTextView: TextView
    var classificationTextView: TextView
    var eyeColorsTextView: TextView
    var hairColorsTextView: TextView
    var skinColorsTextView: TextView

    var averageHeightTextView: TextView
    var averageLifeSpanTextView: TextView
    var designationTextView: TextView
    var languageTextView: TextView

    constructor(itemView: View) : super(itemView) {
        nameTextView = itemView.findViewById(R.id.name_textview)
        classificationTextView = itemView.findViewById(R.id.classification_textview)
        eyeColorsTextView = itemView.findViewById(R.id.eyecolors_textview)
        hairColorsTextView = itemView.findViewById(R.id.haircolors_textview)
        skinColorsTextView = itemView.findViewById(R.id.skincolors_textview)

        averageHeightTextView = itemView.findViewById(R.id.averageheight_textview)
        averageLifeSpanTextView = itemView.findViewById(R.id.averagelifespan_textview)
        designationTextView = itemView.findViewById(R.id.designation_textview)
        languageTextView = itemView.findViewById(R.id.language_textview)
    }
}
