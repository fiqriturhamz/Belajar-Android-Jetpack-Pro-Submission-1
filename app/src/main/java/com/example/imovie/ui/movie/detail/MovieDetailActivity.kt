package com.example.imovie.ui.movie.detail

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.bumptech.glide.Glide
import com.example.imovie.databinding.ActivityMovieDetailBinding
import com.example.imovie.viewModel.MovieDetailViewModel

class MovieDetailActivity : AppCompatActivity() {

    private lateinit var viewModel: MovieDetailViewModel
    private lateinit var binding: ActivityMovieDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMovieDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)
        viewModel = ViewModelProvider(this)[MovieDetailViewModel::class.java]
        intent?.getIntExtra("ID", 0)?.let { viewModel.setSelectedMovie(it) }

        val movie = viewModel.getMovie()


        Glide.with(binding.root)
            .load(movie.image)
            .into(binding.ivPoster)

        binding.tvMovie.text = movie.movieName
        binding.tvDes.text = movie.description
        binding.tvRating.text = movie.rating.toString()
        binding.tvCategory.text = movie.category


    }

}