package com.canonal.periodictable.model

import androidx.appcompat.content.res.AppCompatResources

enum class ElementType {
    NONMETAL{
        override fun toString(): String {
            return "Type: Nonmetal"
        }
            },
    NOBLE_GAS{
        override fun toString(): String {
            return "Type: Noble Gas"
        }
    },
    ALKALI_METAL{
        override fun toString(): String {
            return "Alkali Metal"
        }
    },
    ALKALINE_EARTH_METAL{
        override fun toString(): String {
            return "Alkaline Earth Metal"
        }
    },
    TRANSITION_METAL{
        override fun toString(): String {
            return "Transition Metal"
        }
    },
    POST_TRANSITION_METAL{
        override fun toString(): String {
            return "Post-Transition Metal"
        }
    },
    METALLOID{
        override fun toString(): String {
            return "Metalloid"
        }
    },
    HALOGEN{
        override fun toString(): String {
            return "Halogen"
        }
    },
    LANTHANIDE{
        override fun toString(): String {
            return "Lanthanide"
        }
    },
    ACTINIDE{
        override fun toString(): String {
            return "Actinide"
        }
    },
    NOT_ELEMENT{
        override fun toString(): String {
            return ""
        }
    }
}