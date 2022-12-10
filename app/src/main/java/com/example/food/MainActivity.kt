package com.example.food

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.LayoutManager
import com.example.food.adapter.FoodAdapter
import com.example.food.data.Datasource
import com.example.food.model.Food

class  MainActivity : AppCompatActivity(), FoodAdapter.OnItemClickListener {
val listOfFood= mutableListOf(
    Food(R.drawable.f6,R.string.food2,R.string.food1) ,
    Food(R.drawable.f7,R.string.food4,R.string.food3) ,
    Food(R.drawable.f8,R.string.food6,R.string.food5) ,
    Food(R.drawable.f9,R.string.food7,R.string.food8) ,
    Food(R.drawable.f11,R.string.food10,R.string.food9) ,


)
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val datset = Datasource().loadfood()
        val recyclerView = findViewById<RecyclerView>(R.id.rv_food)

        val adapter = FoodAdapter(this, datset,this)

        recyclerView.adapter = adapter
       recyclerView.setHasFixedSize(true)


    }

    override fun OnItemClick(position: Int) {
        Toast.makeText(this ,listOfFood[position].name,Toast.LENGTH_SHORT).show()
    }

}