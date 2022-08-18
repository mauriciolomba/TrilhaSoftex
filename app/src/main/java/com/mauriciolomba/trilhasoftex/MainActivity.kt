package com.mauriciolomba.trilhasoftex

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editTextNome =  findViewById<EditText>(R.id.editTextNome)
        val editTextEmail =  findViewById<EditText>(R.id.editTextEmail)
        val editTextTelefone=  findViewById<EditText>(R.id.editTextTelefone)
        val buttonLimpar = findViewById<Button>(R.id.buttonLimpar)
        val buttonSalvar = findViewById<Button>(R.id.buttonSalvar)

        buttonLimpar.setOnClickListener {
            limpaCampos(editTextNome, editTextEmail, editTextTelefone)
        }

        buttonSalvar.setOnClickListener {
            Toast.makeText(this, "Botão Salvar Clicado", Toast.LENGTH_SHORT).show()
            limpaCampos(editTextNome, editTextEmail, editTextTelefone)
        }
    }

    private fun limpaCampos(
        editTextNome: EditText,
        editTextEmail: EditText,
        editTextTelefone: EditText
    ) {
        editTextNome.text.clear()
        editTextEmail.text.clear()
        editTextTelefone.text.clear()
    }
}