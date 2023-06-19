package com.example.common

import android.content.res.Configuration.UI_MODE_NIGHT_NO
import android.content.res.Configuration.UI_MODE_NIGHT_YES
import androidx.compose.ui.tooling.preview.Preview

@Preview(name = "Light theme", showBackground = true, backgroundColor = 0xFFFFFFFF, uiMode = UI_MODE_NIGHT_YES)
@Preview(name = "Dark theme", showBackground = true, backgroundColor = 0xFF000000, uiMode = UI_MODE_NIGHT_NO)
annotation class ThemePreviews
