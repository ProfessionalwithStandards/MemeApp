package com.example.MemeApp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.bumptech.glide.Glide
import MemeApp.R
import kotlinx.android.synthetic.main.activity_meme_detail.*

class MemeDetail : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_meme_detail)

        getIncomingIntent()
    }

    fun getIncomingIntent() {

        val title = intent.getStringExtra("Title")
        val img = intent.getStringExtra("IMG")
        Log.d("Intent","what is this Intent")
        Log.d("TITLE", title!!)
        Log.d("URL",img!!)

        tv.text = title
        Glide.with(applicationContext)
//            .asBitmap()
            .load(img)
            .placeholder(R.drawable.dog)
            .into(imge)
    }

}