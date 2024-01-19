package com.badvok.ingreed.database.shoppingIngredient

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity (primaryKeys = ["shopping_id", "ingredient_id"])
class ShoppingIngredientEntity(
//    @PrimaryKey(autoGenerate = true)
//    @ColumnInfo(name = "shopping_ingredient_id")
//    val id: Long,
    @ColumnInfo(name = "shopping_id")
    val shoppingId: Long,
    @ColumnInfo(name = "ingredient_id")
    val ingredientId: Long,
    @ColumnInfo(name = "quantity")
    val quantity: Int,

)