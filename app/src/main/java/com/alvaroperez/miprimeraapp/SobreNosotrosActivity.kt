package com.alvaroperez.miprimeraapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.alvaroperez.miprimeraapp.databinding.ActivitySobreNosotrosBinding

class SobreNosotrosActivity : AppCompatActivity() {
    // Definición del binding para acceder a los elementos del layout
    private lateinit var binding: ActivitySobreNosotrosBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // REQUISITO: Carga del layout mediante inflate [cite: 99]
        binding = ActivitySobreNosotrosBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}