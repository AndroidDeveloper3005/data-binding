package com.himel.androiddeveloper3005.git.databinding.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.himel.androiddeveloper3005.git.databinding.R
import com.himel.androiddeveloper3005.git.databinding.databinding.ActivityMainBinding
import com.himel.androiddeveloper3005.git.databinding.model.User

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val myUser = User("Himel","P",27,false)
        binding.user = myUser

        
    }
}