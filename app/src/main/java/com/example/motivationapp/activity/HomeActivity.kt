package com.example.motivationapp.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.motivationapp.ErrorActivity
import com.example.motivationapp.R
import com.example.motivationapp.UserActivity
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
            handleSave()
        }
    }

    private fun handleSave() {
        val name = binding.tvText.text.toString()
        if (name != EMPTY_STRING) {
            handleSaveSuccess()
        } else {
            handleSaveError()
        }
    }

    private fun handleSaveSuccess() {
        val successIntent = Intent(this, UserActivity::class.java)
        startActivity(successIntent)
    }

    private fun handleSaveError() {
        val errorIntent = Intent(this, ErrorActivity::class.java)
        startActivity(errorIntent)
        finish()
    }

    companion object {
        const val EMPTY_STRING = ""
    }

}