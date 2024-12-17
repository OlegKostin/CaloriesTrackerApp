package com.olegkos.core.util

import com.olegkos.core.Screen

sealed class UiEvent {

    data class Navigate(val screen: Screen): UiEvent()
    object NavigateUp: UiEvent()
}