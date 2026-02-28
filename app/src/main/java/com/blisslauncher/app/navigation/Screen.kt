package com.blisslauncher.app.navigation

sealed class NavigationRoute(val route: String) {
    object Home : NavigationRoute("home")
    object Settings : NavigationRoute("settings")
    object Profile : NavigationRoute("profile")
    // Add more routes as needed
}