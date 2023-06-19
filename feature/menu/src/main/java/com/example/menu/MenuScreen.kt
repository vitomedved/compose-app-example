package com.example.menu

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.designsystem.button.PlaygroundOutlinedButton

@Composable
fun MenuScreen(
    onHuaweiScannerClicked: () -> Unit,
    onGoogleScannerClicked: () -> Unit
) {
    // TODO state holder, buttons

    Column(modifier = Modifier.fillMaxSize()) {
        // TODO resources
        PlaygroundOutlinedButton(label = "Huawei Scan Kit", onClick = onHuaweiScannerClicked)
    }
}
