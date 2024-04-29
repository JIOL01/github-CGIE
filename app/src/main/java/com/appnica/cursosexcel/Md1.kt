package com.appnica.cursosexcel

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.appnica.cursosexcel.databinding.ActivityMd1Binding

class Md1 : AppCompatActivity() {

    private lateinit var binding:ActivityMd1Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        binding = ActivityMd1Binding.inflate(layoutInflater)

        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        binding.lstMd1.adapter = AdapterMd1(this, Global.contacto)

        binding.lstMd1.setOnItemClickListener{parent,view, position, objects ->

            Toast.makeText(this, "Seleccione ver video o descargar Data Base", Toast.LENGTH_SHORT).show()

            when (position) {
                0 -> {
                    binding.btnVideo.setOnClickListener{

                        IntentManager.navigateToUrl(this, "https://goo.gl/Rof9Yf")
                    }

                    binding.btnDatos.setOnClickListener{

                        IntentManager.noData(this, "No hay una base de datos de ejemplo: N/A")
                    }
                }

                1 -> {
                    binding.btnVideo.setOnClickListener{

                        IntentManager.navigateToUrl(this, "https://goo.gl/iUF2rL")
                    }
                    binding.btnDatos.setOnClickListener{

                        IntentManager.noData(this, "No 1 EJEMPLO BD")
                        IntentManager.navigateToUrl(this, "https://www.poli.edu.co/sites/default/files/basesdatos/No-1-EJEMPLO-BD.XLS")
                    }
                }

                2 -> {

                    binding.btnVideo.setOnClickListener{

                        IntentManager.navigateToUrl(this, "https://goo.gl/baXcJW")
                    }
                    binding.btnDatos.setOnClickListener{

                        IntentManager.noData(this, "EJEMPLO_BANCOS")
                        IntentManager.navigateToUrl(this, "https://www.poli.edu.co/sites/default/files/basesdatos/EJEMPLO_BANCOS.XLSX")
                    }

                }

                3 -> {

                    binding.btnVideo.setOnClickListener{

                        IntentManager.navigateToUrl(this, "https://goo.gl/hj8vYo")
                    }
                    binding.btnDatos.setOnClickListener{

                        IntentManager.noData(this, "ENo 3 NO BD")
                        IntentManager.navigateToUrl(this, "https://www.poli.edu.co/sites/default/files/basesdatos/No-3-NO-BD.XLS")
                    }
                }

            }

        }
    }
}