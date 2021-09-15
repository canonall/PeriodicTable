package com.canonal.periodictable.util

import android.view.View
import androidx.core.content.ContextCompat
import androidx.databinding.BindingAdapter
import com.canonal.periodictable.R
import com.canonal.periodictable.model.Element
import com.canonal.periodictable.model.ElementType

object DataBindingUtils {
    @BindingAdapter("android:visibility")
    fun setVisibility(view: View, element: Element) {
        if (element.isVisible.not()) {
            view.visibility = View.INVISIBLE
        } else {
            view.visibility = View.VISIBLE
        }

    }

    @BindingAdapter("android:background")
    fun setBackground(view: View, element: Element) {
        when (element.type) {
            ElementType.NONMETAL -> view.setBackgroundColor(
                ContextCompat.getColor(
                    view.context,
                    R.color.non_metal
                )
            )
            ElementType.NOBLE_GAS -> view.setBackgroundColor(
                ContextCompat.getColor(
                    view.context,
                    R.color.noble_gas
                )
            )
            ElementType.ALKALI_METAL -> view.setBackgroundColor(
                ContextCompat.getColor(
                    view.context,
                    R.color.alkali_metal
                )
            )
            ElementType.ALKALINE_EARTH_METAL -> view.setBackgroundColor(
                ContextCompat.getColor(
                    view.context,
                    R.color.alkaline_earth_metal
                )
            )
            ElementType.TRANSITION_METAL -> view.setBackgroundColor(
                ContextCompat.getColor(
                    view.context,
                    R.color.transition_metal
                )
            )
            ElementType.POST_TRANSITION_METAL -> view.setBackgroundColor(
                ContextCompat.getColor(
                    view.context,
                    R.color.post_transition_metal
                )
            )
            ElementType.METALLOID -> view.setBackgroundColor(
                ContextCompat.getColor(
                    view.context,
                    R.color.metalloid
                )
            )
            ElementType.HALOGEN -> view.setBackgroundColor(
                ContextCompat.getColor(
                    view.context,
                    R.color.halogen
                )
            )
            ElementType.LANTHANIDE -> view.setBackgroundColor(
                ContextCompat.getColor(
                    view.context,
                    R.color.lanthanide
                )
            )
            ElementType.ACTINIDE -> view.setBackgroundColor(
                ContextCompat.getColor(
                    view.context,
                    R.color.acitinide
                )
            )
            ElementType.NOT_ELEMENT -> view.setBackgroundColor(
                ContextCompat.getColor(
                    view.context,
                    R.color.app_background
                )
            )
        }

    }
}