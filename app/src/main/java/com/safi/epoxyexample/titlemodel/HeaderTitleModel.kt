package com.safi.epoxyexample.titlemodel

import android.view.View
import com.airbnb.epoxy.EpoxyAttribute
import com.airbnb.epoxy.EpoxyHolder
import com.airbnb.epoxy.EpoxyModelClass
import com.airbnb.epoxy.EpoxyModelWithHolder
import com.safi.epoxyexample.R
import com.safi.epoxyexample.databinding.ItemHeaderTitleBinding

@EpoxyModelClass
abstract class HeaderTitleModel : EpoxyModelWithHolder<HeaderTitleModel.HeaderTitleHolder>() {

    @EpoxyAttribute
    var title: String = ""

    override fun bind(holder: HeaderTitleHolder) {
        holder.apply {
            binding.titleTV.text = title
        }
    }

    class HeaderTitleHolder : EpoxyHolder() {
        lateinit var binding : ItemHeaderTitleBinding
        override fun bindView(itemView: View) {
            binding = ItemHeaderTitleBinding.bind(itemView)
        }
    }

    override fun getDefaultLayout(): Int {
        return R.layout.item_header_title
    }
}