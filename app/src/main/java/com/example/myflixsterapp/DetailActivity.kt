package com.example.myflixsterapp

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide

private const val TAG = "DetailActivity"

class DetailActivity : AppCompatActivity(){
    private lateinit var mediaImageView: ImageView
    private lateinit var mediaTitleView: TextView
    private lateinit var mediaShowDesc: TextView
    private lateinit var mediaAirDate: TextView
    private lateinit var mediaPopularity: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        mediaImageView = findViewById(R.id.tvPic)
        mediaTitleView = findViewById(R.id.tvTitle)
        mediaShowDesc = findViewById(R.id.tvDesc)
        mediaAirDate = findViewById(R.id.airDateText)
        mediaPopularity = findViewById(R.id.popularityText)

        val showTitle = intent.getStringExtra("tvShowTitle")
        val showImage = intent.getStringExtra("tvShowPic")
        val showDesc = intent.getStringExtra("tvShowDesc")
        val showAirDate = intent.getStringExtra("tvShowAirDate")
        val showPop = intent.getFloatExtra("tvShowPop", 0.0F)
        val tvShowPic = "https://image.tmdb.org/t/p/w500/" + showImage.toString()


        mediaTitleView.text = showTitle
        mediaShowDesc.text = showDesc
        mediaAirDate.text = showAirDate
        mediaPopularity.text = showPop.toString()

        Glide.with(this)
            .load(tvShowPic)
            .into(mediaImageView)


    }
}