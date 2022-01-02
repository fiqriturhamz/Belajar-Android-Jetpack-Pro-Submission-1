package com.example.imovie.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.imovie.databinding.ItemRowMovieTvBinding
import com.example.imovie.model.DataMovie

class MovieAdapter(private val listener: MovieItemListener) :
    RecyclerView.Adapter<MovieAdapter.TvShowViewHolder>() {

    interface MovieItemListener {
        fun onClicked(movieId: Int?)
    }

    private val items = ArrayList<DataMovie>()

    fun setItems(items: ArrayList<DataMovie>) {
        this.items.clear()
        this.items.addAll(items)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TvShowViewHolder {
        val binding: ItemRowMovieTvBinding =
            ItemRowMovieTvBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return TvShowViewHolder(binding, listener)
    }

    override fun getItemCount(): Int = items.size

    override fun onBindViewHolder(holder: TvShowViewHolder, position: Int) =
        holder.bind(items[position])

    inner class TvShowViewHolder(
        private val itemBinding: ItemRowMovieTvBinding,
        private val listener: MovieItemListener
    ) : RecyclerView.ViewHolder(itemBinding.root),
        View.OnClickListener {

        private lateinit var dataMovie: DataMovie

        init {
            itemBinding.root.setOnClickListener(this)
        }

        fun bind(item: DataMovie) {
            this.dataMovie = item
            itemBinding.itemTitle.text = item.movieName
            itemBinding.itemGenre.text = item.category
            itemBinding.itemMovieRating.text = item.rating.toString()
            Glide.with(itemBinding.root)
                .load(item.image)
                .into(itemBinding.itemPoster)
        }

        override fun onClick(v: View?) {
            listener.onClicked(dataMovie.id)
        }
    }

}
