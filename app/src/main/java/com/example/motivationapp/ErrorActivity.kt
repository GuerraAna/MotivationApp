package com.example.motivationapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.motivationapp.databinding.MotivapActivityErrorBinding

class ErrorActivity : AppCompatActivity() {

    private lateinit var binding: MotivapActivityErrorBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = MotivapActivityErrorBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}