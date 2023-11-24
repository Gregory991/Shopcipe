package com.badvok.ingreed.ui.shopping

import android.util.Log
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.badvok.ingreed.ui.shopping.state.ShoppingState
import com.badvok.ingreed.ui.theme.IngreedTheme
import com.badvok.ingreed.ui.theme.PreviewVariants

@Composable
fun ShoppingScreen(
    state: ShoppingState,
) {
    Log.d("pxx", "state: ${state.shoppingList.size}")
    Column {
        LazyColumn(
            modifier = Modifier.padding(16.dp),
        ) {
            items(state.shoppingList) {
                ShoppingItem(shoppingItem = it)
            }
        }
    }
}

@Composable
fun ShoppingItem(shoppingItem: String) {
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Text(text = shoppingItem)
        Text(text = "1")
    }
}

@PreviewVariants
@Composable
private fun ShoppingPreview() {
    IngreedTheme {
        Surface(Modifier.background(color = MaterialTheme.colorScheme.background)) {

        }
        ShoppingScreen(state = ShoppingState(shoppingList = listOf("cheese", "bread", "milk")))
    }
}