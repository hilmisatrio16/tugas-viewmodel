package com.example.latihanviewmodel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.example.latihanviewmodel.databinding.ActivityViewModelBinding

class ViewModelActivity : AppCompatActivity() {

    lateinit var binding: ActivityViewModelBinding
    lateinit var viewModel: HitungLuasViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityViewModelBinding.inflate(layoutInflater)
        setContentView(binding.root)

        viewModel = ViewModelProvider(this).get(HitungLuasViewModel::class.java)

        binding.tvHasil.text = viewModel.hasil.toString()
        binding.btnHasil.setOnClickListener {
            viewModel.HitungLuas(binding.tfPanjang.text.toString().toInt(),
                binding.tfLebar.text.toString().toInt(),
                binding.tfTinggi.text.toString().toInt())

            binding.tvHasil.text = viewModel.hasil.toString()
        }

    }
}