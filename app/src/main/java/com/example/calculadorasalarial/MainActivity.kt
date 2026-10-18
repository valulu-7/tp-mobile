package com.example.calculadorasalarial

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.calculadorasalarial.CalculadoraActivity
import com.example.calculadorasalarial.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnIngresar = findViewById<Button>(R.id.btnIngresar)
        val btnIrARegistro = findViewById<Button>(R.id.btnIrARegistro)

        // 1. Al tocar Ingresar, va a la Calculadora
        btnIngresar.setOnClickListener {
            val intent = Intent(this, CalculadoraActivity::class.java)
            startActivity(intent)
        }

        // 2. Al tocar Regístrate, abre la pantalla de Registro
        btnIrARegistro.setOnClickListener {
            val intent = Intent(this, RegistroActivity::class.java)
            startActivity(intent)
        }
    }
}