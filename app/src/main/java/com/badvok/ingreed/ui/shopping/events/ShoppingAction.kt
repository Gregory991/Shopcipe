package com.badvok.ingreed.ui.shopping.events

import com.badvok.ingreed.ui.base.Action

sealed class ShoppingAction : Action {
    class CheckShoppingItem(item: String) : ShoppingAction()
}