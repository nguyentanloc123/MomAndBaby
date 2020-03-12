package com.example.momandbaby.Music

import android.content.Context
import android.media.MediaPlayer
import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.momandbaby.R

class ListAdapter(private val list: List<Movie>)
    : RecyclerView.Adapter<MovieViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        return MovieViewHolder(inflater, parent)
    }

    override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {
        val movie: Movie = list[position]
        holder.bind(movie)
        val context= holder.mTitleView?.context
        var media: MediaPlayer= MediaPlayer.create(context,list.get(position).name)

        holder.mImageView?.setImageResource(list.get(position).image)
        var check: Boolean= true
        var checkTitle: Boolean= true
        holder.mTitleView?.setOnClickListener {


            if (media.isPlaying)
            {
                media.pause()
                holder.mTitleView?.setBackgroundResource(R.color.white)
                checkTitle=true

            }
            else if (!media.isPlaying)
            {
                media.start()
                checkTitle=false
                holder.mTitleView?.setBackgroundResource(R.color.colorGrayLight)
            }




            Log.d("media_start","media_start")
        }
        holder.mButton?.setOnClickListener {
            if(check)
            {
                holder.mButton?.setBackgroundResource(R.drawable.icon_love_state)
                check= false
            }
            else if (!check)
            {
                check=true
                holder.mButton?.setBackgroundResource(R.drawable.iconlove)
            }

        }
    }

    override fun getItemCount(): Int = list.size

}

class MovieViewHolder(inflater: LayoutInflater, parent: ViewGroup) :
    RecyclerView.ViewHolder(inflater.inflate(R.layout.list_item, parent, false)) {
    public var mTitleView: TextView? = null
    public var mYearView: TextView? = null
    public var mButton: ImageButton? = null
    public var mImageView: ImageView? = null


    init {
        mTitleView = itemView.findViewById(R.id.list_title)
        mYearView = itemView.findViewById(R.id.list_description)
        mButton = itemView.findViewById(R.id.btnLove)
        mImageView = itemView.findViewById(R.id.imgMusic)
    }

    fun bind(movie: Movie) {
        mTitleView?.text = movie.title
        mYearView?.text = movie.year.toString()
        mImageView?.setBackgroundResource(movie.image)
        mImageView?.setImageResource(movie.image)

    }



}