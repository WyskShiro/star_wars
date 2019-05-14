package com.example.jera_starwars.view.adapter

import android.content.Context
import android.support.v4.content.ContextCompat
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import com.example.jera_starwars.R
import com.example.jera_starwars.model.dataclass.Movie
import com.example.jera_starwars.view.viewholder.MovieViewHolder

class MovieAdapter(var movieList: List<Movie>, var context: Context) :
    RecyclerView.Adapter<MovieViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, p1: Int): MovieViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.itemcard_movie, parent, false)

        return MovieViewHolder(view)
    }


    override fun getItemCount(): Int = movieList.size


    override fun onBindViewHolder(viewHolder: MovieViewHolder, listPosition: Int) {
        val movie = movieList[listPosition]

        viewHolder.movie = movie
        viewHolder.nameTextView.text = movie.title
        viewHolder.directorTextView.text = movie.director
        viewHolder.openingCrawlTextView.text = movie.getFirstParagraph()
        viewHolder.releaseDateTextView.text = movie.release_date

        val drawablePoster = ContextCompat.getDrawable(context, movie.posters[movie.episode_id]!!)
        viewHolder.moviePosterImageView.setImageDrawable(drawablePoster)
    }

}