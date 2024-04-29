package com.appnica.cursosexcel

import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.appnica.cursosexcel.databinding.ActivityMd1Binding
import com.appnica.cursosexcel.databinding.ActivityMd2Binding

class Md2 : AppCompatActivity() {

    private lateinit var binding: ActivityMd2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        binding = ActivityMd2Binding.inflate(layoutInflater)

        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        binding.lstMd2.adapter = AdapterMd2(this, Global.contentMd2)

        binding.lstMd2.setOnItemClickListener{parent,view, position, objects ->

            Toast.makeText(this, "Seleccione ver video o descargar Data Base", Toast.LENGTH_SHORT).show()

            when (position) {
                0 -> {
                    binding.btnVideo.setOnClickListener{

                        IntentManager.navigateToUrl(this, "https://goo.gl/5kEcGd")
                    }

                    binding.btnDatos.setOnClickListener{

                        IntentManager.noData(this, "BD_VENTAS")
                        IntentManager.navigateToUrl(this, "https://www.poli.edu.co/sites/default/files/basesdatos/BD_VENTAS.XLSX")
                    }
                }

                1 -> {
                    binding.btnVideo.setOnClickListener{

                        IntentManager.navigateToUrl(this, "https://goo.gl/eGZ5j9")
                    }
                    binding.btnDatos.setOnClickListener{

                        IntentManager.noData(this, "BD_VENTAS")
                        IntentManager.navigateToUrl(this, "https://www.poli.edu.co/sites/default/files/basesdatos/BD_VENTAS.XLSX")
                    }
                }

                2 -> {

                    binding.btnVideo.setOnClickListener{

                        IntentManager.navigateToUrl(this, "https://goo.gl/cq9NGR")
                    }
                    binding.btnDatos.setOnClickListener{

                        IntentManager.noData(this, "BD_VENTAS")
                        IntentManager.navigateToUrl(this, "https://www.poli.edu.co/sites/default/files/basesdatos/BD_VENTAS.XLSX")
                    }

                }

                3 -> {

                    binding.btnVideo.setOnClickListener{

                        IntentManager.navigateToUrl(this, "https://goo.gl/Zcm4r6")
                    }
                    binding.btnDatos.setOnClickListener{

                        IntentManager.noData(this, "BD_VENTAS")
                        IntentManager.navigateToUrl(this, "https://www.poli.edu.co/sites/default/files/basesdatos/BD_VENTAS.XLSX")
                    }
                }

                4 -> {

                    binding.btnVideo.setOnClickListener{

                        IntentManager.navigateToUrl(this, "https://goo.gl/Zcm4r6")
                    }
                    binding.btnDatos.setOnClickListener{

                        IntentManager.noData(this, "BD_VENTAS")
                        IntentManager.navigateToUrl(this, "https://www.poli.edu.co/sites/default/files/basesdatos/BD_VENTAS.XLSX")
                    }
                }

                5 -> {

                    binding.btnVideo.setOnClickListener{

                        IntentManager.navigateToUrl(this, "https://goo.gl/JyMCeE")
                    }
                    binding.btnDatos.setOnClickListener{

                        IntentManager.noData(this, "BD_VENTAS")
                        IntentManager.navigateToUrl(this, "https://www.poli.edu.co/sites/default/files/basesdatos/BD_VENTAS.XLSX")
                    }
                }

            }

        }
    }
}