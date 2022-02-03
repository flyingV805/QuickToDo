package kz.flyingv.quicktodo.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kz.flyingv.quicktodo.R
import kz.flyingv.quicktodo.adapter.viewholder.ToDoViewHolder

class ToDoRecyclerAdapter: RecyclerView.Adapter<ToDoViewHolder>() {

    val testList = arrayListOf<Int>(1, 2, 3, 4, 5, 6)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ToDoViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.list_item_todo, parent, false)
        return ToDoViewHolder(view)
    }

    override fun onBindViewHolder(holder: ToDoViewHolder, position: Int) {

    }

    override fun getItemCount(): Int {
        return testList.size
    }
}