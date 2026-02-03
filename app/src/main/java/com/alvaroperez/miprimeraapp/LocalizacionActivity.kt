package com.alvaroperez.miprimeraapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.alvaroperez.miprimeraapp.databinding.ActivityLocalizacionBinding

class LocalizacionActivity : AppCompatActivity() {
    // Definición del binding para la actividad de localización
    private lateinit var binding: ActivityLocalizacionBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // REQUISITO: Carga del layout mediante inflate [cite: 102]
        binding = ActivityLocalizacionBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}