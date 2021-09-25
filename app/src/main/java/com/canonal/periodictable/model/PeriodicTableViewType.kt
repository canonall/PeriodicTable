package com.canonal.periodictable.model

enum class PeriodicTableViewType(val value: Int) {
    //fun getItemViewType requires Int value so
    //we add value as Int in constructor
    ELEMENT_TYPE(1), EMPTY_TYPE(0)
}