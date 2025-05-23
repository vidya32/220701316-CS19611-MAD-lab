package com.example.lushlane.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.ui.graphics.vector.ImageVector

sealed class BottomNavItem(
    val route: String,
    val icon: ImageVector,
    val title: String
) {
    object Home : BottomNavItem("home", Icons.Filled.Home, "Home")
    object Cart : BottomNavItem("cart", Icons.Filled.ShoppingCart, "Cart")
    object Profile : BottomNavItem("profile", Icons.Filled.Person, "Profile")
}
