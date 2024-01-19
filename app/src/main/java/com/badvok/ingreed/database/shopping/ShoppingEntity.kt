package com.badvok.ingreed.database.shopping

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
class ShoppingEntity(
    @ColumnInfo(name = "id")
    @PrimaryKey(autoGenerate = true)
    val id : Int,
    @ColumnInfo(name = "active")
    val active: Boolean
)