package com.example.androidfinal1.store.presentation

import com.example.androidfinal1.R
import com.example.androidfinal1.Screen

sealed class Screen(val route: String, val icon: Int){
    object Home: Screen("home", R.drawable.home)
    object Search: Screen("search", R.drawable.search)
    object Profile: Screen("profile", R.drawable.profile)
}
