package com.example.assignment

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.childitemlist.view.*

class ChildAdapter (val context: Context, private val childlist:ArrayList<ChildItem>)
        : RecyclerView.Adapter<ChildAdapter.ViewHolder>(){

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
            val view = LayoutInflater.from(context).inflate(R.layout.childitemlist,parent,false)
            return ViewHolder(view)
        }

        override fun onBindViewHolder(holder: ViewHolder, position: Int) {
            val list = childlist[position]
            holder.itemView.name.text = list.name
            Glide.with(context).load(list.image).placeholder(R.drawable.ic_baseline_image_24).into(holder.itemView.imageView2)
        }

        override fun getItemCount(): Int {
            return childlist.size
        }

        class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {


        }

    }