package com.badvok.ingreed.ui.recipe.state

data class Recipe(
    val name: String,
    val book: String,
    val page: Int,
    val ingredients: List<Ingredient>,
    val healthRating: Int = 0,
)

data class Ingredient(
    val name: String,
    val quantity: Int,
)


fun createMockRecipes() :List<Recipe>{
   return listOf(
        Recipe(
            "Halloumi burger",
            "joe wicks blue",
            23,
            listOf(
                Ingredient(
                    "4 baps",
                    1,
                ),
                Ingredient(
                    "halloumi",
                    1,
                ), Ingredient(
                    "tomato",
                    1,
                )

            )
        )
    )
}