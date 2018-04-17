package com.karim.listmaker

import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.TextView

class ListSelectionViewHolder(itemView: View?): RecyclerView.ViewHolder(itemView) {

    val listPosition = itemView?.findViewById(R.id.item_number) as TextView
    val listTitle = itemView?.findViewById(R.id.item_string) as TextView

}