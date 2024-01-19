package com.badvok.ingreed.ui.components.text

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle

abstract class TextTheme() {
    abstract val getColour: @Composable () -> Color
    abstract val getTextStyle: @Composable () -> TextStyle
}