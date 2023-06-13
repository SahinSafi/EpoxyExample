package com.safi.epoxyexample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.safi.epoxyexample.drinkmodel.DrinkEntity
import com.safi.epoxyexample.databinding.ActivityMainBinding
import com.safi.epoxyexample.foodmodel.FoodEntity

class MainActivity : AppCompatActivity() {

    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    private val foodController by lazy { FoodController() }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.recyclerView.apply {
            layoutManager = LinearLayoutManager(this@MainActivity)
            setHasFixedSize(true)
            adapter = foodController.adapter
        }

        foodController.setData(foodList, drinkList)
    }
}

private val drinkList = listOf(
    DrinkEntity(image = R.drawable.img_mango_juice, title = "Lemon Juice"),
    DrinkEntity(image = R.drawable.img_mocktail, title = "Mocktail"),
)

private val foodList = listOf(
    FoodEntity(image = R.drawable.img_pizza, title = "Pizza", description = "pizza, dish of Italian origin consisting of a flattened disk of bread dough topped with some combination of olive oil, oregano, tomato, olives, mozzarella or other cheese."),
    FoodEntity(image = R.drawable.img_burger, title = "Burger", description = "A burger is a patty of ground beef grilled and placed between two halves of a bun. Slices of raw onion, lettuce, bacon, mayonnaise, and other ingredients add flavor."),
    FoodEntity(image = R.drawable.img_sandwich, title = "Sandwich", description = "A sandwich is a food prepared by placing different kinds of foods between two pieces of bread. The pieces of bread in a sandwich are referred to as slices or sheets of bread."),

    FoodEntity(image = R.drawable.img_pizza, title = "Pizza", description = "pizza, dish of Italian origin consisting of a flattened disk of bread dough topped with some combination of olive oil, oregano, tomato, olives, mozzarella or other cheese."),
    FoodEntity(image = R.drawable.img_burger, title = "Burger", description = "A burger is a patty of ground beef grilled and placed between two halves of a bun. Slices of raw onion, lettuce, bacon, mayonnaise, and other ingredients add flavor."),
    FoodEntity(image = R.drawable.img_sandwich, title = "Sandwich", description = "A sandwich is a food prepared by placing different kinds of foods between two pieces of bread. The pieces of bread in a sandwich are referred to as slices or sheets of bread."),

    FoodEntity(image = R.drawable.img_pizza, title = "Pizza", description = "pizza, dish of Italian origin consisting of a flattened disk of bread dough topped with some combination of olive oil, oregano, tomato, olives, mozzarella or other cheese."),
    FoodEntity(image = R.drawable.img_burger, title = "Burger", description = "A burger is a patty of ground beef grilled and placed between two halves of a bun. Slices of raw onion, lettuce, bacon, mayonnaise, and other ingredients add flavor."),
    FoodEntity(image = R.drawable.img_sandwich, title = "Sandwich", description = "A sandwich is a food prepared by placing different kinds of foods between two pieces of bread. The pieces of bread in a sandwich are referred to as slices or sheets of bread."),
)