package com.canonal.periodictable.model

import android.view.View
import androidx.databinding.BindingAdapter

class Element(
    val name: String="No Element",
    val symbol: String="No Element",
    val atomNumber: Int= -1,
    val type: ElementType= ElementType.NOT_ELEMENT,
    val fullTableNumber: Int,
    val isVisible: Boolean


)
