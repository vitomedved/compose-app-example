package com.example.menu.navigation

import androidx.navigation.NamedNavArgument
import androidx.navigation.NavController
import androidx.navigation.NavDeepLink
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavOptions
import androidx.navigation.compose.composable
import com.example.menu.MenuScreen
import com.example.navigation.route.NavigationRoute

val MenuRoute: NavigationRoute = object : NavigationRoute {

    override fun getRoute(): String = "menu"

    override fun getArguments(): List<NamedNavArgument> = emptyList()

    override fun getDeepLinks(): List<NavDeepLink> = emptyList()
}

fun NavController.navigateToMenu(navOptions: NavOptions? = null) {
    this.navigate(MenuRoute.getRoute(), navOptions)
}

fun NavGraphBuilder.menuScreen(
    onHuaweiScannerClicked: () -> Unit,
    onGoogleScannerClicked: () -> Unit
) {
    composable(route = MenuRoute.getRoute(), arguments = MenuRoute.getArguments(), deepLinks = MenuRoute.getDeepLinks()) {
        MenuScreen(onHuaweiScannerClicked = onHuaweiScannerClicked, onGoogleScannerClicked = onGoogleScannerClicked)
    }
}
