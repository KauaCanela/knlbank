package com.example.knlbank

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var textViewSaldo: TextView
    private var saldo: Double = 1000.0 // Saldo inicial de exemplo

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textViewSaldo = findViewById(R.id.textViewSaldo)
        atualizarSaldo()

        val buttonRealizarPix: Button = findViewById(R.id.buttonRealizarPix)
        val buttonPagar: Button = findViewById(R.id.buttonPagar)
        val buttonTransferir: Button = findViewById(R.id.buttonTransferir)
        val buttonDepositar: Button = findViewById(R.id.buttonDepositar)

        buttonRealizarPix.setOnClickListener {
            val intent = Intent(this, PixActivity::class.java)
            startActivity(intent)
        }

        buttonPagar.setOnClickListener {
            val intent = Intent(this, PagarActivity::class.java)
            startActivity(intent)
        }

        buttonTransferir.setOnClickListener {
            val intent = Intent(this, TransferirActivity::class.java)
            startActivity(intent)
        }

        buttonDepositar.setOnClickListener {
            depositar(100.0) // Valor de exemplo
        }
    }

    private fun depositar(valor: Double) {
        saldo += valor
        atualizarSaldo()
        Toast.makeText(this, "Depósito de R$ $valor realizado com sucesso", Toast.LENGTH_SHORT).show()
    }

    private fun atualizarSaldo() {
        val saldoFormatado = String.format("Saldo: R$ %.2f", saldo)
        textViewSaldo.text = saldoFormatado
    }
}

