package com.mauriciolomba.trilhasoftex

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.mauriciolomba.trilhasoftex.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val TAG = "MainActivity"
    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)

        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

//        val editTextNome =  findViewById<EditText>(R.id.editTextNome)
//        val editTextEmail =  findViewById<EditText>(R.id.editTextEmail)
//        val editTextTelefone=  findViewById<EditText>(R.id.editTextTelefone)
//        val buttonLimpar = findViewById<Button>(R.id.buttonLimpar)
//        val buttonSalvar = findViewById<Button>(R.id.buttonSalvar)

        binding.buttonLimpar.setOnClickListener {
            Log.d(TAG, "Botão Limpar clicado")
            limpaCampos()
        }

        binding.buttonSalvar.setOnClickListener {
            Log.d(TAG, "Botão Salvar clicado")
            var nome = binding.editTextNome.text.toString()
            var email = binding.editTextEmail.text.toString()
            var telefone = binding.editTextTelefone.text.toString()
            //limpaCampos()
            val intent = Intent(this, DetailsActivity::class.java).apply {
                putExtra("nome", nome)
                putExtra("email", email)
                putExtra("telefone", telefone)
            }
            Toast.makeText(this, "Nome: ${nome} E-mail: ${email} Telefone: ${telefone}", Toast.LENGTH_SHORT).show()
            startActivity(intent)
        }


    }

    private fun limpaCampos() {
        binding.editTextNome.text.clear()
        binding.editTextEmail.text.clear()
        binding.editTextTelefone.text.clear()
    }
}