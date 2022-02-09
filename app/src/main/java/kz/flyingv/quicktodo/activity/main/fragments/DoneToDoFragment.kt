package kz.flyingv.quicktodo.activity.main.fragments

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.coroutines.flow.onEach
import kz.flyingv.quicktodo.activity.main.viewmodel.ToDoViewModel
import kz.flyingv.quicktodo.adapter.ToDoRecyclerAdapter
import kz.flyingv.quicktodo.databinding.FragmentTodoListBinding
import kz.flyingv.quicktodo.utils.launchWhenStarted


class DoneToDoFragment : Fragment() {

    private lateinit var viewModel: ToDoViewModel
    private lateinit var binding: FragmentTodoListBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel = ViewModelProvider(this)[ToDoViewModel::class.java]
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentTodoListBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.todoList.setHasFixedSize(true)
        binding.todoList.layoutManager = LinearLayoutManager(requireContext())
        val todoAdapter = ToDoRecyclerAdapter()
        binding.todoList.adapter = todoAdapter

        viewModel.completedToDos.onEach {
            Log.d("list update", it.size.toString())
            todoAdapter.submitList(it)
        }.launchWhenStarted(lifecycleScope)

    }

}