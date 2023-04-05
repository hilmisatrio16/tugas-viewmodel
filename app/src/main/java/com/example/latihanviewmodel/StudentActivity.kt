package com.example.latihanviewmodel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.latihanviewmodel.databinding.ActivityStudentBinding

class StudentActivity : AppCompatActivity() {

    private lateinit var binding: ActivityStudentBinding
    lateinit var studentAdapter: StudentAdapter
    lateinit var studentVM : StudentViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityStudentBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initStudent()

        studentVM = ViewModelProvider(this).get(StudentViewModel::class.java)

        studentVM.getListStudent()
        studentVM.studentList.observe(this, Observer {
            studentAdapter.setStudentData(it as ArrayList<DataStudent>)
        })


    }

    fun initStudent(){
        studentAdapter = StudentAdapter(ArrayList())
        binding.rvStudent.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        binding.rvStudent.adapter = studentAdapter
    }
}