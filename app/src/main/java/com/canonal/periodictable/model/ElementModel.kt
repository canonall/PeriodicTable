package com.canonal.periodictable.model

class ElementModel(
    val name: String = "No Element",
    val symbol: String = "No Element",
    val atomNumber: Int = -1,
    val type: ElementType = ElementType.NOT_ELEMENT,
    val fullTableNumber: Int,
) : PeriodicTableModel()
