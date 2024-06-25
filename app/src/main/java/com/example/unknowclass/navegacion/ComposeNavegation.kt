package com.example.unknowclass.navegacion

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.unknowclass.screen.HorizontalSlider
import com.example.unknowclass.screen.LazyContent

@Composable
fun NavComponent(){
    val navegationController = rememberNavController()
    NavHost(navController = navegationController, startDestination = "PrimeraVista"){
        composable(route = "PrimeraVista"){
            HorizontalSlider(navegationController)
        }
        composable(route = "segundaVista"){
            LazyContent(navegationController)
        }
    }
}