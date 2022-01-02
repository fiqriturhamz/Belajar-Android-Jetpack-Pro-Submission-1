package com.example.imovie.viewModel

import com.example.imovie.utilities.MovieList
import junit.framework.TestCase
import org.junit.Assert
import org.junit.Before
import org.junit.Test

class MovieDetailViewModelTest : TestCase() {

    private lateinit var viewModel: MovieDetailViewModel
    private val dummyMovie = MovieList.getMovieList()[0]
    private val movieId = dummyMovie.id

    @Before
    override fun setUp() {
        viewModel = MovieDetailViewModel()
        viewModel.setSelectedMovie(movieId)
    }

    @Test
    fun testGetMovies() {

        val movie = viewModel.getMovie()
        viewModel.setSelectedMovie(dummyMovie.id)
        Assert.assertNotNull(movie)
        assertEquals(dummyMovie.id, movie.id)
        assertEquals(dummyMovie.image, movie.image)
        assertEquals(dummyMovie.category, movie.category)
        assertEquals(dummyMovie.description, movie.description)
        assertEquals(dummyMovie.rating, movie.rating)
        assertEquals(dummyMovie.movieName, movie.movieName)
    }


}
