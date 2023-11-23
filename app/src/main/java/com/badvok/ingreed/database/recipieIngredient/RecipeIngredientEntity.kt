package com.badvok.ingreed.database.recipieIngredient

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(primaryKeys = ["recipe_id", "ingredient_id"])
class RecipeIngredientEntity(
    @ColumnInfo(name = "recipe_id")
    val recipeId : Long,
    @ColumnInfo(name = "ingredient_id")
    val ingredientId : Long,
)
