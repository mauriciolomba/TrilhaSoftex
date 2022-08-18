package com.mauriciolomba.trilhasoftex

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private val TAG = "MainActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //binding = MainActivityBinding.inflate(layoutInflater)
        //val view = binding.root
        //setContentView(view)

        val editTextNome =  findViewById<EditText>(R.id.editTextNome)
        val editTextEmail =  findViewById<EditText>(R.id.editTextEmail)
        val editTextTelefone=  findViewById<EditText>(R.id.editTextTelefone)
        val buttonLimpar = findViewById<Button>(R.id.buttonLimpar)
        val buttonSalvar = findViewById<Button>(R.id.buttonSalvar)

        buttonLimpar.setOnClickListener {
            Log.d(TAG, "Botão Limpar clicado")
            limpaCampos(editTextNome, editTextEmail, editTextTelefone)
        }

        buttonSalvar.setOnClickListener {
            Log.d(TAG, "Botão Salvar clicado")
            Toast.makeText(this, "Salvo", Toast.LENGTH_SHORT).show()
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