package com.example.modul4

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Menerima : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_menerima)

//        val pesana = intent.getStringExtra(text1)
//        val textViewq = findViewById<TextView>(R.id.textView2).apply { text =  pesana }
//
//        val pesanb= intent.getStringExtra(text2)
//        val textVieww = findViewById<TextView>(R.id.textView3).apply { text =  pesanb }
//
//        val pesanc = intent.getStringExtra(text3)
//        val textViewr = findViewById<TextView>(R.id.textView4).apply { text =  pesanc }


        // Ambil data dari Intent
        val name = intent.getStringExtra("name")
        val email = intent.getStringExtra("email")
        val phone = intent.getStringExtra("phone")

        // Tampilkan ke TextView
        val tvName = findViewById<TextView>(R.id.textView2)
        val tvEmail = findViewById<TextView>(R.id.textView3)
        val tvPhone = findViewById<TextView>(R.id.textView4)

        tvName.text = "Name: $name"
        tvEmail.text = "Email: $email"
        tvPhone.text = "Phone: $phone"

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}