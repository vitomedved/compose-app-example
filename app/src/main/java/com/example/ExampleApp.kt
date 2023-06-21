package com.example

import androidx.compose.material3.windowsizeclass.WindowSizeClass
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import com.example.common.model.ActivityResult
import com.example.huaweiscanner.navigation.huaweiScannerScreen
import com.example.huaweiscanner.navigation.navigateToHuaweiScanner
import com.example.menu.navigation.MenuRoute
import com.example.menu.navigation.menuScreen

@Composable
fun ExampleApp(
    modifier: Modifier = Modifier,
    windowSizeClass: WindowSizeClass,
    appState: AppState = rememberAppState(windowSizeClass = windowSizeClass),
    startDestination: String = MenuRoute.getRoute(),
    activityResult: ActivityResult?
) {
    NavHost(
        modifier = modifier,
        navController = appState.navController,
        startDestination = startDestination
    ) {
        menuScreen(
            onHuaweiScannerClicked = {
                appState.navController.navigateToHuaweiScanner()
            },
            onGoogleScannerClicked = {
            }
        )
        huaweiScannerScreen(activityResult = activityResult)
    }
}
