package com.badvok.ingreed.ui.recipe.events

import com.badvok.ingreed.ui.base.Effect

sealed class RecipeSideEffect : Effect {
    data object Error : RecipeSideEffect()
}