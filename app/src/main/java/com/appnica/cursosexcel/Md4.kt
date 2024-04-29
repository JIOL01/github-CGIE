package com.appnica.cursosexcel

import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.appnica.cursosexcel.databinding.ActivityMd4Binding

class Md4 : AppCompatActivity() {

    private lateinit var binding: ActivityMd4Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        binding = ActivityMd4Binding.inflate(layoutInflater)

        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        binding.lstMd4.adapter = AdapterMd4(this, Global.modulo4)

        binding.lstMd4.setOnItemClickListener { parent, view, position, objects ->

            Toast.makeText(this, "Seleccione ver video o descargar Data Base", Toast.LENGTH_SHORT).show()

            when (position) {
                0 -> {
                    binding.btnVideo.setOnClickListener {

                        IntentManager.navigateToUrl(this, "https://goo.gl/LPM51S")
                    }

                    binding.btnDatos.setOnClickListener {

                        IntentManager.noData(this, "TABLA DINAMICA BD PERSONAL")
                        IntentManager.navigateToUrl(
                            this,
                            "http://comunicaciones.poligran.edu.co/documentacion/No4-5-TABLA-DINAMICA-BD-PERSONAL.xlsm"
                        )
                    }
                }

                1 -> {
                    binding.btnVideo.setOnClickListener {

                        IntentManager.navigateToUrl(this, "https://goo.gl/fxXnqo")
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

                        IntentManager.navigateToUrl(this, "https://goo.gl/1ybnkZ")
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

                        IntentManager.navigateToUrl(this, "https://goo.gl/HVRNvA")
                    }
                    binding.btnDatos.setOnClickListener {

                        IntentManager.noData(this, "No 4 EJEMPLO BD")
                        IntentManager.navigateToUrl(
                            this,
                            "https://www.poli.edu.co/sites/default/files/basesdatos/BD_VENTAS.XLSX"
                        )
                    }
                }

                4 -> {

                    binding.btnVideo.setOnClickListener {

                        IntentManager.navigateToUrl(this, "https://goo.gl/wZB4VD")
                    }
                    binding.btnDatos.setOnClickListener {

                        IntentManager.noData(this, "No 5 EJEMPLO BD")
                        IntentManager.navigateToUrl(
                            this,
                            "https://www.poli.edu.co/sites/default/files/basesdatos/BD_VENTAS.XLSX"
                        )
                    }
                }

                5 -> {

                    binding.btnVideo.setOnClickListener {

                        IntentManager.navigateToUrl(this, "https://goo.gl/pj8wua")
                    }
                    binding.btnDatos.setOnClickListener {

                        IntentManager.noData(this, "No se encuentran archivos")
                    }
                }

                6 -> {

                    binding.btnVideo.setOnClickListener {

                        IntentManager.navigateToUrl(this, "https://goo.gl/FtMcTZ")
                    }
                    binding.btnDatos.setOnClickListener {

                        IntentManager.noData(this, "No 7 EJEMPLO BD")
                        IntentManager.navigateToUrl(
                            this,
                            "https://www.poli.edu.co/sites/default/files/basesdatos/BD_VENTAS.XLSX"
                        )
                    }
                }

                7 -> {

                    binding.btnVideo.setOnClickListener {

                        IntentManager.navigateToUrl(this, "https://goo.gl/XxTo2b")
                    }
                    binding.btnDatos.setOnClickListener {

                        IntentManager.noData(this, "No se encuentran archivos")

                    }
                }

                8 -> {

                    binding.btnVideo.setOnClickListener {

                        IntentManager.navigateToUrl(this, "https://goo.gl/XnXS9W")
                    }
                    binding.btnDatos.setOnClickListener {

                        IntentManager.noData(this, "Consulta Web")
                        IntentManager.navigateToUrl(
                            this,
                            "https://www.poli.edu.co/sites/default/files/basesdatos/CONSULTA_WEB.XLSX"
                        )
                    }
                }

                9 -> {

                    binding.btnVideo.setOnClickListener {

                        IntentManager.navigateToUrl(this, "https://goo.gl/NhNsT3")
                    }
                    binding.btnDatos.setOnClickListener {

                        IntentManager.noData(this, "TABLA DINAMICA BD PERSONAL")
                        IntentManager.navigateToUrl(
                            this,
                            "http://comunicaciones.poligran.edu.co/documentacion/No4-5-TABLA-DINAMICA-BD-PERSONAL.xlsm"
                        )
                    }
                }
            }
        }
    }
}