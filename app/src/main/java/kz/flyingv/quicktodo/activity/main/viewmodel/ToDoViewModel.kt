package kz.flyingv.quicktodo.activity.main.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.launch
import kz.flyingv.quicktodo.model.ToDoItem
import kz.flyingv.quicktodo.repository.ToDoRepository
import org.koin.core.component.KoinComponent
import org.koin.core.component.inject

class ToDoViewModel: ViewModel(), KoinComponent {

    private val toDoRepository: ToDoRepository by inject()

    private val _currentToDos = toDoRepository.currentToDo()
    val currentToDos: StateFlow<List<ToDoItem>> = _currentToDos.stateIn(viewModelScope, SharingStarted.Lazily, emptyList())

    fun addRandomTodo(){
        viewModelScope.launch(Dispatchers.IO){
            toDoRepository.addTestToDo()
        }
    }

}