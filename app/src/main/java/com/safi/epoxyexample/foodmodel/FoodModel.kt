package com.safi.epoxyexample.foodmodel

import android.view.View
import androidx.annotation.DrawableRes
import androidx.core.content.ContextCompat
import com.airbnb.epoxy.EpoxyAttribute
import com.airbnb.epoxy.EpoxyHolder
import com.airbnb.epoxy.EpoxyModelClass
import com.airbnb.epoxy.EpoxyModelWithHolder
import com.safi.epoxyexample.R
import com.safi.epoxyexample.databinding.ItemFoodBinding

@EpoxyModelClass
abstract class FoodModel(
    private val onClick:(isAdd: Boolean, title:String)->Unit
) : EpoxyModelWithHolder<FoodModel.FoodHolder>() {

    @EpoxyAttribute
    @DrawableRes
    var image: Int = 0

    @EpoxyAttribute
    var title: String = ""

    @EpoxyAttribute
    var description: String = ""

    private var isSelected = false
    override fun bind(holder: FoodHolder) {
        holder.apply {
            binding.foodIV.setImageResource(image)
            binding.foodTitleTV.text = title
            binding.foodDecTV.text = description

            binding.cardView.setOnClickListener {
                if (isSelected) {
                    isSelected = false
                    binding.cardView.setCardBackgroundColor(ContextCompat.getColorStateList(binding.root.context, R.color.white))
                } else {
                    isSelected = true
                    binding.cardView.setCardBackgroundColor(ContextCompat.getColorStateList(binding.root.context, R.color.selection_color))
                }
                onClick.invoke(isSelected, title)
            }
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