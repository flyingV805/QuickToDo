package kz.flyingv.quicktodo.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.AsyncListDiffer
import androidx.recyclerview.widget.RecyclerView
import kz.flyingv.quicktodo.R
import kz.flyingv.quicktodo.adapter.diffutil.ToDoItemDiffCallback
import kz.flyingv.quicktodo.adapter.viewholder.ToDoViewHolder
import kz.flyingv.quicktodo.model.ToDoItem

class ToDoRecyclerAdapter: RecyclerView.Adapter<ToDoViewHolder>() {

    private val asyncDiffer = AsyncListDiffer(this, ToDoItemDiffCallback())

    fun submitList(list: List<ToDoItem>) {
        asyncDiffer.submitList(list)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ToDoViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.list_item_todo, parent, false)
        return ToDoViewHolder(view)
    }

    override fun onBindViewHolder(holder: ToDoViewHolder, position: Int) {
        val toDo = asyncDiffer.currentList[position]
        holder.bind(toDo)
    }

    override fun getItemCount(): Int {
        return asyncDiffer.currentList.size
    }

}