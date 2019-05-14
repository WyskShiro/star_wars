package com.example.jera_starwars.view.activity

import android.content.Intent
import android.os.Bundle
import android.support.v4.content.ContextCompat
import android.support.v7.app.AppCompatActivity
import android.view.MenuItem
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import com.example.jera_starwars.R
import com.example.jera_starwars.model.dataclass.Movie

class MovieDetailsActivity : AppCompatActivity() {
    lateinit var nameTextView: TextView
    lateinit var directorTextView: TextView
    lateinit var openingCrawlTextView: TextView
    lateinit var releaseDateTextView: TextView
    lateinit var moviePosterImageView: ImageView

    lateinit var charactersButton: Button
    lateinit var speciesButton: Button
    lateinit var planetsButton: Button
    lateinit var starshipsButton: Button
    lateinit var movie: Movie

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movie_details)
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)
        supportActionBar!!.setHomeButtonEnabled(true)
        supportActionBar!!.title = getString(R.string.moviedetails)

        nameTextView = findViewById(R.id.moviename_textview)
        directorTextView = findViewById(R.id.moviedirector_textview)
        openingCrawlTextView = findViewById(R.id.movieopeningcrawl_textview)
        releaseDateTextView = findViewById(R.id.moviereleasedate_textview)
        moviePosterImageView = findViewById(R.id.movieposter_imageview)


        charactersButton = findViewById(R.id.characters_button)
        speciesButton = findViewById(R.id.species_button)
        planetsButton = findViewById(R.id.planets_button)
        starshipsButton = findViewById(R.id.starships_button)


        if (intent.hasExtra("movie")) {
            movie = intent.extras.getSerializable("movie") as Movie

            nameTextView.text = movie.title
            directorTextView.text = movie.director
            openingCrawlTextView.text = movie.opening_crawl
            releaseDateTextView.text = movie.release_date

            val drawablePoster = ContextCompat.getDrawable(this, movie.posters[movie.episode_id]!!)
            moviePosterImageView.setImageDrawable(drawablePoster)
        }


        charactersButton.setOnClickListener {
            passMovieToNextActivity(CharactersListActivity::class.java)
        }

        speciesButton.setOnClickListener {
            passMovieToNextActivity(SpeciesListActivity::class.java)
        }

        planetsButton.setOnClickListener {
            passMovieToNextActivity(PlanetListActivity::class.java)
        }

        starshipsButton.setOnClickListener {
            passMovieToNextActivity(StarshipListActivity::class.java)
        }
    }


    private fun passMovieToNextActivity(activityClass: Class<out MovieResourcesListActivity>) {
        val intentMovieResources = Intent(this, activityClass)
        intentMovieResources.putExtra("movie", movie)
        startActivity(intentMovieResources)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        finish()
        return true
    }
}
