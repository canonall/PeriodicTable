package com.canonal.periodictable.viewholder

import androidx.recyclerview.widget.RecyclerView
import com.canonal.periodictable.databinding.ItemElementBinding
import com.canonal.periodictable.model.ElementModel
import com.canonal.periodictable.util.DataBindingUtils


class ElementItemViewHolder(
    private val binding: ItemElementBinding,
) :
    RecyclerView.ViewHolder(binding.root) {

    fun bind(
        elementModel: ElementModel,
        onItemClickListener: (ElementModel) -> Unit
    ) {

        binding.periodicTableElement = elementModel
        DataBindingUtils.setBackground(binding.rlItem, elementModel)

        binding.rlItem.setOnClickListener {
            onItemClickListener.invoke(elementModel)
            // onItemClickListener(elementModel) also can be used
        }


    }


}
