package kz.flyingv.quicktodo.activity.main.viewmodel

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

class ToDoViewModel: ViewModel() {

    private val _currentToDos = MutableStateFlow("")
    val currentToDos: StateFlow<String> = _currentToDos.asStateFlow()

}