package com.badvok.ingreed.ui.screens.shopping

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.badvok.ingreed.R
import com.badvok.ingreed.ui.components.button.ShopcipeButton
import com.badvok.ingreed.ui.components.text.ListItemPrimary
import com.badvok.ingreed.ui.components.text.ShopcipeText
import com.badvok.ingreed.ui.constants.Dimensions
import com.badvok.ingreed.ui.screens.recipe.state.Ingredient
import com.badvok.ingreed.ui.screens.shopping.state.ShoppingState
import com.badvok.ingreed.ui.theme.ShopcipeTheme
import com.badvok.ingreed.ui.theme.PreviewVariants

@Composable
fun ShoppingScreen(
    state: ShoppingState,
) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(Dimensions.Padding.Medium),
        contentAlignment = Alignment.BottomCenter
    ) {
        ShopcipeButton(
            text = R.string.btn_select_recipe,
            onClick = { /*TODO*/ },
        )
        Column(modifier = Modifier.fillMaxSize()) {
            LazyColumn(
                modifier = Modifier.padding(16.dp),
            ) {
                items(state.shoppingList) {
                    ShoppingItem(shoppingItem = it)
                }
            }
        }
        ShopcipeButton(
            text = R.string.btn_select_recipe,
            onClick = { /*TODO*/ },
        )
    }

}

@Composable
fun ShoppingItem(shoppingItem: Ingredient) {
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        ShopcipeText(
            text = shoppingItem.name,
            textTheme = ListItemPrimary()
        )
        ShopcipeText(
            text = shoppingItem.quantity.toString(),
            textTheme = ListItemPrimary()
        )
    }
}

@PreviewVariants
@Composable
private fun ShoppingPreview() {
    ShopcipeTheme {
        Surface(Modifier.background(color = MaterialTheme.colorScheme.background)) {
            ShoppingScreen(
                state = ShoppingState(
                    shoppingList = listOf(
                        Ingredient("eggs", 1),
                        Ingredient("milk", 2),
                        Ingredient("bread", 3)
                    )
                )
            )
        }
    }
}