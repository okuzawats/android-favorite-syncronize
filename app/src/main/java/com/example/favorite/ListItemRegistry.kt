package com.example.favorite

object ListItemRegistry {
    private val registry = mutableMapOf<Int, ListItem>()

    fun add(item: ListItem) {
        if (registry.containsKey(item.id).not()) {
            registry[item.id] = item
        }
    }

    fun find(id: Int): ListItem {
        return if (registry.containsKey(id)) {
            registry[id]!!
        } else {
            throw IllegalArgumentException()
        }
    }
}
