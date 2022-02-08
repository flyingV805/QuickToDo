package kz.flyingv.quicktodo.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class ToDoItem(
    @PrimaryKey(autoGenerate = true) val id: Int,
    val name: String,
    val makeUntil: Long
)
