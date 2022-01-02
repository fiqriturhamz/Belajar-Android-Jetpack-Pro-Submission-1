package com.example.imovie.ui.tvshow.list

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.imovie.adapter.TvShowAdapter
import com.example.imovie.ui.tvshow.detail.TvShowDetailActivity
import com.example.imovie.databinding.TvShowFragmentBinding
import com.example.imovie.viewModel.TvShowViewModel


class TvShowFragment : Fragment(), TvShowAdapter.TvShowItemListener {

    private lateinit var viewModel: TvShowViewModel
    private lateinit var binding: TvShowFragmentBinding
    private lateinit var adapter: TvShowAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = TvShowFragmentBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        if (activity != null) {
            viewModel = ViewModelProvider(this)[TvShowViewModel::class.java]
            val movies = viewModel.getTvShows()

            adapter = TvShowAdapter(this)
            adapter.setItems(movies)

            binding.rvTvShow.layoutManager = LinearLayoutManager(context)
            binding.rvTvShow.setHasFixedSize(true)
            binding.rvTvShow.adapter = adapter
        }
    }

    override fun onClicked(tvShowId: Int?) {
        val intent = Intent(requireContext(), TvShowDetailActivity::class.java)
        intent.putExtra("ID", tvShowId)
        startActivity(intent)
    }

}