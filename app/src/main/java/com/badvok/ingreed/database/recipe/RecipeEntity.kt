package com.badvok.ingreed.database.recipe

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.badvok.ingreed.database.Ingredient

@Entity
class RecipeEntity(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "recipe_id")
    val id: Long,
    @ColumnInfo(name = "name")
    val name: String,
    @ColumnInfo(name = "book")
    val book: String,
    @ColumnInfo(name = "page")
    val page: Int,
)