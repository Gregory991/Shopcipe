package com.badvok.ingreed.database

import com.badvok.ingreed.database.ingredient.IngredientEntity
import com.badvok.ingreed.database.recipe.RecipeDao
import com.badvok.ingreed.database.recipe.RecipeEntity
import com.badvok.ingreed.database.recipieIngredient.RecipeIngredientEntity
import com.badvok.ingreed.database.shopping.ShoppingDao
import com.badvok.ingreed.database.shopping.ShoppingEntity
import com.badvok.ingreed.database.shoppingIngredient.ShoppingIngredientEntity


class ShoppingRepository(
    val recipeDao: RecipeDao,
    val shoppingDao: ShoppingDao,
) {


    // TODO,

    //1 Make some dummy inserts.
    //2 Confirm in the DB inspector
    //3 try out the embeddeds, no need for ui just debug them

    // This returns the shopping ingredients
    // SO ideally i want to see what recipe ingredients are from. Like 2 tomates, 1 for A 1 for B
    suspend fun insertDummyData() {

        val recipe1: Long = RecipeEntity(
            id = 0,
            name = "carrot soup",
            book = "",
            page = 1,
        ).let {
            shoppingDao.insertRecipe(it)
        }
        val recipe2: Long = RecipeEntity(
            id = 0,
            name = "carrot pie",
            book = "",
            page = 1,
        ).let {
            shoppingDao.insertRecipe(it)
        }
        val recipe3: Long = RecipeEntity(
            id = 0,
            name = "tomato soup",
            book = "",
            page = 1,
        ).let {
            shoppingDao.insertRecipe(it)
        }
        val carrotId = IngredientEntity(0, "carrot").let { shoppingDao.insertIngredient(it) }
        val corianderId = IngredientEntity(0, "coriander").let { shoppingDao.insertIngredient(it) }
        val onionsId = IngredientEntity(0, "onions").let { shoppingDao.insertIngredient(it) }
        val tomatoesId = IngredientEntity(0, "tomatoes").let { shoppingDao.insertIngredient(it) }

        val recipeIngredient1 = RecipeIngredientEntity(
            recipeId = recipe1,
            ingredientId = carrotId,
            quantity = 2,
        ).let { shoppingDao.insertRecipeIngredient(it) }
        val recipeIngredient2 = RecipeIngredientEntity(
            recipeId = recipe1,
            ingredientId = corianderId,
            quantity = 3,
        ).let { shoppingDao.insertRecipeIngredient(it) }
        val recipeIngredient3 = RecipeIngredientEntity(
            recipeId = recipe1,
            ingredientId = carrotId,
            quantity = 4,
        ).let { shoppingDao.insertRecipeIngredient(it) }
        val recipeIngredient4 = RecipeIngredientEntity(
            recipeId = recipe1,
            ingredientId = onionsId,
            quantity = 1,
        ).let { shoppingDao.insertRecipeIngredient(it) }
        val recipeIngredient5 = RecipeIngredientEntity(
            recipeId = recipe1,
            ingredientId = tomatoesId,
            quantity = 1,
        ).let { shoppingDao.insertRecipeIngredient(it) }

        val shoppingId = ShoppingEntity(0, true).let { shoppingDao.insertShopping(it) }

        listOf(
            ShoppingIngredientEntity(
                shoppingId,
                recipeIngredient1,
            ),
            ShoppingIngredientEntity(
                shoppingId,
                recipeIngredient2,
            ),
            ShoppingIngredientEntity(
                shoppingId,
                recipeIngredient3,
            ),
            ShoppingIngredientEntity(
                shoppingId,
                recipeIngredient4,
            ),
            ShoppingIngredientEntity(
                shoppingId,
                recipeIngredient5,
            )
        ).let { shoppingDao.insertShoppingIngredients(it)}


    }


    //this needs to return the recipies, and have their ingredients nested

    fun getRecipes() {

    }


}