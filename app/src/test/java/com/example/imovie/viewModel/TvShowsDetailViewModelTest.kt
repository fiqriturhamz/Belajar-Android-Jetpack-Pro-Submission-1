package com.example.imovie.viewModel

import com.example.imovie.utilities.TvShowsList
import junit.framework.TestCase
import org.junit.Assert
import org.junit.Before
import org.junit.Test

class TvShowsDetailViewModelTest : TestCase() {
    private lateinit var viewModel: TvShowDetailViewModel
    private val dummyTvShow = TvShowsList.getTvShowList()[0]
    private val tvShowId = dummyTvShow.id

    @Before
    override fun setUp() {
        viewModel = TvShowDetailViewModel()
        viewModel.setSelectedTvShow(tvShowId)
    }

    @Test
    fun testGetTvShow() {

        val tvShow = viewModel.getTvShow()
        viewModel.setSelectedTvShow(dummyTvShow.id)
        Assert.assertNotNull(tvShow)
        assertEquals(dummyTvShow.id, tvShow.id)
        assertEquals(dummyTvShow.image, tvShow.image)
        assertEquals(dummyTvShow.category, tvShow.category)
        assertEquals(dummyTvShow.description, tvShow.description)
        assertEquals(dummyTvShow.rating, tvShow.rating)
        assertEquals(dummyTvShow.tvShowsName, tvShow.tvShowsName)
    }


}