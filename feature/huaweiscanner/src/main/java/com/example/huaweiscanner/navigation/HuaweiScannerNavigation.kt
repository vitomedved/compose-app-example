package com.example.huaweiscanner.navigation

import androidx.navigation.NamedNavArgument
import androidx.navigation.NavController
import androidx.navigation.NavDeepLink
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavOptions
import androidx.navigation.compose.composable
import com.example.common.model.ActivityResult
import com.example.huaweiscanner.HuaweiScannerScreen
import com.example.navigation.route.NavigationRoute

val HuaweiScannerRoute: NavigationRoute = object : NavigationRoute {

    override fun getRoute(): String = "hauweiScanner"

    override fun getArguments(): List<NamedNavArgument> = emptyList()

    override fun getDeepLinks(): List<NavDeepLink> = emptyList()
}

fun NavController.navigateToHuaweiScanner(navOptions: NavOptions? = null) {
    this.navigate(HuaweiScannerRoute.getRoute(), navOptions)
}

fun NavGraphBuilder.huaweiScannerScreen(activityResult: ActivityResult?) {
    composable(route = HuaweiScannerRoute.getRoute(), arguments = HuaweiScannerRoute.getArguments(), deepLinks = HuaweiScannerRoute.getDeepLinks()) {
        HuaweiScannerScreen(activityResult = activityResult)
    }
}
