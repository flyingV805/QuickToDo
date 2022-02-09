package kz.flyingv.quicktodo.storage.converter

import androidx.room.TypeConverter
import kz.flyingv.quicktodo.model.ToDoStatus

class ToDoStatusConverter {

    @TypeConverter
    fun from(status: ToDoStatus): Int {
        return status.ordinal
    }

    @TypeConverter
    fun to(statusOrdinal: Int): ToDoStatus {
        return ToDoStatus.values()[statusOrdinal]
    }

}