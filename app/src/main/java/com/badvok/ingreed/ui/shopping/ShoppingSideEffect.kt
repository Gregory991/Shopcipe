package com.badvok.ingreed.ui.shopping

import com.badvok.ingreed.ui.base.Effect


sealed class ShoppingSideEffect : Effect {
    data object Error : ShoppingSideEffect()
    // Snack bar type things here
}