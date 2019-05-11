package com.example.jera_starwars.view.activity

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.content.ContextCompat
import android.view.MenuItem
import android.widget.ImageView
import android.widget.TextView
import com.example.jera_starwars.R
import com.example.jera_starwars.model.dataclass.Movie

class MovieDetailsActivity : AppCompatActivity() {
    lateinit var nameTextView: TextView
    lateinit var openingCrawlTextView: TextView
    lateinit var releaseDateTextView: TextView
    lateinit var moviePosterImageView: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movie_details)
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)
        supportActionBar!!.setHomeButtonEnabled(true)
        supportActionBar!!.title = getString(R.string.returnToMovieList)

        nameTextView = findViewById(R.id.moviename_textview)
        openingCrawlTextView = findViewById(R.id.movieopeningcrawl_textview)
        releaseDateTextView = findViewById(R.id.moviereleasedate_textview)
        moviePosterImageView = findViewById(R.id.movieposter_imageview)

        if (intent.hasExtra("movie")) {
            val movie = intent.extras.getSerializable("movie") as Movie

            nameTextView.text = movie.title
            openingCrawlTextView.text = movie.opening_crawl
            releaseDateTextView.text = movie.release_date

            val drawablePoster = ContextCompat.getDrawable(this, movie.posters[movie.episode_id]!!)
            moviePosterImageView.setImageDrawable(drawablePoster)
        }


    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        finish()
        return true
    }
}
