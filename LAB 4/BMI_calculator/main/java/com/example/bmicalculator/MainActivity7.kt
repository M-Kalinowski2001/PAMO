package com.example.bmicalculator

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity7 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main7)

        val customItemList = listOf(
                CheckboxAdapter.CustomItem("Mozzarella "),
                CheckboxAdapter.CustomItem("Pepperoni"),
                CheckboxAdapter.CustomItem("Mushrooms"),
                CheckboxAdapter.CustomItem("Paprika"),
                CheckboxAdapter.CustomItem("Flour"),
                CheckboxAdapter.CustomItem("Dry yeast"),
                CheckboxAdapter.CustomItem("Sauce"),
        )

        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = CheckboxAdapter(customItemList)
    }
}