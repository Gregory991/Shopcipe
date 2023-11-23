package com.badvok.ingreed.base

import com.badvok.ingreed.ui.shopping.ShoppingViewModel
import org.koin.dsl.module

val  appModule = module {
    single { ShoppingViewModel() }
    single {  Room.databaseBuilder(
        androidApplication,
        RunningDatabase::class.java,
        RUNNING_DATABASE_NAME
    ).build()}
}