package com.example.postapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView.ItemView
import androidx.recyclerview.widget.RecyclerView
import com.example.postapp.databinding.ActivityMainBinding

class AdapterApp (var fetchedpost:List<Post>):RecyclerView.Adapter<postappviewholder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): postappviewholder {
       val itemView = LayoutInflater.from(parent.context).inflate(R.layout.user_information,parent,false)
        return postappviewholder(itemView)
    }

    override fun getItemCount(): Int {
        return fetchedpost.size
    }

    override fun onBindViewHolder(holder: postappviewholder, position: Int) {
        val Post = fetchedpost[position]
        holder.userId.text ="UserID:${Post.userId}"
        holder.id.text = "ID:${Post.id}"
        holder.title.text = Post.title
        holder.body.text = Post.body




    }

}
class postappviewholder(itemView: View):RecyclerView.ViewHolder(itemView) {
    var userId = itemView.findViewById<TextView>(R.id.tvuserid)
    var id = itemView.findViewById<TextView>(R.id.tvid)
    var title = itemView.findViewById<TextView>(R.id.tvtitle)
    var body = itemView.findViewById<TextView>(R.id.tvname)

}
