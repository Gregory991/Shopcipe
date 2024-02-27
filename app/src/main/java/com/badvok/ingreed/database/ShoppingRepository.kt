package com.badvok.ingreed.database

import com.badvok.ingreed.database.recipe.RecipeDao
import com.badvok.ingreed.database.shopping.ShoppingDao


class ShoppingRepository(
    recipeDao: RecipeDao,
    shoppingDao: ShoppingDao,
) {


    // This returns the shopping ingredients
    // SO ideally i want to see what recipe ingredients are from. Like 2 tomates, 1 for A 1 for B
    fun getShopping(){

    }
    


    //this needs to return the recipies, and have their ingredients nested

    fun getRecipes(){

    }


}