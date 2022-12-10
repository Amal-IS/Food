package com.example.food.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.food.MainActivity
import com.example.food.R
import com.example.food.model.Food


class FoodAdapter(
    private val context: Context,
    private val dataset: List<Food>,
    private val listener:OnItemClickListener
) : RecyclerView.Adapter<FoodAdapter.ViewHolder>() { // End of BookAdapter


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_food, parent, false)
        return ViewHolder(itemLayout)
    }

     override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = dataset[position]
        holder.foodTitle.text = context.resources.getString(item.name)
        holder.foodPrice.text = context.resources.getString(item.price)
        holder.bookImage.setImageResource(item.image)
    }

    override fun getItemCount() = dataset.size


   inner  class ViewHolder(view: View) : RecyclerView.ViewHolder(view),View.OnClickListener{ // End ViewHolder

        val foodTitle: TextView = view.findViewById(R.id.textView)
        val foodPrice: TextView = view.findViewById(R.id.textView2)
        val bookImage: ImageView = view.findViewById(R.id.image_view)

init {
    itemView.setOnClickListener {
        val position=adapterPosition
        listener.OnItemClick(position)


    }
}

       override fun onClick(v: View?) {
           val position:Int=adapterPosition
           if(position!=RecyclerView.NO_POSITION){
           listener.OnItemClick(position)}
       }
   }
interface OnItemClickListener{
    fun OnItemClick(position: Int)
}

}