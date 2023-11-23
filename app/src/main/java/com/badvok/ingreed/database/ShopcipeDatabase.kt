package com.badvok.ingreed.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.badvok.ingreed.database.ingredient.IngredientDao
import com.badvok.ingreed.database.ingredient.IngredientEntity
import com.badvok.ingreed.database.recipe.RecipeDao
import com.badvok.ingreed.database.recipe.RecipeEntity

@Database(
    entities = [
        RecipeEntity::class,
        IngredientEntity::class,
    ], version = 1,
    exportSchema = false
)
abstract class ShopcipeDatabase : RoomDatabase() {

    abstract fun getRecipeDao(): RecipeDao
    abstract fun getIngredientDao(): IngredientDao
}