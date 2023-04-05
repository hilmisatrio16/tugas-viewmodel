package com.example.latihanviewmodel.film

import com.example.latihanviewmodel.R

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class FilmAdapter(private var listFilm : ArrayList<DataFilm>) : RecyclerView.Adapter<FilmAdapter.ViewHolder>() {
    class ViewHolder(itemView : View): RecyclerView.ViewHolder(itemView) {
        var judul = itemView.findViewById<TextView>(R.id.tvJudulFilm)
        var tanggal = itemView.findViewById<TextView>(R.id.tvTanggal)
        var genre = itemView.findViewById<TextView>(R.id.tvGenre)
        var imgFilm = itemView.findViewById<ImageView>(R.id.ivImgFilm)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FilmAdapter.ViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.item_list_film, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listFilm.size
    }

    override fun onBindViewHolder(holder: FilmAdapter.ViewHolder, position: Int) {
        var data = listFilm[position]
        holder.judul.text = data.judul
        holder.tanggal.text = data.tanggal
        holder.genre.text = data.genre
        holder.imgFilm.setImageResource(data.imgFilm)
    }

    fun setListFilm(listFilm: ArrayList<DataFilm>){
        this.listFilm = listFilm
    }
}