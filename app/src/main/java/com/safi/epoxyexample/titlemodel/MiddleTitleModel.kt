package com.safi.epoxyexample.titlemodel

import android.view.View
import com.airbnb.epoxy.EpoxyAttribute
import com.airbnb.epoxy.EpoxyHolder
import com.airbnb.epoxy.EpoxyModelClass
import com.airbnb.epoxy.EpoxyModelWithHolder
import com.safi.epoxyexample.R
import com.safi.epoxyexample.databinding.ItemMiddleTitleBinding

@EpoxyModelClass
abstract class MiddleTitleModel : EpoxyModelWithHolder<MiddleTitleModel.MiddleTitleHolder>() {

    @EpoxyAttribute
    var title: String = ""

    override fun bind(holder: MiddleTitleHolder) {
        holder.apply {
            binding.titleTV.text = title
        }
    }

    class MiddleTitleHolder : EpoxyHolder() {
        lateinit var binding : ItemMiddleTitleBinding
        override fun bindView(itemView: View) {
            binding = ItemMiddleTitleBinding.bind(itemView)
        }
    }

    override fun getDefaultLayout(): Int {
        return R.layout.item_middle_title
    }
}