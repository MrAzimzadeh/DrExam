package com.azimzada.drexam.adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.azimzada.drexam.MainActivity
import com.azimzada.drexam.R
import com.azimzada.drexam.activity.DetailActivity
import com.azimzada.drexam.model.AdapterDTO

class NearbyAdapter(var list: List<AdapterDTO>) : RecyclerView.Adapter<NearbyAdapter.ViewHolder>() {
    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var theNameOfGym = itemView.findViewById<TextView>(R.id.Name)
        var theImageOfGym = itemView.findViewById<ImageView>(R.id.avatart)
        var distance = itemView.findViewById<TextView>(R.id.subName)
        var reviewPoint = itemView.findViewById<TextView>(R.id.subDesc)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NearbyAdapter.ViewHolder {
        return ViewHolder(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.rv_item, parent, false)
        )
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: NearbyAdapter.ViewHolder, position: Int) {
        holder.theNameOfGym.setText(list.get(position).gymName)
        holder.theImageOfGym.setImageResource(list.get(position).gymImage)
        holder.distance.setText(list.get(position).subtitle)
        holder.reviewPoint.setText(list.get(position).desc)
        holder.itemView.setOnClickListener {
            val intent = Intent(holder.itemView.context, DetailActivity::class.java)
            holder.itemView.context.startActivity(intent)
        }
    }
}



