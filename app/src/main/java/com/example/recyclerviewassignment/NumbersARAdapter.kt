package com.example.recyclerviewassignment

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import java.math.BigInteger

class NumbersARAdapter(var numbersList:MutableList<BigInteger>): RecyclerView.Adapter<NumbersViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NumbersViewHolder {

        val itemView=
            LayoutInflater.from(parent.context).inflate(R.layout.number_list_item,parent,false)
        return NumbersViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: NumbersViewHolder, position: Int) {
        holder.tvnumbers.text=numbersList.get(position).toString()
    }

    override fun getItemCount(): Int {
        return numbersList.size
    }
}
class NumbersViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
    val tvnumbers = itemView.findViewById<TextView>(R.id.tvnumbers)
}
