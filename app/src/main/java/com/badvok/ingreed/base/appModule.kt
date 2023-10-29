package com.badvok.ingreed.base

import com.badvok.ingreed.ui.shopping.ShoppingViewModel
import org.koin.dsl.module

val  appModule = module {
    single { ShoppingViewModel() }
}