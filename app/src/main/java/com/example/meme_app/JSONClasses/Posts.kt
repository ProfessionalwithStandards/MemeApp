package com.example.meme_app.JSONClasses

import com.google.gson.annotations.SerializedName

// Class to get specific values from JSON

data class Posts(

    @SerializedName("data")
    val `data`: Data
) {

    class Data(

        @SerializedName("children")
        val children: List<Children>

    )

    class Children(

        @SerializedName("data")
        val data2: Data2,

        )

    class Data2(

        @SerializedName("title")
        val score: String,
        @SerializedName("url")
        val url: String

    )
}