package com.example.meme_app

import MemeApp.R
import android.content.Context
import android.content.Intent
import androidx.recyclerview.widget.RecyclerView
import android.view.ViewGroup
import android.view.LayoutInflater
import android.view.View
import android.widget.ImageView
import android.widget.Toast
import com.bumptech.glide.Glide
import android.widget.TextView
import com.google.android.material.card.MaterialCardView
import com.example.meme_app.JSONClasses.Posts
import retrofit2.Response

class ListAdapter(private val context: Context,val posts: Response<Posts>) : RecyclerView.Adapter<ViewHolder>() {

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.item_list, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        holder.parent.setOnClickListener {
            Toast.makeText(
                context,
                posts.body()!!.data.children[position].data2.url,
                Toast.LENGTH_SHORT
            ).show()

            val intent = Intent(context, MemeDetail::class.java)
            intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK
            intent.putExtra("Title",posts.body()!!.data.children[position].data2.score)
            intent.putExtra("IMG",posts.body()!!.data.children[position].data2.url)
            context.startActivity(intent)

        }

        holder.title.text = posts.body()!!.data.children[position].data2.score

        Glide.with(context)
//            .asBitmap()
            .load(posts.body()!!.data.children[position].data2.url)
            .placeholder(R.drawable.dog)
            .into(holder.image)

    }

    // Size of JSON array
    override fun getItemCount(): Int {
        return posts.body()!!.data.children.size
    }
}

    class ViewHolder(val view: View) : RecyclerView.ViewHolder(view) {
        val image: ImageView = view.findViewById(R.id.image)
        val title: TextView = view.findViewById(R.id.Title)
        val parent: MaterialCardView = view.findViewById(R.id.list_item_layout)

    }

