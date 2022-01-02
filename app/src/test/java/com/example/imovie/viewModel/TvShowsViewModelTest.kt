package com.example.imovie.viewModel

import junit.framework.TestCase
import org.junit.Assert
import org.junit.Before
import org.junit.Test

class TvShowsViewModelTest : TestCase() {
    private lateinit var viewModel: TvShowViewModel

    @Before
    override fun setUp() {
        viewModel = TvShowViewModel()
    }

    @Test
    fun testGetTvShow() {
        val tvShows = viewModel.getTvShows()
        Assert.assertNotNull(tvShows)
        Assert.assertEquals(10, tvShows.size)
    }
}