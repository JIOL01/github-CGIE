package com.appnica.cursosexcel

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.appnica.cursosexcel.databinding.ActivityModulosBinding

class Modulos : AppCompatActivity() {

    private lateinit var binding: ActivityModulosBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        binding = ActivityModulosBinding.inflate(layoutInflater)

        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        binding.btn1.setOnClickListener{
            val openPage = Intent(this, Md1::class.java)
            startActivity(openPage)
        }

        binding.btn2.setOnClickListener{
            val openPage = Intent(this, Md2::class.java)
            startActivity(openPage)
        }

        binding.btn3.setOnClickListener{
            val openPage = Intent(this, Md3::class.java)
            startActivity(openPage)
        }

        binding.btn4.setOnClickListener{
            val openPage = Intent(this, Md4::class.java)
            startActivity(openPage)
        }
    }
}