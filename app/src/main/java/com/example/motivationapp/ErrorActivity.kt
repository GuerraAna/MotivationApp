package com.example.motivationapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.motivationapp.activity.HomeActivity
import com.example.motivationapp.databinding.MotivapActivityErrorBinding

class ErrorActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var binding: MotivapActivityErrorBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = MotivapActivityErrorBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.hide()

        closeClick()
    }

    override fun onClick(view: View) {
        if (view.id == R.id.btn_close) {
            closeClick()
        }
    }

    private fun closeClick() {
        startActivity(Intent(this, HomeActivity::class.java))
    }

}