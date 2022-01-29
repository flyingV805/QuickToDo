package kz.flyingv.quicktodo.model

import androidx.room.PrimaryKey

data class ToDoItem(
    @PrimaryKey(autoGenerate = true) val id: Int,
    val name: String,
    val makeUntil: Long
)
