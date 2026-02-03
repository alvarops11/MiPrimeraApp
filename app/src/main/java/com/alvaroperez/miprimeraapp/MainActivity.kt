package com.alvaroperez.miprimeraapp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.alvaroperez.miprimeraapp.databinding.ActivityMainBinding // Generado automáticamente

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding // Requisito: usar inflate [cite: 79]

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnLogin.setOnClickListener {
            val usuario = binding.etUsuario.text.toString()
            val intent = Intent(this, InicioActivity::class.java)
            intent.putExtra("USER_NAME", usuario) // Paso de valor [cite: 78]
            startActivity(intent)
        }
    }
}