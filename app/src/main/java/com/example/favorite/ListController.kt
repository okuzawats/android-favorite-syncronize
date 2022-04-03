package com.example.favorite

import android.view.View
import com.airbnb.epoxy.TypedEpoxyController

class ListController(
    private val onItemTapped: () -> Unit,
) : TypedEpoxyController<List<ListItem>>() {
    override fun buildModels(items: List<ListItem>) {
        items.forEach {
            ItemBindingModel_()
                .id(it.id)
                .name(it.name)
                .isFavorite(it.isFavorite)
                .onClick(View.OnClickListener { onItemTapped() })
                .addTo(this)
        }
    }
}