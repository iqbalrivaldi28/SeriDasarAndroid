package com.example.seridasarandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import com.example.seridasarandroid.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Inisialisasi Buttonya di Sembunyikan
        binding.btnHapus.visibility = View.GONE

        // Button Hello
        binding.btnSatu.setOnClickListener {
            val name = binding.edSatu.text.toString()
            binding.tvWelcome.setText("Hello $name")

            // Kita Ubah Dia jadi Terlihat
            binding.btnHapus.visibility = View.VISIBLE

            Log.d("msg", "Hello $name")
        }

        // Button Hapus
        binding.btnHapus.setOnClickListener {
            binding.tvWelcome.text = ""
            binding.edSatu.text.clear()
            binding.btnHapus.visibility = View.GONE
        }

    }
}