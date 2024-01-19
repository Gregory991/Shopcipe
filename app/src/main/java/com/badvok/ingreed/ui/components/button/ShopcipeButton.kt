package com.badvok.ingreed.ui.components.button

import androidx.annotation.StringRes
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import com.badvok.ingreed.R
import com.badvok.ingreed.ui.components.button.ShopcipeButtonColours.buttonColours
import com.badvok.ingreed.ui.constants.Dimensions.Size.ButtonHeight
import com.badvok.ingreed.ui.theme.ShopcipeTheme
import com.badvok.ingreed.ui.theme.PreviewThemes

@Composable
fun ShopcipeButton(
    @StringRes text: Int,
    onClick: () -> Unit,
) {
    Button(
//        colors = buttonColours(),
        modifier = Modifier.defaultMinSize(minHeight = ButtonHeight),
        onClick = { onClick() },
    ) {
        Text(
            text = stringResource(id = text),
            color = MaterialTheme.colorScheme.onPrimary,
        )
    }

}

@PreviewThemes
@Composable
private fun ShopcipeButtonPreview() {
    ShopcipeTheme {
        Surface(Modifier.background(color = MaterialTheme.colorScheme.background)) {
            ShopcipeButton(R.string.btn_select_recipe) {}
        }
    }
}