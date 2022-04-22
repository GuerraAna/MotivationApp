package com.example.motivationapp.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.motivationapp.R
import com.example.motivationapp.databinding.MotivapActivityHomeBinding

class HomeActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var binding: MotivapActivityHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = MotivapActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.hide()
        binding.btnSaveMessage.setOnClickListener(this)
    }

    override fun onClick(view: View) {
        if (view.id == R.id.btn_save_message) {
            val intent = ""
        }
    }

}