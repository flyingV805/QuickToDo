package kz.flyingv.quicktodo.repository

import kotlinx.coroutines.flow.Flow
import kz.flyingv.quicktodo.model.ToDoItem

interface ToDoRepository {

    fun addTestToDo()
    fun currentToDo(): Flow<List<ToDoItem>>

}