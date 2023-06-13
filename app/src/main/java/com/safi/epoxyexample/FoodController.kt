package com.safi.epoxyexample

import com.airbnb.epoxy.Typed2EpoxyController
import com.safi.epoxyexample.drinkmodel.DrinkEntity
import com.safi.epoxyexample.foodmodel.FoodEntity

class FoodController : Typed2EpoxyController<List<FoodEntity>, List<DrinkEntity>>() {

    override fun buildModels(foods: List<FoodEntity>, drinks: List<DrinkEntity>) {
        var id:Long = 0
        var drinkId = 0

        drinks.forEach {drinkEntity ->
            drink {
                id(drinkId++)
                image(drinkEntity.image)
                title(drinkEntity.title)
            }
        }

        foods.forEach { foodEntity ->
            food {
                id(id++)
                image(foodEntity.image)
                title(foodEntity.title)
                description(foodEntity.description)
            }
        }

    }
}