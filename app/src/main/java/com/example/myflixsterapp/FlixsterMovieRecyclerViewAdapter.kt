package com.example.myflixsterapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class FlixsterMovieRecyclerViewAdapter(private val movie: List<FlixsterMovie>)
    : RecyclerView.Adapter<FlixsterMovieRecyclerViewAdapter.MovieViewHolder>()
{
    inner class MovieViewHolder(val mView: View): RecyclerView.ViewHolder(mView) {
        var mItem: FlixsterMovie? = null
        val filmTitle: TextView = mView.findViewById<View>(R.id.movieTitle) as TextView
        val filmDesc: TextView = mView.findViewById<View>(R.id.movieDesc) as TextView
        val filmImage: ImageView = mView.findViewById<View>(R.id.moviePic) as ImageView

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.fragment_movie, parent,false)
        return MovieViewHolder(view)
    }

    override fun getItemCount(): Int {
        return movie.size
    }

    override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {
        val movies = movie[position]
        val picUrl = "https://image.tmdb.org/t/p/w500/" + movies.movieImageUrl.toString()

        holder.mItem = movies
        holder.filmTitle.text = movies.title
        holder.filmDesc.text = movies.description

        Glide.with(holder.mView).load(picUrl).centerInside().into(holder.filmImage)

    }

}