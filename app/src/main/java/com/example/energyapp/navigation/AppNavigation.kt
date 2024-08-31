package com.example.energyapp.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.energyapp.ui.screens.CadastroScreen
import com.example.energyapp.ui.screens.HomeScreen
import com.example.energyapp.ui.screens.ListaScreen
import com.example.energyapp.ui.screens.LoginScreen
import com.example.energyapp.ui.screens.ProfileScreen
import com.example.energyapp.ui.screens.SplashScreen


@Composable
fun AppNavigation(navController: NavHostController) {
    NavHost(navController = navController, startDestination = "splash_screen") {
        composable("splash_screen") {
            SplashScreen(navController)
        }
        composable("login_screen") {
            LoginScreen(navController)
        }
        composable("home_screen") {
            HomeScreen(navController)
        }
        composable("profile_screen") {
            ProfileScreen(navController)
        }
        composable("cadastro_screen") {
            CadastroScreen(navController)
        }
        composable("lista_screen") {
            ListaScreen(navController)
        }
    }
}

