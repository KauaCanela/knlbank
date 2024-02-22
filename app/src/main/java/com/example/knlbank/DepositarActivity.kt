package com.example.knlbank

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class DepositarActivity : AppCompatActivity() {

    private lateinit var editTextValorDepositar: EditText
    private lateinit var buttonDepositar: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_depositar)


        editTextValorDepositar = findViewById(R.id.editTextValorDepositar)
        buttonDepositar = findViewById(R.id.buttonDepositar)


        buttonDepositar.setOnClickListener {
            val valor = editTextValorDepositar.text.toString()


            efetuarDeposito(valor)
        }
    }

    private fun efetuarDeposito(valor: String) {
                println("Efetuando depósito de $valor")
    }
}
