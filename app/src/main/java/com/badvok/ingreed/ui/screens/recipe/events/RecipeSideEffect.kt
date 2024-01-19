package com.badvok.ingreed.ui.screens.recipe.events

import com.badvok.ingreed.ui.base.Effect

sealed class RecipeSideEffect : Effect {
    data object Error : RecipeSideEffect()
}