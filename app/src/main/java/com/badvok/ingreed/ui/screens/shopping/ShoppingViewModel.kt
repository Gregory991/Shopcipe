package com.badvok.ingreed.ui.screens.shopping

import com.badvok.ingreed.database.ShoppingRepository
import com.badvok.ingreed.ui.base.BaseViewModel
import com.badvok.ingreed.ui.screens.recipe.state.Ingredient
import com.badvok.ingreed.ui.screens.shopping.events.ShoppingAction
import com.badvok.ingreed.ui.screens.shopping.events.ShoppingSideEffect
import com.badvok.ingreed.ui.screens.shopping.state.ShoppingState
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.update


class ShoppingViewModel(val shoppingRepository: ShoppingRepository) : BaseViewModel<ShoppingState, ShoppingAction, ShoppingSideEffect> {

    private val state = MutableStateFlow(ShoppingState())
    private val sideEffect = MutableSharedFlow<ShoppingSideEffect>()

    fun init() {

        state.update {
            it.copy(
                shoppingList = listOf(
                    Ingredient("Tomatoes", 1),
                    Ingredient("Rice", 2),
                    Ingredient("Sugar", 3),
                )
            )
        }
    }

    override fun observeState(): StateFlow<ShoppingState> = state

    override fun observeSideEffect(): Flow<ShoppingSideEffect> = sideEffect

    override fun dispatch(action: ShoppingAction) {
        when (action) {
            is ShoppingAction.CheckShoppingItem -> TODO()
        }
    }

}