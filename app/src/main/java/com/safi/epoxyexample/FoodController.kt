package com.safi.epoxyexample

import com.airbnb.epoxy.EpoxyController

class FoodController : EpoxyController() {

    private val foodList = listOf(
        FoodEntity(image = R.drawable.ic_launcher_background, title = "Pizza", description = "Burger"),
        FoodEntity(image = R.drawable.ic_launcher_background, title = "Pizza", description = "Burger"),
        FoodEntity(image = R.drawable.ic_launcher_background, title = "Pizza", description = "Burger"),
        FoodEntity(image = R.drawable.ic_launcher_background, title = "Pizza", description = "Burger"),
        FoodEntity(image = R.drawable.ic_launcher_background, title = "Pizza", description = "Burger"),
        FoodEntity(image = R.drawable.ic_launcher_background, title = "Pizza", description = "Burger"),
        FoodEntity(image = R.drawable.ic_launcher_background, title = "Pizza", description = "Burger"),
        FoodEntity(image = R.drawable.ic_launcher_background, title = "Pizza", description = "Burger")
    )

    override fun buildModels() {
        var id:Long = 0
        foodList.forEach { foodEntity ->
            FoodModel_()
                .id(id++)
                .image(foodEntity.image)
                .title(foodEntity.title)
                .description(foodEntity.description)
                .addTo(this)
        }
    }
}