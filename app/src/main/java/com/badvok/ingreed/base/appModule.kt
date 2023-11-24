package com.badvok.ingreed.base

import androidx.room.Room
import com.badvok.ingreed.database.ShopcipeDatabase
import com.badvok.ingreed.ui.recipe.RecipeViewModel
import com.badvok.ingreed.ui.shopping.ShoppingViewModel
import org.koin.android.ext.koin.androidApplication
import org.koin.dsl.module

val  appModule = module {
    single { ShoppingViewModel() }
    single { RecipeViewModel() }
    single {  Room.databaseBuilder(
        androidApplication(),
        ShopcipeDatabase::class.java,
        "shopcipe_database"
    ).build()}
}