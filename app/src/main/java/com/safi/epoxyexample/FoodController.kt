package com.safi.epoxyexample

import com.airbnb.epoxy.EpoxyController

class FoodController : EpoxyController() {
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