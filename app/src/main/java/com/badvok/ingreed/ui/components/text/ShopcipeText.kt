package com.badvok.ingreed.ui.components.text

import androidx.compose.material.Text
import androidx.compose.runtime.Composable

@Composable
fun ShopcipeText(
    text: String,
    textTheme: TextTheme,
){
    Text(
        text = text,
        color = textTheme.getColour(),
        style = textTheme.getTextStyle()
    )
}