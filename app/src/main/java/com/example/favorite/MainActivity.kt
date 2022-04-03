package com.example.favorite

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.ObservableBoolean

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        ListItemRegistry.add(ListItem(id = 1, name = "Item", isFavorite = ObservableBoolean(false)))
        setContentView(R.layout.activity_main)
    }
}
