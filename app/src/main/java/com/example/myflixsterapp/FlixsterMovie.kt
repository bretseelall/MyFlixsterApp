package com.example.myflixsterapp

import com.google.gson.annotations.SerializedName

class FlixsterMovie {
    @SerializedName("name")
    var title: String? = null

    @SerializedName("overview")
    var description: String? = null

    @SerializedName("poster_path")
    var movieImageUrl: String? = null

    @SerializedName("first_air_date")
    var airDate: String? = null

    @SerializedName("vote_average")
    var popular: Float? = null
}