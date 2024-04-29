package com.appnica.cursosexcel

import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.appnica.cursosexcel.databinding.ActivityMd3Binding

class Md3 : AppCompatActivity() {

    private lateinit var binding:ActivityMd3Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        binding = ActivityMd3Binding.inflate(layoutInflater)

        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        binding.lstMd3.adapter = AdapterMd3(this,Global.modulo3)

        binding.lstMd3.setOnItemClickListener { parent, view, position, objects ->

            Toast.makeText(this, "Seleccione ver video o descargar Data Base", Toast.LENGTH_SHORT).show()

            when (position) {
                0 -> {
                    binding.btnVideo.setOnClickListener {

                        IntentManager.navigateToUrl(this, "https://goo.gl/2npG6Y")
                    }

                    binding.btnDatos.setOnClickListener {

                        IntentManager.noData(this, "No 1 EJEMPLO BD")
                        IntentManager.navigateToUrl(
                            this,
                            "https://www.poli.edu.co/sites/default/files/basesdatos/BD_VENTAS.XLSX"
                        )
                    }
                }

                1 -> {
                    binding.btnVideo.setOnClickListener {

                        IntentManager.navigateToUrl(this, "https://goo.gl/SKGwGt")
                    }
                    binding.btnDatos.setOnClickListener {

                        IntentManager.noData(this, "No 2 EJEMPLO BD")
                        IntentManager.navigateToUrl(
                            this,
                            "https://www.poli.edu.co/sites/default/files/basesdatos/BD_VENTAS.XLSX"
                        )
                    }
                }

                2 -> {

                    binding.btnVideo.setOnClickListener {

                        IntentManager.navigateToUrl(this, "https://goo.gl/urrrP5")
                    }
                    binding.btnDatos.setOnClickListener {

                        IntentManager.noData(this, "No 3 EJEMPLO BD")
                        IntentManager.navigateToUrl(
                            this,
                            "https://www.poli.edu.co/sites/default/files/basesdatos/BD_VENTAS.XLSX"
                        )
                    }

                }

                3 -> {

                    binding.btnVideo.setOnClickListener {

                        IntentManager.navigateToUrl(this, "https://goo.gl/e5NfSt")
                    }
                    binding.btnDatos.setOnClickListener {

                        IntentManager.noData(this, "No 4 EJEMPLO BD")
                        IntentManager.navigateToUrl(
                            this,
                            "https://www.poli.edu.co/sites/default/files/basesdatos/BD_VENTAS.XLSX"
                        )
                    }
                }
            }
        }
    }
}