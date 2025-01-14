package com.dendroide.navigationguide.core.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.toRoute
import com.dendroide.navigationguide.DetailScreen
import com.dendroide.navigationguide.HomeScreen
import com.dendroide.navigationguide.LoginScreen
import com.dendroide.navigationguide.SettingsScreen
import com.dendroide.navigationguide.core.navigation.type.createNavType
import com.dendroide.navigationguide.core.navigation.type.settingsInfoType
import kotlin.reflect.typeOf

@Composable
fun NavigationWrapper() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Login){
        composable<Login>{
            LoginScreen{
                navController.navigate(Home)
            }
        }

        composable<Home> {
            HomeScreen{
               name -> navController.navigate(Detail(name = name))
            }
        }

        composable<Detail> { backStackEntry ->
            val detail = backStackEntry.toRoute<Detail>()
            DetailScreen(detail.name, navigateBack = { navController.navigateUp() }, navigateToSettings = { navController.navigate(Settings(it)) })
        }



        composable<Settings>(typeMap = mapOf(typeOf<SettingsInfo>() to createNavType<SettingsInfo>())) { backStackEntry ->
            val settings: Settings = backStackEntry.toRoute()
            SettingsScreen(settings.info)
        }
    }
}