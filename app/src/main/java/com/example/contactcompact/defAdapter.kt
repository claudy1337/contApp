package com.example.contactcompact

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.contact_item.view.*

class defAdapter(private val examplelstv:List<User>): RecyclerView.Adapter<defAdapter.ExapleAdapter>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ExapleAdapter {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.contact_item, parent, false)
        return ExapleAdapter(itemView)
    }

    override fun onBindViewHolder(holder: ExapleAdapter, position: Int) {
        val rate = AnimationUtils.loadAnimation(holder.itemView.context,R.anim.slide_in_left)
        val currentItem = examplelstv[position]
        holder.itemView.startAnimation(rate)
        holder.img_contact.setImageResource(currentItem.photoId)
        holder.name_contact.text = currentItem.name
        holder.number_contact.text = currentItem.number.toString()

    }
    class ExapleAdapter(itemview: View):RecyclerView.ViewHolder(itemview) {
        val img_contact = itemview.img_contact
        val name_contact = itemview.name_cont
        val number_contact = itemview.number_cont
    }
    override fun getItemCount(): Int = examplelstv.size

}