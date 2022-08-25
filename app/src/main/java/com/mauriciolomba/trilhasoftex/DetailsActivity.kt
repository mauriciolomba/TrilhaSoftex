package com.mauriciolomba.trilhasoftex

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.mauriciolomba.trilhasoftex.databinding.ActivityDetailsBinding
import com.mauriciolomba.trilhasoftex.databinding.ActivityMainBinding

class DetailsActivity : AppCompatActivity() {
    private lateinit var binding : ActivityDetailsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_details)


        binding = ActivityDetailsBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val nome = intent.getStringExtra("nome")
        val email = intent.getStringExtra("email")
        val telefone = intent.getStringExtra("telefone")
        binding.textViewNome.setText("Bem vindo ${nome}!")

    }
}