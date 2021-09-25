package com.canonal.periodictable.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.canonal.periodictable.R
import com.canonal.periodictable.databinding.ItemElementBinding
import com.canonal.periodictable.databinding.ItemEmptyBinding
import com.canonal.periodictable.model.ElementModel
import com.canonal.periodictable.model.EmptyModel
import com.canonal.periodictable.model.PeriodicTableModel
import com.canonal.periodictable.model.PeriodicTableViewType
import com.canonal.periodictable.viewholder.ElementItemViewHolder
import com.canonal.periodictable.viewholder.EmptyItemViewHolder

class ElementItemAdapter(
    private val periodicTableModelList: List<PeriodicTableModel>,
    private val onItemClickListener: (ElementModel) -> Unit
) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    //I have two viewHolder so I don't write here just one
    //PeriodicTableViewHolder and I don't want to write another adapter,
    //instead I write both viewHolders
    //super class which is RecyclerView.ViewHolder
    //override getItemViewType()

    private lateinit var bindingItemElement: ItemElementBinding
    private lateinit var bindingItemEmpty: ItemEmptyBinding

// if there is an update of data use this
//    var periodicTableModelList: List<PeriodicTableModel> = arrayListOf()
//    set(value) {
//        field=value
//        notifyDataSetChanged()
//    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
//        val inflater = LayoutInflater.from(parent.context)
//        binding = DataBindingUtil.inflate(inflater, R.layout.item_periodic_table, parent, false)
//        return PeriodicTableViewHolder(binding, onItemClicked)

        return when (viewType) {
            PeriodicTableViewType.ELEMENT_TYPE.value -> {
                bindingItemElement = DataBindingUtil.inflate(
                    LayoutInflater.from(parent.context),
                    R.layout.item_element,
                    parent,
                    false
                )
                ElementItemViewHolder(bindingItemElement)
            }
            PeriodicTableViewType.EMPTY_TYPE.value -> {
                bindingItemEmpty = DataBindingUtil.inflate(
                    LayoutInflater.from(parent.context),
                    R.layout.item_empty,
                    parent,
                    false
                )
                EmptyItemViewHolder(bindingItemEmpty)
            }
            else -> {
                bindingItemElement = DataBindingUtil.inflate(
                    LayoutInflater.from(parent.context),
                    R.layout.item_element,
                    parent,
                    false
                )
                ElementItemViewHolder(bindingItemElement)
            }
        }


    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {

        when (periodicTableModelList[position]) {
            is ElementModel -> {
                (holder as ElementItemViewHolder).bind(
                    periodicTableModelList[position] as ElementModel,
                    onItemClickListener
                )
            }
            is EmptyModel -> {
                //no bind defined for EmptyItem
                (holder as EmptyItemViewHolder)
            }

            else -> {
                (holder as ElementItemViewHolder).bind(
                    periodicTableModelList[position] as ElementModel,
                    onItemClickListener
                )
            }
        }


//        findViewType(position, {
//            (holder as ElementItemViewHolder).bind(
//                periodicTableModelList[position] as ElementModel,
//                onItemClickListener
//            )
//        }, {
//            (holder as EmptyItemViewHolder)
//        })

    }

    override fun getItemCount(): Int {
        return periodicTableModelList.size
    }

    //what is the view type for position -> 1,2,...
    //this view type is returned in onCreateViewHolder's parameter
    override fun getItemViewType(position: Int): Int {
        return when (periodicTableModelList[position]) {
            is ElementModel -> {
                PeriodicTableViewType.ELEMENT_TYPE.value
            }
            is EmptyModel -> {
                PeriodicTableViewType.EMPTY_TYPE.value
            }
            else -> {
                PeriodicTableViewType.ELEMENT_TYPE.value
            }
        }
//        var returnVal: Int = PeriodicTableViewType.ELEMENT_TYPE.value
//        findViewType(position, {
//            returnVal = it.value
//        }, {
//            returnVal = it.value
//        })
//        return returnVal
//    }
    }

    //if you want to show-off a bit use this
    //to get viewType
//    private fun findViewType(
//        position: Int,
//        elementTypeSelected: (PeriodicTableViewType) -> Unit,
//        emptyTypeSelected: (PeriodicTableViewType) -> Unit
//    ) {
//        when (periodicTableModelList[position]) {
//            is ElementModel -> {
//                elementTypeSelected.invoke(PeriodicTableViewType.ELEMENT_TYPE)
//            }
//            is EmptyModel -> {
//                emptyTypeSelected.invoke(PeriodicTableViewType.EMPTY_TYPE)
//            }
//            else -> {
//                elementTypeSelected.invoke(PeriodicTableViewType.ELEMENT_TYPE)
//            }
//        }
//    }
}