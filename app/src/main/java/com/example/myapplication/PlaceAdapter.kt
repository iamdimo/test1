package com.example.myapplication

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.textview.MaterialTextView

class PlaceAdapter (private var places: List<Place>) :
    RecyclerView.Adapter<PlaceAdapter.PlaceViewHolder>() {

    class PlaceViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)
    {
        val tvName = itemView.findViewById<MaterialTextView>(R.id.name_of_place)
        val ivPlace = itemView.findViewById<ImageView>(R.id.place)
        fun bind(place : Place)
        {
            tvName.setText(place.name)
            ivPlace.setImageResource(place.image)

        }
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PlaceViewHolder {
       val view = LayoutInflater.from(parent.context).inflate(R.layout.item_place,parent,false) ;
        return PlaceViewHolder(view);
    }

    override fun getItemCount(): Int {
      return places.size
    }

    override fun onBindViewHolder(holder: PlaceViewHolder, position: Int) {
        val place = places[position]
        holder.bind(place)
    }
}