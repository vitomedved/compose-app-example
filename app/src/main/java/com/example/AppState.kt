package com.example

import androidx.compose.material3.windowsizeclass.WindowSizeClass
import androidx.compose.material3.windowsizeclass.WindowWidthSizeClass
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.navigation.NavDestination
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.navigation.model.NavigationType

@Composable
fun rememberAppState(
    windowSizeClass: WindowSizeClass,
    navController: NavHostController = rememberNavController()
): AppState {
    return remember(
        windowSizeClass,
        navController
    ) {
        AppState(
            windowSizeClass,
            navController
        )
    }
}

class AppState(
    private val windowSizeClass: WindowSizeClass,
    val navController: NavHostController
) {
    val currentDestination: NavDestination?
        @Composable get() = navController.currentBackStackEntryAsState().value?.destination

    val navigationType: NavigationType
        get() = when (windowSizeClass.widthSizeClass) {
            WindowWidthSizeClass.Compact -> NavigationType.BOTTOM_NAV_BAR
            else -> NavigationType.NAV_RAIL
        }
}
