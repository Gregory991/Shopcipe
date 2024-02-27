package com.badvok.ingreed.database.recipieIngredient

import androidx.room.ColumnInfo
import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey
import com.badvok.ingreed.database.ingredient.IngredientEntity
import com.badvok.ingreed.database.recipe.RecipeEntity

//@Entity(primaryKeys = ["recipe_id", "ingredient_id"])
@Entity(tableName = "recipe_ingredient",
    primaryKeys = ["recipe_id", "ingredient_id"],
    foreignKeys = [
        ForeignKey(
            entity = RecipeEntity::class,
            parentColumns = ["id"],
            childColumns = ["recipe_id"],
            onDelete = ForeignKey.CASCADE
        ),
        ForeignKey(
            entity = IngredientEntity::class,
            parentColumns = ["id"],
            childColumns = ["ingredient_id"],
            onDelete = ForeignKey.CASCADE
        )
    ]
)
class RecipeIngredientEntity(
    @ColumnInfo(name = "recipe_id")
    val recipeId : Long,
    @ColumnInfo(name = "ingredient_id")
    val ingredientId : Long,
    @ColumnInfo(name = "quantity")
    val quantity: Int,
)
