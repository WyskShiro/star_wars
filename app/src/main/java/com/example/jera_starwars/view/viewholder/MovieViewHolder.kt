package com.example.jera_starwars.view.viewholder

import android.content.Intent
import android.support.v4.content.ContextCompat.startActivity
import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import com.example.jera_starwars.R
import com.example.jera_starwars.model.dataclass.Movie
import com.example.jera_starwars.view.activity.MovieDetailsActivity

/**
 * Representa o cartão carregado em cada posição da Recycler View
 * */

class MovieViewHolder : RecyclerView.ViewHolder, View.OnClickListener {
    var nameTextView: TextView
    var openingCrawlTextView: TextView
    var releaseDateTextView: TextView
    var directorTextView: TextView
    var moviePosterImageView: ImageView
    lateinit var movie: Movie

    constructor(itemView: View) : super(itemView) {
        nameTextView = itemView.findViewById(R.id.moviename_textview)
        openingCrawlTextView = itemView.findViewById(R.id.movieopeningcrawl_textview)
        releaseDateTextView = itemView.findViewById(R.id.moviereleasedate_textview)
        directorTextView = itemView.findViewById(R.id.moviedirector_textview)
        moviePosterImageView = itemView.findViewById(R.id.movieposter_imageview)

        itemView.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        val intentMovieDetails = Intent(v!!.context, MovieDetailsActivity::class.java)
        intentMovieDetails.putExtra("movie", movie)
        startActivity(v.context, intentMovieDetails, null)
    }
}