package com.example.meme_app.RetroFit

import com.example.meme_app.JSONClasses.Posts
import retrofit2.http.GET
import retrofit2.Call

interface MyAPI {
    @GET("r/dankmemes/.json?limit=100")
    fun posts(): Call<Posts>
}