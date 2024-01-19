package com.badvok.ingreed.ui.components.text

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle

data class ListItemPrimary(
    override val getColour: @Composable () -> Color = { MaterialTheme.colorScheme.onPrimaryContainer },
    override val getTextStyle: @Composable () -> TextStyle = { MaterialTheme.typography.titleSmall }

) : TextTheme() {
    @Composable
    fun asd() {
        val colour = getColour()
    }
}