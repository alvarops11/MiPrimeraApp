package com.alvaroperez.miprimeraapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.alvaroperez.miprimeraapp.databinding.ActivityContactoBinding // Uso de inflate [cite: 96]

class ContactoActivity : AppCompatActivity() {
    private lateinit var binding: ActivityContactoBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Requisito: Cargar el layout con inflate [cite: 96]
        binding = ActivityContactoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnEnviar.setOnClickListener {
            // Recogemos los datos de los campos [cite: 90, 91, 92, 93]
            val nombre = binding.etNombre.text.toString()
            val mensaje = binding.etMensaje.text.toString()

            // Aquí podrías cerrar la actividad o pasar datos de vuelta [cite: 94]
            finish()
        }
    }
}