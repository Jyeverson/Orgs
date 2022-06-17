package com.example.orgs

import android.app.Activity
import android.os.Bundle
import android.widget.TextView

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val nome = findViewById<TextView>(R.id.nome)
        val descricao = findViewById<TextView>(R.id.descricao)
        val valor = findViewById<TextView>(R.id.valor)

        nome.text = "Cesta de Frutas"
        descricao.text = "Laranja, manga e uva"
        valor.text = "19.99"
    }

}