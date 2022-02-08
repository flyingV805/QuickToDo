package kz.flyingv.quicktodo.storage

import androidx.room.Database
import androidx.room.RoomDatabase
import kz.flyingv.quicktodo.model.ToDoItem
import kz.flyingv.quicktodo.storage.dao.ToDoDao

@Database(entities = [ToDoItem::class], version = 1)
abstract class AppStorage: RoomDatabase() {
    abstract fun toDoDao(): ToDoDao
}