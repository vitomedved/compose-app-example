package com.example.navigation.route

import androidx.navigation.NamedNavArgument
import androidx.navigation.NavDeepLink

interface NavigationRoute {

    fun getRoute(): String

    fun getArguments(): List<NamedNavArgument>

    fun getDeepLinks(): List<NavDeepLink>
}
