package com.canonal.periodictable.viewholder

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.canonal.periodictable.databinding.ItemPeriodicTableBinding
import com.canonal.periodictable.model.Element
import com.canonal.periodictable.util.DataBindingUtils


class PeriodicTableViewHolder(
    private val binding: ItemPeriodicTableBinding,
    private val onItemClicked: (position: Int) -> Unit
) :
    RecyclerView.ViewHolder(binding.root), View.OnClickListener {

    init {
        binding.root.setOnClickListener(this)
    }

    private var itemPosition: Int? = null

    fun bind(element: Element, position: Int) {
        this.itemPosition = position
        binding.periodicTableElement = element
        DataBindingUtils.setVisibility(binding.rlItem, element)
        DataBindingUtils.setBackground(binding.rlItem, element)


    }

    override fun onClick(v: View?) {
        onItemClicked(itemPosition!!)
    }


}
