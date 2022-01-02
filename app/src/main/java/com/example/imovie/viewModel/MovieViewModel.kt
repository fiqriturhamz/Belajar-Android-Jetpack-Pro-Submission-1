package com.example.imovie.viewModel

import androidx.lifecycle.ViewModel
import com.example.imovie.model.DataMovie
import com.example.imovie.utilities.MovieList

class MovieViewModel : ViewModel() {

    fun getMovies(): ArrayList<DataMovie> = MovieList.getMovieList()


}