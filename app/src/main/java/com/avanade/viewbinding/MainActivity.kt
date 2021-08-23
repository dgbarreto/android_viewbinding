package com.avanade.viewbinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.avanade.viewbinding.databinding.ActivityMainBinding
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_main)

        //Antes
        val oldButton: Button = findViewById<Button>(R.id.myButton)
        val myText: TextView = findViewById<TextView>(R.id.myTextView)

        //Agora
        val button: Button = binding.myButton
        val text: TextView = binding.myTextView

        binding.myTextView.text = "new text"
    }


}