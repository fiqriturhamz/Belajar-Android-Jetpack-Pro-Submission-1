package com.example.imovie.viewModel

import androidx.lifecycle.ViewModel
import com.example.imovie.model.DataTvShows
import com.example.imovie.utilities.TvShowsList

class TvShowDetailViewModel : ViewModel() {
    private var tvShowId: Int? = null

    fun setSelectedTvShow(tvShowId: Int) {
        this.tvShowId = tvShowId
    }

    fun getTvShow(): DataTvShows {
        lateinit var dataTvShows: DataTvShows
        val tvShows = TvShowsList.getTvShowList()
        for (tvShowItem in tvShows) {
            if (tvShowItem.id == tvShowId) {
                dataTvShows = tvShowItem
            }
        }
        return dataTvShows
    }
}