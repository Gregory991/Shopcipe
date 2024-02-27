package com.badvok.ingreed.database.shopping

import androidx.room.Embedded
import androidx.room.Junction
import androidx.room.Relation
import com.badvok.ingreed.database.ingredient.IngredientEntity
import com.badvok.ingreed.database.recipe.RecipeEntity
import com.badvok.ingreed.database.recipieIngredient.RecipeIngredientEntity
import com.badvok.ingreed.database.shoppingIngredient.ShoppingIngredientEntity

//Used for shopping list
data class ShoppingWithIngredientsAndRecipes(
    @Embedded val shoppingEntity: ShoppingEntity,
    @Relation(
        parentColumn = "id",
        entityColumn = "shopping_id",
        entity = ShoppingIngredientEntity::class
    )
    val shoppingIngredients: List<ShoppingIngredientWithRecipeIngredients> = listOf()
)

data class ShoppingIngredientWithRecipeIngredients(
    @Embedded val shoppingIngredientEntity: ShoppingIngredientEntity,
    @Relation(
        parentColumn = "recipe_ingredient_id",
        entityColumn = "recipe_id",
        entity = RecipeIngredientEntity::class
    )
    val recipeIngredient: RecipeIngredientWithIngredients
)



// To be used by recipe list.
data class RecipeWithIngredients(
    @Embedded val recipeEntity: RecipeEntity,
    @Relation(
        parentColumn = "id", // TODO
        entityColumn = "recipe_id",
        entity = RecipeIngredientEntity::class
    )
    val recipeIngredients: List<RecipeIngredientWithIngredients> = listOf()
)

data class RecipeIngredientWithIngredients(
    @Embedded val recipeIngredientEntity: RecipeIngredientEntity,
    @Relation(
        parentColumn = "ingredient_id",
        entityColumn = "ingredient_id",
        entity = IngredientEntity::class
    )
    val ingredients: List<IngredientEntity> = listOf()
)