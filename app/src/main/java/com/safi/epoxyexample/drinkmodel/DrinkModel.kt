package com.safi.epoxyexample.drinkmodel

import android.view.View
import androidx.annotation.DrawableRes
import com.airbnb.epoxy.EpoxyAttribute
import com.airbnb.epoxy.EpoxyHolder
import com.airbnb.epoxy.EpoxyModelClass
import com.airbnb.epoxy.EpoxyModelWithHolder
import com.safi.epoxyexample.R
import com.safi.epoxyexample.databinding.ItemDrinkBinding

@EpoxyModelClass
abstract class DrinkModel : EpoxyModelWithHolder<DrinkModel.DrinkHolder>() {

    @EpoxyAttribute
    @DrawableRes
    var image: Int = 0

    @EpoxyAttribute
    var title: String = ""

    override fun bind(holder: DrinkHolder) {
        holder.apply {
            binding.drinkIV.setImageResource(image)
            binding.title.text = title
        }
    }

    inner class DrinkHolder : EpoxyHolder() {
        lateinit var binding: ItemDrinkBinding
        override fun bindView(itemView: View) {
            binding = ItemDrinkBinding.bind(itemView)
        }
    }

    override fun getDefaultLayout(): Int {
        return R.layout.item_drink
    }
}