package com.geeks.home_work_5_3_ai

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.geeks.home_work_5_3_ai.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding:ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportFragmentManager.beginTransaction().add(R.id.container, FirstFragment()).commit()

    }
}