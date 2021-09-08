package com.himel.androiddeveloper3005.git.databinding.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.LayoutInflater
import androidx.core.widget.addTextChangedListener
import androidx.lifecycle.ViewModelProvider
import com.himel.androiddeveloper3005.git.databinding.R
import com.himel.androiddeveloper3005.git.databinding.databinding.ActivityMainBinding
import com.himel.androiddeveloper3005.git.databinding.model.User
import com.himel.androiddeveloper3005.git.databinding.modelview.MyViewModel

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var myViewModel: MyViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
       // val myUser = User("Himel","P",27,false)
        myViewModel = ViewModelProvider(this).get(MyViewModel::class.java)

        //set observer in xml file

       /* myViewModel.message.observe(this,{
            binding.textView.text = it

        })*/
        binding.viewModel = myViewModel
        binding.lifecycleOwner = this

        binding.editTextTextPersonName.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
            }

            override fun onTextChanged(char : CharSequence?, start: Int, before: Int, count: Int) {
                myViewModel.setMessage(char.toString())
            }

            override fun afterTextChanged(s: Editable?) {
            }

        })

        
    }
}