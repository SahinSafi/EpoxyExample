package com.safi.epoxyexample

import com.airbnb.epoxy.CarouselModel_
import com.airbnb.epoxy.Typed2EpoxyController
import com.safi.epoxyexample.drinkmodel.DrinkEntity
import com.safi.epoxyexample.drinkmodel.DrinkModel_
import com.safi.epoxyexample.foodmodel.FoodEntity
import com.safi.epoxyexample.foodmodel.food
import com.safi.epoxyexample.titlemodel.confirmButton
import com.safi.epoxyexample.titlemodel.headerTitle
import com.safi.epoxyexample.titlemodel.middleTitle

class FoodController(
    private val onClickDrinkItem:(isAdd: Boolean, title:String)->Unit,
    private val onClickFoodItem:(isAdd: Boolean, title:String)->Unit,
    private val onClickConfirmButton:()->Unit,
) : Typed2EpoxyController<List<FoodEntity>, List<DrinkEntity>>() {

    override fun buildModels(foods: List<FoodEntity>, drinks: List<DrinkEntity>) {
        var id:Long = 0
        var drinkId = 0

        headerTitle {
            id("title_it")
            title("Add your drink")
        }

        val drinksModel = drinks.map { item ->
            DrinkModel_(onClickDrinkItem)
                .id(drinkId++)
                .image(item.image)
                .title(item.title)
        }

        CarouselModel_()
            .id("drink_id")
            .models(drinksModel)
            .addTo(this)

        middleTitle {
            id("middle_title_id")
            title("Add your food")
        }

        foods.forEach { foodEntity ->
            food(onClickFoodItem) {
                id(id++)
                image(foodEntity.image)
                title(foodEntity.title)
                description(foodEntity.description)
            }
        }

        confirmButton(onClickConfirmButton) { id("confirm_button") }

    }
}