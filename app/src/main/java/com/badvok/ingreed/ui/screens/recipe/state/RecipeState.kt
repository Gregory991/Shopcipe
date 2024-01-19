package com.badvok.ingreed.ui.screens.recipe.state

import com.badvok.ingreed.ui.base.State

data class RecipeState(
    val recipes: List<Recipe> = listOf(),
) : State