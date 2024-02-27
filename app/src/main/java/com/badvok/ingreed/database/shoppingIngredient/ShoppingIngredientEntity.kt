package com.badvok.ingreed.database.shoppingIngredient

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey
import com.badvok.ingreed.database.recipieIngredient.RecipeIngredientEntity
import com.badvok.ingreed.database.shopping.ShoppingEntity

@Entity(tableName = "shopping_ingredient",
    primaryKeys = ["shopping_id", "recipe_ingredient_id"],
    foreignKeys = [
        ForeignKey(
            entity = ShoppingEntity::class,
            parentColumns = ["id"],
            childColumns = ["shopping_id"],
            onDelete = ForeignKey.CASCADE
        ),
        ForeignKey(
            entity = RecipeIngredientEntity::class,
            parentColumns = ["recipe_id", "ingredient_id"],
            childColumns = ["recipe_id", "ingredient_id"],
            onDelete = ForeignKey.CASCADE
        )
    ]
)
class ShoppingIngredientEntity(
    @ColumnInfo(name = "shopping_id")
    val shoppingId: Long,
    @ColumnInfo(name = "recipe_ingredient_id")
    val recipeIngredientId: Long,
//    @ColumnInfo(name = "quantity") // Serves to express when recipe need multiples.
//    val quantity: Int,

)