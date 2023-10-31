package com.badvok.ingreed.ui.recipe

import com.badvok.ingreed.ui.base.Effect
import com.badvok.ingreed.ui.shopping.ShoppingSideEffect

sealed class RecipeSideEffect : Effect {
    data object Error : RecipeSideEffect()
}