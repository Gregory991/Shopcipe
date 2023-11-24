package com.badvok.ingreed.ui.recipe.state

import com.badvok.ingreed.ui.base.State

data class RecipeState(
    val recipes: List<Recipe> = listOf(),
) : State