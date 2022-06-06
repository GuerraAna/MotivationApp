package com.example.motivationapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.motivationapp.activity.HomeActivity
import com.example.motivationapp.databinding.MotivapActivityUserBinding

class UserActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var binding: MotivapActivityUserBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = MotivapActivityUserBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnSave.setOnClickListener(this)

        supportActionBar?.hide()
    }

    override fun onClick(view: View) {
        if(view.id == R.id.btn_save_message) {
            handleSave()
        } else if(view.id == R.id.btn_back) {
            goToBack()
        }
    }

    private fun goToBack() {
        startActivity(Intent(this, HomeActivity::class.java))
        finish()
    }

    private fun handleSave() {
        val name = binding.tvText.text.toString()

        if (name != EMPTY_STRING){
            startActivity(Intent(this, HomeActivity::class.java))
            finish()
        } else {
            Intent(this, ErrorActivity::class.java)
        }
    }

    companion object {
        val EMPTY_STRING = ""
    }
}