package com.badvok.ingreed.ui.shopping

import com.badvok.ingreed.ui.base.State

data class ShoppingState(val shoppingList: List<String> = listOf()) : State