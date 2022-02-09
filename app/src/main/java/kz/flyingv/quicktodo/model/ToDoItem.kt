package kz.flyingv.quicktodo.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class ToDoItem(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    val name: String,
    val makeUntil: Long,
    val toDoStatus: ToDoStatus
)
