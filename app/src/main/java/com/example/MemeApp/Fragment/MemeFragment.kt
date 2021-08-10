package com.example.MemeApp.Fragment

import MemeApp.R
import android.content.res.ColorStateList
import android.graphics.Color
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.MemeApp.RetroFit.RetrofitClient
import com.example.trials_1.ListAdapter
import kotlinx.android.synthetic.main.fragment_meme.*
import com.example.MemeApp.JSONClasses.Posts
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class MemeFragment : Fragment() {


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        return inflater.inflate(R.layout.fragment_meme, container, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        CTL.setExpandedTitleTextColor(ColorStateList.valueOf(Color.TRANSPARENT))
        CTL.setCollapsedTitleTextColor(Color.WHITE)

        // Handling Posts from the URL
        RetrofitClient.getPosts().enqueue(object: Callback<Posts> {

            override fun onResponse(call: Call<Posts>, response: Response<Posts>) {

                Log.d("SCORE", "${response.body()?.data?.children?.get(2)?.data2!!.score}\n")
                Log.d("URL", response.body()?.data?.children?.get(2)?.data2!!.url)


                val adapter = ListAdapter(context!!.applicationContext,response)

                items.layoutManager = LinearLayoutManager(context)
                items.adapter = adapter

            }

            override fun onFailure(call: Call<Posts>, t: Throwable) {

                Log.d("ERROR","$t")

            }

        })
    }

}