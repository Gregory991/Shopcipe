package com.badvok.ingreed.ui.recipe

import com.badvok.ingreed.ui.base.BaseViewModel
import com.badvok.ingreed.ui.recipe.events.RecipeAction
import com.badvok.ingreed.ui.recipe.events.RecipeSideEffect
import com.badvok.ingreed.ui.recipe.state.RecipeState
import com.badvok.ingreed.ui.recipe.state.createMockRecipes
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.update

class RecipeViewModel : BaseViewModel<RecipeState, RecipeAction, RecipeSideEffect> {

    private val state = MutableStateFlow(RecipeState())
    private val sideEffect = MutableSharedFlow<RecipeSideEffect>()

    fun init(){
        state.update { it.copy(
            recipes = createMockRecipes()
        ) }
    }
    override fun observeState(): StateFlow<RecipeState> {
        TODO("Not yet implemented")
    }

    override fun observeSideEffect(): Flow<RecipeSideEffect> = sideEffect

    override fun dispatch(action: RecipeAction) {
        when(action){

            else -> {}
        }
    }
}