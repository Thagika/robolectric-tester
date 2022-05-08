package com.thagika.robolectrictester

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.thagika.robolectrictester.databinding.ActivityMainBinding
import com.thagika.robolectrictester.databinding.FragmentFirstBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonFragment.setOnClickListener() {
            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)
            }

    }



}