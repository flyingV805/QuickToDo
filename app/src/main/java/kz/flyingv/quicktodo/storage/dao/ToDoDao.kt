package kz.flyingv.quicktodo.storage.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import kotlinx.coroutines.flow.Flow
import kz.flyingv.quicktodo.model.ToDoItem

@Dao
interface ToDoDao {

    //For UI
    @Query("SELECT * FROM ToDoItem")
    fun getAllToDo(): Flow<List<ToDoItem>>

    //Adding
    @Insert
    fun insert(item: ToDoItem): Long

    //For firebase sync
    @Insert
    fun insertAll(items: List<ToDoItem>)

    //For status change
    @Update
    fun update(updateItem: ToDoItem)

}