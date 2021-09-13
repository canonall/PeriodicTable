package com.canonal.periodictable.viewholder

import androidx.recyclerview.widget.RecyclerView
import com.canonal.periodictable.databinding.ItemPeriodicTableBinding

import com.canonal.periodictable.model.Element

class PeriodicTableViewHolder(private val binding: ItemPeriodicTableBinding): RecyclerView.ViewHolder(binding.root) {

    fun bind(element: Element){
        binding.periodicTableElement=element
    }
}