package com.badvok.ingreed.ui.screens.shopping.state

import com.badvok.ingreed.ui.base.State
import com.badvok.ingreed.ui.screens.recipe.state.Ingredient

data class ShoppingState(val shoppingList: List<Ingredient> = listOf()) : State