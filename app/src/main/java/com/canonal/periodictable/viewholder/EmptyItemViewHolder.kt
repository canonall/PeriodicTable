package com.canonal.periodictable.viewholder


import androidx.recyclerview.widget.RecyclerView
import com.canonal.periodictable.databinding.ItemEmptyBinding



//there is no bind function or any other function since this item
//supposed to be empty. But in another project I can write here bind()
//and any other functions
class EmptyItemViewHolder(binding: ItemEmptyBinding,):RecyclerView.ViewHolder(binding.root) {
}