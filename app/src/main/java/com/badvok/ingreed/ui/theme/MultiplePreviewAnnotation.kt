package com.badvok.ingreed.ui.theme

import android.content.res.Configuration.UI_MODE_NIGHT_NO
import android.content.res.Configuration.UI_MODE_NIGHT_YES
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview

@Preview(
    name = "Device - Nexus 7",
    device = Devices.NEXUS_7,
)
@Preview(
    name = "Device - Small",
    heightDp = 480,
    widthDp = 220,
)
annotation class PreviewDevices

@Preview(
    name = "Theme - Dark",
    uiMode = UI_MODE_NIGHT_YES
)
@Preview(
    name = "Theme - Light",
    uiMode = UI_MODE_NIGHT_NO
)
annotation class PreviewThemes

@PreviewDevices
@PreviewThemes
annotation class PreviewVariants