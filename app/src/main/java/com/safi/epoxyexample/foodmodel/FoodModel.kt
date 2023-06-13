package com.safi.epoxyexample.foodmodel

import android.view.View
import androidx.annotation.DrawableRes
import com.airbnb.epoxy.EpoxyAttribute
import com.airbnb.epoxy.EpoxyHolder
import com.airbnb.epoxy.EpoxyModelClass
import com.airbnb.epoxy.EpoxyModelWithHolder
import com.safi.epoxyexample.R
import com.safi.epoxyexample.databinding.ItemFoodBinding

@EpoxyModelClass
abstract class FoodModel : EpoxyModelWithHolder<FoodModel.FoodHolder>() {

    @EpoxyAttribute
    @DrawableRes
    var image: Int = 0

    @EpoxyAttribute
    var title: String = ""

    @EpoxyAttribute
    var description: String = ""

    override fun bind(holder: FoodHolder) {
        holder.apply {
            binding.foodIV.setImageResource(image)
            binding.foodTitleTV.text = title
            binding.foodDecTV.text = description
        }
    }

    class FoodHolder : EpoxyHolder() {
        lateinit var binding : ItemFoodBinding
        override fun bindView(itemView: View) {
            binding = ItemFoodBinding.bind(itemView)
        }
    }

    override fun getDefaultLayout(): Int {
        return R.layout.item_food
    }
}