package com.olegkos.core

sealed class Screen {
     data object WELCOME
     data object AGE
     data object GENDER
     data object HEIGHT
     data object WEIGHT
     data object NUTRIENT_GOAL
     data object ACTIVITY
     data object GOAL

     data object TRACKER_OVERVIEW
     data object SEARCH
}