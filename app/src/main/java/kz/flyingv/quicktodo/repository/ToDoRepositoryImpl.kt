package kz.flyingv.quicktodo.repository

import kotlinx.coroutines.flow.Flow
import kz.flyingv.quicktodo.model.ToDoItem
import kz.flyingv.quicktodo.storage.AppStorage
import org.koin.core.component.KoinComponent
import org.koin.core.component.inject

class ToDoRepositoryImpl: ToDoRepository, KoinComponent {

    private val database: AppStorage by inject()

    override fun addTestToDo() {
        val randomItem = ToDoItem(
            name = System.currentTimeMillis().toString(),
            makeUntil = System.currentTimeMillis()
        )
        database.toDoDao().insert(randomItem)
    }

    override fun currentToDo(): Flow<List<ToDoItem>> {
        return database.toDoDao().getAllToDo()
    }
}