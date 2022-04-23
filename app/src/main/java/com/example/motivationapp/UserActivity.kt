package com.example.motivationapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.motivationapp.databinding.MotivapActivityUserBinding

class UserActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var binding: MotivapActivityUserBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = MotivapActivityUserBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnSave.setOnClickListener(this)
    }

    override fun onClick(view: View) {
        if (view.id == R.id.btn_save_message) {
            val intent = ""
        }
    }
}