package com.example.navigation

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.example.designsystem.icon.Icon
import com.example.feature.menu.R as menuR

enum class TopLevelDestination(
    @DrawableRes val icon: Int,
    @StringRes val label: Int
) {
    MENU(
        Icon.Menu,
        menuR.string.menu_destination_label
    )
}
