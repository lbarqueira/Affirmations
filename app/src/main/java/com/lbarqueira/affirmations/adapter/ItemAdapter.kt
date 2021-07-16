package com.lbarqueira.affirmations.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.lbarqueira.affirmations.R
import com.lbarqueira.affirmations.model.Affirmation

// The ItemAdapter needs information on how to resolve the string resources.
// This, and other information about the app, is stored in a Context object instance
// that you can pass into an ItemAdapter instance.

class ItemAdapter(
    private val context: Context,
    private val dataset: List<Affirmation>
) : RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {

    // Defining a class inside another class is called creating a nested class
    // A ViewHolder represents a single list item view in RecyclerView,
    // and can be reused when possible.
    class ItemViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {
        val textView: TextView = view.findViewById(R.id.item_title)
    }

    // The onCreateViewHolder()method is called by the layout manager to create new view holders
    // for the RecyclerView (when there are no existing view holders that can be reused).
    // Remember that a view holder represents a single list item view.
    /**
     * Create new views (invoked by the layout manager)
     */
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_item, parent, false)
        return ItemViewHolder(adapterLayout)
    }

    /**
     * Replace the contents of a view (invoked by the layout manager)
     */
    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = dataset[position]
        holder.textView.text = context.resources.getString(item.stringResourceId)
    }

    /**
     * Return the size of your dataset (invoked by the layout manager)
     */
    override fun getItemCount(): Int {
        return dataset.size
    }
}