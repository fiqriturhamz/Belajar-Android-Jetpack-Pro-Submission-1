package com.example.imovie.viewModel

import androidx.lifecycle.ViewModel
import com.example.imovie.model.DataTvShows
import com.example.imovie.utilities.TvShowsList

class TvShowViewModel : ViewModel() {
    fun getTvShows(): ArrayList<DataTvShows> = TvShowsList.getTvShowList()
}