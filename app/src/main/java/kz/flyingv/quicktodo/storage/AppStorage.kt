package kz.flyingv.quicktodo.storage

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import kz.flyingv.quicktodo.model.ToDoItem
import kz.flyingv.quicktodo.storage.converter.ToDoStatusConverter
import kz.flyingv.quicktodo.storage.dao.ToDoDao

@Database(entities = [ToDoItem::class], version = 1)
@TypeConverters(ToDoStatusConverter::class)
abstract class AppStorage: RoomDatabase() {
    abstract fun toDoDao(): ToDoDao
}