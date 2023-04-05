package com.example.latihanviewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class StudentViewModel : ViewModel() {

    val list = arrayListOf(
        DataStudent("Bunga", "170202020", "Akutansi", R.drawable.ic_womam),
        DataStudent("Budi", "14239023", "Teknik Informatika", R.drawable.ic_man),
        DataStudent("Rani", "1602939393", "Manajemen Bisnis", R.drawable.ic_womam),
        DataStudent("Candra", "140239023", "Teknik Informatika", R.drawable.ic_man),
        DataStudent("Sanjaya", "1792348239", "Kedokteran", R.drawable.ic_man),
        DataStudent("Jordy", "1432373833", "Teknik Sipil", R.drawable.ic_man),
        DataStudent("Bunga", "170202020", "Akutansi", R.drawable.ic_womam),
        DataStudent("Mawar", "123020202", "Kedokteran", R.drawable.ic_womam)

    )

    val studentList : MutableLiveData<List<DataStudent>> = MutableLiveData()

    fun getListStudent(){
        var student = list
        studentList.value = student
        //studentList.value = list
    }
}