package com.example.motivationapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.motivationapp.databinding.MotivapActivityUserBinding

class UserActivity : AppCompatActivity() {

    private lateinit var binding: MotivapActivityUserBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = MotivapActivityUserBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}