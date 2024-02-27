package com.badvok.ingreed.database.shopping

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Transaction
import com.badvok.ingreed.database.ingredient.IngredientEntity
import com.badvok.ingreed.database.recipe.RecipeEntity
import com.badvok.ingreed.database.recipieIngredient.RecipeIngredientEntity
import com.badvok.ingreed.database.shoppingIngredient.ShoppingIngredientEntity

@Dao
interface ShoppingDao {

    @Transaction
    @Query("SELECT * FROM shopping WHERE id =:shoppingId")
    suspend fun getShopping(shoppingId: Int): ShoppingWithIngredientsAndRecipes

    @Insert
    suspend fun insertRecipes(recipes: List<RecipeEntity>)

    @Insert
    suspend fun insertRecipe(recipe: RecipeEntity) : Long

    @Insert
    fun insertIngredients(ingredients: List<IngredientEntity>)

    @Insert
    fun insertIngredient(ingredient: IngredientEntity) : Long

    @Insert
    fun insertRecipeIngredients(recipeIngredients: List<RecipeIngredientEntity>)

    @Insert
    fun insertRecipeIngredient(recipeIngredient: RecipeIngredientEntity) : Long

    @Insert
    fun insertShoppingIngredients(shoppingIngredients: List<ShoppingIngredientEntity>)

    @Insert
    fun insertShopping(it: ShoppingEntity) : Long

}