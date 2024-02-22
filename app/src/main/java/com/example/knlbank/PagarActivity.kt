package com.example.knlbank

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class PagarActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pagar)

        val editTextDestinatario: EditText = findViewById(R.id.editTextDestinatario)
        val editTextValor: EditText = findViewById(R.id.editTextValor)
        val buttonPagar: Button = findViewById(R.id.buttonPagar)

        buttonPagar.setOnClickListener {
            val destinatario = editTextDestinatario.text.toString()
            val valor = editTextValor.text.toString()

            if (destinatario.isNotEmpty() && valor.isNotEmpty()) {
                // Aqui você pode adicionar a lógica para efetuar o pagamento
                Toast.makeText(this, "Pagamento de R$ $valor para $destinatario realizado com sucesso", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Por favor, preencha todos os campos", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
