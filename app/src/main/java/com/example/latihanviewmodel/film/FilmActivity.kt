package com.example.latihanviewmodel.film

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.latihanviewmodel.R
import com.example.latihanviewmodel.StudentAdapter
import com.example.latihanviewmodel.databinding.ActivityFilmBinding

class FilmActivity : AppCompatActivity() {

    private lateinit var binding: ActivityFilmBinding
    private lateinit var filmAdapter: FilmAdapter
    private lateinit var filmViewModel: FilmViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFilmBinding.inflate(layoutInflater)
        setContentView(binding.root)


        initStudent()

        filmViewModel = ViewModelProvider(this).get(FilmViewModel::class.java)

        filmViewModel.getListFilm()

        filmViewModel.filmList.observe(this, Observer {
            filmAdapter.setListFilm(it as ArrayList<DataFilm>)
        })
    }

    fun initStudent(){
        filmAdapter = FilmAdapter(ArrayList())
        binding.rvFilm.layoutManager = GridLayoutManager(this, 2)
        binding.rvFilm.adapter = filmAdapter
    }
}