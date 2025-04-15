package com.example.modul4

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.modul4.databinding.ActivityMainBinding
import com.example.modul4.databinding.ActivityMengirimBinding

const val text1 = " "
const val  text2 = " "
        const val text3 = " "
class Mengirim : AppCompatActivity() {
    private lateinit var binding: ActivityMengirimBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_mengirim)
        binding = ActivityMengirimBinding.inflate(layoutInflater)
        setContentView(binding.root)

//        binding.button2.setOnClickListener {
//            startActivity(
//                Intent(this, Menerima::class.java).apply
//                { putExtra(text1, binding.editTextText2.text.toString())
//                putExtra(text2,binding.editTextText3.text.toString())})
//        }


        val etName = findViewById<EditText>(R.id.editTextText2)
        val etEmail = findViewById<EditText>(R.id.editTextText3)
        val etPhone = findViewById<EditText>(R.id.editTextText4)
        val btnSend = findViewById<Button>(R.id.button2)

        btnSend.setOnClickListener {
            val name = etName.text.toString()
            val email = etEmail.text.toString()
            val phone = etPhone.text.toString()

            val intent = Intent(this, Menerima::class.java)
            intent.putExtra("name", name)
            intent.putExtra("email", email)
            intent.putExtra("phone", phone)
            startActivity(intent)




            ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
                val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
                v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
                insets
            }
        }
    }
}