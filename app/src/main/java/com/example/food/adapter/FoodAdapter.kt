package com.example.food.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.food.R
import com.example.food.model.Food


class FoodAdapter(private val context: Context,
                      private val dataset : List<Food>)
        : RecyclerView.Adapter<FoodAdapter.ViewHolder>() { // End of BookAdapter

        // TODO [3] Implement Adapter override methods
        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
            val itemLayout = LayoutInflater.from(parent.context)
                .inflate(R.layout.item_food, parent, false)
            return ViewHolder(itemLayout)
        }

        override fun onBindViewHolder(holder: ViewHolder, position: Int) {
            val item = dataset[position]
            holder.foodTitle.text = context.resources.getString(item.name)
        }

        override fun getItemCount() = dataset.size

        // TODO [2] Implement ViewHolder Class
        class ViewHolder(view : View) : RecyclerView.ViewHolder(view){
            // views in layout file
            val foodTitle : TextView = view.findViewById(R.id.textView)

        } // End ViewHolder


}