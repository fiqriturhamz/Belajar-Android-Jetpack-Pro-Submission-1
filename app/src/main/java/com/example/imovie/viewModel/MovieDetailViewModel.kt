package com.example.imovie.viewModel

import androidx.lifecycle.ViewModel
import com.example.imovie.model.DataMovie
import com.example.imovie.utilities.MovieList

class MovieDetailViewModel : ViewModel() {

    private var movieId: Int? = null

    fun setSelectedMovie(movieId: Int) {
        this.movieId = movieId
    }

    fun getMovie(): DataMovie {
        lateinit var dataMovie: DataMovie
        val movies = MovieList.getMovieList()
        for (movieItem in movies) {
            if (movieItem.id == movieId) {
                dataMovie = movieItem
            }
        }
        return dataMovie
    }
}