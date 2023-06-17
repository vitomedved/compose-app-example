package com.example

import androidx.compose.material3.windowsizeclass.WindowSizeClass
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import com.example.menu.navigation.MenuRoute
import com.example.menu.navigation.menuScreen

@Composable
fun ExampleApp(
    modifier: Modifier = Modifier,
    windowSizeClass: WindowSizeClass,
    appState: AppState = rememberAppState(windowSizeClass = windowSizeClass),
    startDestination: String = MenuRoute.getRoute()
) {
    NavHost(
        modifier = modifier,
        navController = appState.navController,
        startDestination = startDestination
    ) {
        menuScreen(onHuaweiScannerClicked = {}, onGoogleScannerClicked = {})
    }
}
