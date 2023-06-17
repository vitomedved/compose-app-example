package com.example.menu

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun MenuScreen(
    onHuaweiScannerClicked: () -> Unit,
    onGoogleScannerClicked: () -> Unit
) {
    // TODO state holder, buttons

    Column(modifier = Modifier.fillMaxSize()) {
        Text(text = "Menu screen")

        // TODO create custom buttons for different QR scanners
    }
}
