package com.example.latihanviewmodel.film

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.latihanviewmodel.R

class FilmViewModel : ViewModel() {

    var list = arrayListOf(
        DataFilm("Buya Hamka", "20 April 2023", "Drama/Biografi", R.drawable.img_buya_hamka),
        DataFilm("Black Adam", "19 Oktober 2022", "Laga/Petualangan", R.drawable.img_black_adam),
        DataFilm("KKN di Desa Penari", "30 April 2022", "Horor/Drama", R.drawable.img_kkn_desa_penari),
        DataFilm("Pele Birth Of A Legend", "6 Mei 2016", "Drama/Olahraga", R.drawable.img_pele_kedua),
        DataFilm("Puss in Boots: The Last Wish", "28 Desember 2022","Petualangan/Komedi", R.drawable.img_pussin_boots),
        DataFilm("Shazam Fury of the Gods", "15 Maret 2023", "Laga/Pertarungan", R.drawable.img_shazam),
        DataFilm("Black Panther: Wakanda Forever", "9 November 2022", "Laga/Pertarungan", R.drawable.img_wakanda)
    )

    var filmList : MutableLiveData<List<DataFilm>> = MutableLiveData()

    fun getListFilm(){
        filmList.value = list
    }
}