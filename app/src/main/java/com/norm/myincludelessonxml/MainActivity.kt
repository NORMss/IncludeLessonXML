package com.norm.myincludelessonxml

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.core.view.marginEnd
import androidx.core.view.marginStart
import com.norm.myincludelessonxml.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.include1.textView.text = "${binding.include2.textView.text} 1"
        binding.include2.textView.text = "${binding.include2.textView.text} 2"
        binding.include3.textView.text = "${binding.include3.textView.text} 3"

        binding.include1.button1.setOnClickListener {
            Toast.makeText(this, "include1 button1", Toast.LENGTH_SHORT).show()
        }
        binding.include2.button2.setOnClickListener {
            Toast.makeText(this, "include2 button2", Toast.LENGTH_SHORT).show()
        }
        binding.include3.button3.setOnClickListener {
            Toast.makeText(this, "include3 button3", Toast.LENGTH_SHORT).show()
        }
        binding.include1.button3.setOnClickListener {
            Toast.makeText(this, "include1 button3", Toast.LENGTH_SHORT).show()
        }
        binding.include3.button1.setOnClickListener {
            Toast.makeText(this, "include3 button1", Toast.LENGTH_SHORT).show()
        }

    }
}