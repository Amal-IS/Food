package com.example.food

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.example.food.adapter.FoodAdapter
import com.example.food.data.Datasource

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val datset = Datasource().loadfood()

        val recyclerView = findViewById<RecyclerView>(R.id.rv_food)

        val adapter = FoodAdapter(this, datset)

        recyclerView.adapter = adapter

        recyclerView.setHasFixedSize(true)
    }
}