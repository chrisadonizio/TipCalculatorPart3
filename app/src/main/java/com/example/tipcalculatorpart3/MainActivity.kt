package com.example.tipcalculatorpart3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.tipcalculatorpart3.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var  binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val rootView = binding.root
        setContentView(rootView)
    }
}