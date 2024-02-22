package com.example.knlbank

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class TransferirActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_transferir)

        val editTextDestinatario: EditText = findViewById(R.id.editTextDestinatario)
        val editTextValor: EditText = findViewById(R.id.editTextValor)
        val buttonTransferir: Button = findViewById(R.id.buttonTransferir)

        buttonTransferir.setOnClickListener {
            val destinatario = editTextDestinatario.text.toString()
            val valor = editTextValor.text.toString()

            if (destinatario.isNotEmpty() && valor.isNotEmpty()) {
                // Aqui você pode adicionar a lógica para transferir o dinheiro
                Toast.makeText(this, "Transferência de R$ $valor para $destinatario realizada com sucesso", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Por favor, preencha todos os campos", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
