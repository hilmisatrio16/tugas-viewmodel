package com.example.latihanviewmodel

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class StudentAdapter(var listStudent : ArrayList<DataStudent>) : RecyclerView.Adapter<StudentAdapter.ViewHolder>() {
    class ViewHolder(itemView : View): RecyclerView.ViewHolder(itemView) {
        var name = itemView.findViewById<TextView>(R.id.tvNamaStudent)
        var nim = itemView.findViewById<TextView>(R.id.tvNIM)
        var fakultas = itemView.findViewById<TextView>(R.id.tvFakultas)
        var img = itemView.findViewById<ImageView>(R.id.studentImg)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StudentAdapter.ViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.item_list_student, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
       return listStudent.size
    }

    override fun onBindViewHolder(holder: StudentAdapter.ViewHolder, position: Int) {
        var data = listStudent[position]
        holder.name.text = data.nama
        holder.nim.text = data.nim
        holder.fakultas.text = data.fakultas
//        val iconDrawable = holder.itemView.context.resources.getDrawable(R.drawable.ic_star)
//        holder.textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, null, null, null)
        holder.img.setImageResource(data.imgStudent)
    }

    fun setStudentData(listStudent: ArrayList<DataStudent>){
        this.listStudent = listStudent
    }
}