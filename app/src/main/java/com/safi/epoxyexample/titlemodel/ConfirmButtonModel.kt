package com.safi.epoxyexample.titlemodel

import android.view.View
import com.airbnb.epoxy.EpoxyAttribute
import com.airbnb.epoxy.EpoxyHolder
import com.airbnb.epoxy.EpoxyModelClass
import com.airbnb.epoxy.EpoxyModelWithHolder
import com.safi.epoxyexample.R
import com.safi.epoxyexample.databinding.ItemConfirmButtonBinding

@EpoxyModelClass
abstract class ConfirmButtonModel(
    private val onClick:()->Unit
) : EpoxyModelWithHolder<ConfirmButtonModel.MiddleTitleHolder>() {

    @EpoxyAttribute
    var title: String = ""

    override fun bind(holder: MiddleTitleHolder) {
        holder.apply {
            binding.confirmBtn.setOnClickListener {
                onClick.invoke()
            }
        }
    }

    class MiddleTitleHolder : EpoxyHolder() {
        lateinit var binding : ItemConfirmButtonBinding
        override fun bindView(itemView: View) {
            binding = ItemConfirmButtonBinding.bind(itemView)
        }
    }

    override fun getDefaultLayout(): Int {
        return R.layout.item_confirm_button
    }
}