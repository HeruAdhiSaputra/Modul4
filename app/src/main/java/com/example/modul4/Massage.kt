package com.example.modul4

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.modul4.databinding.ActivityMainBinding
import com.example.modul4.databinding.ActivityMassageBinding

class Massage : AppCompatActivity() {
    private lateinit var binding: ActivityMassageBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_massage)

        binding = ActivityMassageBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val pesan = intent.getStringExtra(extra_massage)
        val textView = findViewById<TextView>(R.id.textView).apply { text = "Pesan :" + pesan }

        binding.button3.setOnClickListener{
            val intent = Intent (this,Mengirim::class.java)
            startActivity(intent)
        }


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}