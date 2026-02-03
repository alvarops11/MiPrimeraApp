package com.alvaroperez.miprimeraapp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.alvaroperez.miprimeraapp.databinding.ActivityInicioBinding

class InicioActivity : AppCompatActivity() {
    // Uso de View Binding para cumplir el requisito de no usar R.layout directamente
    private lateinit var binding: ActivityInicioBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // REQUISITO: Cargar el layout usando inflate
        binding = ActivityInicioBinding.inflate(layoutInflater)
        setContentView(binding.root)
        // Ocultar la barra morada para que no tape los botones
        supportActionBar?.hide()

        // REQUISITO: Recuperar el nombre de usuario pasado desde la Activity 1 (Login)
        val usuarioRecibido = intent.getStringExtra("USER_NAME")
        binding.tvBienvenida.text = "Bienvenido, $usuarioRecibido"

        // Configuración de navegación entre pantallas mediante botones e Intent
        binding.btnContacto.setOnClickListener {
            val intent = Intent(this, ContactoActivity::class.java)
            startActivity(intent)
        }

        binding.btnSobreNosotros.setOnClickListener {
            val intent = Intent(this, SobreNosotrosActivity::class.java)
            startActivity(intent)
        }

        binding.btnLocalizacion.setOnClickListener {
            val intent = Intent(this, LocalizacionActivity::class.java)
            startActivity(intent)
        }
    }
}