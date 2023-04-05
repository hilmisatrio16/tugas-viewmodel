package com.example.latihanviewmodel

import androidx.lifecycle.ViewModel

class HitungLuasViewModel : ViewModel() {

    var hasil = 0

    fun HitungLuas(panjang : Int, lebar : Int, tinggi : Int){
        hasil = panjang * lebar * tinggi
    }
}