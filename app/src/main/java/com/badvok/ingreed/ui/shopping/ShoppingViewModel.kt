package com.badvok.ingreed.ui.shopping

import androidx.lifecycle.ViewModelStore
import com.badvok.ingreed.ui.base.BaseViewModel
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.update


class ShoppingViewModel : BaseViewModel<ShoppingState, ShoppingAction, ShoppingSideEffect> {

    private val state = MutableStateFlow(ShoppingState())
    private val sideEffect = MutableSharedFlow<ShoppingSideEffect>()

    fun init(){
        state.update { it.copy(
            shoppingList = listOf("Tomatoes", "Rice", "Sugar")
        ) }
    }

    override fun observeState(): StateFlow<ShoppingState> = state

    override fun observeSideEffect(): Flow<ShoppingSideEffect> = sideEffect

    override fun dispatch(action: ShoppingSideEffect) {
        when(action){
            ShoppingSideEffect.Error -> TODO()
        }
    }

}