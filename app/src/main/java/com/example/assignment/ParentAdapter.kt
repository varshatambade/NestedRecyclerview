package com.example.assignment

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.assignment.util.PeekingLinearLayoutManager
import kotlinx.android.synthetic.main.parentitemlist.view.*

class ParentAdapter(val context: Context,private val parentlist:ArrayList<ChildDataClass>):RecyclerView.Adapter<ParentAdapter.ViewHolder>() {

    class ViewHolder(item: View):RecyclerView.ViewHolder(item) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.parentitemlist, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val currentlist = parentlist[position]
        holder.itemView.textView.text = currentlist.title
        holder.itemView.recyclerView.layoutManager = PeekingLinearLayoutManager(context,
            LinearLayoutManager.HORIZONTAL,false)

        val adapter = ChildAdapter(context,parentlist[position].childArrayList)
        holder.itemView.recyclerView.adapter = adapter
    }

    override fun getItemCount(): Int {
        return parentlist.size
    }
}