package com.example.imovie.ui.movie.list

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.imovie.adapter.MovieAdapter
import com.example.imovie.databinding.MovieFragmentBinding
import com.example.imovie.ui.movie.detail.MovieDetailActivity
import com.example.imovie.viewModel.MovieViewModel

class MovieFragment : Fragment(), MovieAdapter.MovieItemListener {

    private lateinit var viewModel: MovieViewModel
    private lateinit var binding: MovieFragmentBinding
    private lateinit var adapter: MovieAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = MovieFragmentBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        if (activity != null) {
            viewModel = ViewModelProvider(this)[MovieViewModel::class.java]
            val movies = viewModel.getMovies()

            adapter = MovieAdapter(this)
            adapter.setItems(movies)

            binding.rvMovie.layoutManager = LinearLayoutManager(context)
            binding.rvMovie.setHasFixedSize(true)
            binding.rvMovie.adapter = adapter
        }
    }

    override fun onClicked(movieId: Int?) {
        val intent = Intent(requireContext(), MovieDetailActivity::class.java)
        intent.putExtra("ID", movieId)
        startActivity(intent)
    }

}