package com.example.jera_starwars.view.viewholder

import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import com.example.jera_starwars.R

/**
 * Representa o cartão carregado em cada posição da Recycler View
 * */

class MovieViewHolder : RecyclerView.ViewHolder {

    var nameTextView: TextView
    var openingCrawlTextView: TextView
    var releaseDateTextView: TextView
    var moviePosterImageView: ImageView

    constructor(itemView: View) : super(itemView) {
        nameTextView = itemView.findViewById(R.id.moviename_textview)
        openingCrawlTextView = itemView.findViewById(R.id.movieopeningcrawl_textview)
        releaseDateTextView = itemView.findViewById(R.id.moviereleasedate_textview)
        moviePosterImageView = itemView.findViewById(R.id.movieposter_imageview)

    }
}