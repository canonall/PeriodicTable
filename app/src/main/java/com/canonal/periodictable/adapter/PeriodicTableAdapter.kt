package com.canonal.periodictable.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.canonal.periodictable.R
import com.canonal.periodictable.databinding.ItemPeriodicTableBinding
import com.canonal.periodictable.model.Element
import com.canonal.periodictable.viewholder.PeriodicTableViewHolder

class PeriodicTableAdapter(
    private val elementList: List<Element>,
    private val onItemClicked: (position: Int) -> Unit
) :
    RecyclerView.Adapter<PeriodicTableViewHolder>() {

    private lateinit var binding: ItemPeriodicTableBinding


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PeriodicTableViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        binding = DataBindingUtil.inflate(inflater, R.layout.item_periodic_table, parent, false)
        return PeriodicTableViewHolder(binding, onItemClicked)
    }

    override fun onBindViewHolder(holder: PeriodicTableViewHolder, position: Int) {
        val newsModel = elementList[position]
        holder.bind(newsModel, position)
    }

    override fun getItemCount(): Int {
        return elementList.size
    }
}