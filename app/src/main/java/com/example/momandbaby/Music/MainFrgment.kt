package com.example.momandbaby.Music

import com.example.momandbaby.R

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.fragment_main.*

data class Movie(val title: String, val year: String,val name: Int,val image: Int)

class MainFragment : Fragment() {

    private val nicCageMovies = listOf(
        Movie("Turkish March", "Morza", R.raw.mozart_turkish_march,R.drawable.mozart1),
        Movie("MoonLight Sonata", "Beethoven", R.raw.moonlight_sonata,R.drawable.bethoven),
        Movie("At Ease", "Tony Chen", R.raw.at_ease,R.drawable.tonychen),
        Movie("Recognizing The Beloved One", "Tony Chen", R.raw.beloved_one,R.drawable.tonychen),
        Movie("Ancient Melody", "Shen Yun", R.raw.ancient_melody,R.drawable.tonychen),
        Movie("Elegance in the middle kingdom", "Shen Yun", R.raw.elegance_in_the_middle_kingdom,R.drawable.tonychen)


    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        retainInstance = true
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? =
        inflater.inflate(R.layout.fragment_main, container, false)


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        list_recycler_view.apply {
            layoutManager = LinearLayoutManager(activity)
            adapter = ListAdapter(nicCageMovies)
        }
    }

    companion object {
        fun newInstance(): MainFragment = MainFragment()
    }
}