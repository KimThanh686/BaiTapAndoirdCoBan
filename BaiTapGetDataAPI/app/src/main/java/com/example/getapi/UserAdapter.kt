package com.example.getapi

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.getapi.model.ListUserFollowers

class UserAdapter(private val context: Context, private val list : ListUserFollowers) : RecyclerView.Adapter<UserAdapter.ViewHolder>() {

    override fun getItemCount(): Int = list.size

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_user_follower,parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val userFollowers = list.get(position)
        holder.textViewName.text = userFollowers.login
        Glide.with(context).load(userFollowers.avatar_url).into(holder.imageAvt)
    }

    class ViewHolder(view : View) : RecyclerView.ViewHolder(view){
        val textViewName : TextView = view.findViewById(R.id.txtName)
        val imageAvt : ImageView = view.findViewById(R.id.imgAvt)
    }
}