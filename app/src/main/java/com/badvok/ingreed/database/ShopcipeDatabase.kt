package com.badvok.ingreed.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.badvok.ingreed.database.ingredient.IngredientDao
import com.badvok.ingreed.database.ingredient.IngredientEntity
import com.badvok.ingreed.database.recipe.RecipeDao
import com.badvok.ingreed.database.recipe.RecipeEntity
import com.badvok.ingreed.database.recipieIngredient.RecipeIngredientDao
import com.badvok.ingreed.database.recipieIngredient.RecipeIngredientEntity
import com.badvok.ingreed.database.shopping.ShoppingDao
import com.badvok.ingreed.database.shopping.ShoppingEntity
import com.badvok.ingreed.database.shoppingIngredient.ShoppingIngredientDao
import com.badvok.ingreed.database.shoppingIngredient.ShoppingIngredientEntity

@Database(
    entities = [
        RecipeEntity::class,
        RecipeIngredientEntity::class,
        IngredientEntity::class,
        ShoppingEntity::class,
        ShoppingIngredientEntity::class,
    ], version = 1,
    exportSchema = false
)
abstract class ShopcipeDatabase : RoomDatabase() {

    abstract fun getRecipeDao(): RecipeDao
    abstract fun getRecipeIngredientDao() : RecipeIngredientDao
    abstract fun getIngredientDao(): IngredientDao
    abstract fun getShoppingDao() : ShoppingDao
    abstract fun getShoppingIngredientDao() : ShoppingIngredientDao
}