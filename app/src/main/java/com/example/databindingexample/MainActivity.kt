package com.example.databindingexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.databindingexample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var  binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.btnSubmit.setOnClickListener {
            displayName()
        }


    }
        private fun displayName() {

            binding.mainTextView.text = binding.getNameEt.text
            binding.apply {
                mainTextView.text
                btnSubmit
            }


        }

    }
