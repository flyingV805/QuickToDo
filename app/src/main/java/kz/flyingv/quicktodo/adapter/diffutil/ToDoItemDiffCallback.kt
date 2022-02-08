package kz.flyingv.quicktodo.adapter.diffutil

import androidx.recyclerview.widget.DiffUtil
import kz.flyingv.quicktodo.model.ToDoItem

class ToDoItemDiffCallback: DiffUtil.ItemCallback<ToDoItem>() {

    override fun areItemsTheSame(oldItem: ToDoItem, newItem: ToDoItem): Boolean {
        return oldItem.id == newItem.id
    }

    override fun areContentsTheSame(oldItem: ToDoItem, newItem: ToDoItem): Boolean {
        return oldItem == newItem
    }

}