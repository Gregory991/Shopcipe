package com.badvok.ingreed.database.ingredient

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
class IngredientEntity(
    @PrimaryKey(autoGenerate = true)
    val id : Long,
    @ColumnInfo(name = "name")
    val name: String,
)
