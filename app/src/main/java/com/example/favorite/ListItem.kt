package com.example.favorite

import androidx.databinding.ObservableBoolean

data class ListItem(
    val id: Int,
    val name: String,
    val isFavorite: ObservableBoolean,
)
