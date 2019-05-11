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
        viewHolder.openingCrawlTextView.text = getFirstParagraph(movie)
        viewHolder.releaseDateTextView.text = movie.release_date

        val drawablePoster = ContextCompat.getDrawable(context, movie.posters[movie.episode_id]!!)
        viewHolder.moviePosterImageView.setImageDrawable(drawablePoster)
    }


    private fun getFirstParagraph(movie: Movie) : String {
        val opening = movie.opening_crawl

        var indexEndOfFirstParagraph = opening.indexOf("\r\n\r\n")

        // Tem um filme que não segue o padrão e separa os \r\n \r\n que são juntos nos outros filmes
        if (indexEndOfFirstParagraph == -1) {
            indexEndOfFirstParagraph = opening.indexOf("\r\n \r\n")
        }

        return opening.subSequence(0, indexEndOfFirstParagraph).toString() + "\n..."
    }

}