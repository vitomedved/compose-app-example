package com.example.designsystem.button

import androidx.compose.foundation.layout.height
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import com.example.common.ThemePreviews
import com.example.designsystem.theme.PlaygroundTheme

@Composable
fun PlaygroundOutlinedButton(
    label: String,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    onClick: () -> Unit
) {
    OutlinedButton(
        onClick = onClick,
        modifier = modifier
            .height(50.dp)
            .clip(MaterialTheme.shapes.large),
        colors = ButtonDefaults.outlinedButtonColors(
            contentColor = MaterialTheme.colorScheme.primary,
            disabledContentColor = MaterialTheme.colorScheme.primary.copy(alpha = 0.4f)
        ),
        enabled = enabled,
    ) {
        Text(text = label)
    }
}

@ThemePreviews
@Composable
fun EnabledPlaygroundButtonThemePreview() {
    PlaygroundTheme {
        PlaygroundOutlinedButton(onClick = {}, label = "Playground button", enabled = true)
    }
}

@ThemePreviews
@Composable
fun DisabledPlaygroundButtonThemePreview() {
    PlaygroundTheme {
        PlaygroundOutlinedButton(onClick = {}, label = "Playground button", enabled = false)
    }
}
