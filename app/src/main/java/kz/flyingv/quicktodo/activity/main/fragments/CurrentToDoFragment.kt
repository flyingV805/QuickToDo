package kz.flyingv.quicktodo.activity.main.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import kz.flyingv.quicktodo.R
import kz.flyingv.quicktodo.adapter.ToDoRecyclerAdapter
import kz.flyingv.quicktodo.databinding.FragmentCurrentTodoBinding

class CurrentToDoFragment : Fragment() {

    private lateinit var binding: FragmentCurrentTodoBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentCurrentTodoBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.todoList.setHasFixedSize(true)
        binding.todoList.layoutManager = LinearLayoutManager(requireContext())
        binding.todoList.adapter = ToDoRecyclerAdapter()
    }

    companion object {

        @JvmStatic
        fun newInstance() = CurrentToDoFragment()

    }

}