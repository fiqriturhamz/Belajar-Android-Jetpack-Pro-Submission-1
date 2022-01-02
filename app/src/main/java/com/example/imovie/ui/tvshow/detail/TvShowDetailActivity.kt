package com.example.imovie.ui.tvshow.detail

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.bumptech.glide.Glide
import com.example.imovie.databinding.ActivityTvShowDetailBinding
import com.example.imovie.viewModel.TvShowDetailViewModel

class TvShowDetailActivity : AppCompatActivity() {

    private lateinit var viewModel: TvShowDetailViewModel
    private lateinit var binding: ActivityTvShowDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTvShowDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)
        viewModel = ViewModelProvider(this)[TvShowDetailViewModel::class.java]
        intent?.getIntExtra("ID", 0)?.let { viewModel.setSelectedTvShow(it) }

        val movie = viewModel.getTvShow()



        Glide.with(binding.root)
            .load(movie.image)
            .into(binding.ivTvshows)

        binding.tvTvshows.text = movie.tvShowsName
        binding.tvDesTvshows.text = movie.description
        binding.tvRatingTvShows.text = movie.rating.toString()
        binding.tvCategoryTvshows.text = movie.category

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }
}