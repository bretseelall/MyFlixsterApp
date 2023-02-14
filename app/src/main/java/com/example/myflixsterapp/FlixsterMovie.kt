package com.example.myflixsterapp

import com.google.gson.annotations.SerializedName

class FlixsterMovie {
    @SerializedName("original_title")
    var title: String? = null

    @SerializedName("overview")
    var description: String? = null

    @SerializedName("poster_path")
    var movieImageUrl: String? = null
}