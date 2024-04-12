package com.example.actividad11

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)


        val tv_bienvenida = findViewById<TextView>(R.id.tv_bienvenida)
        val nombreUsuario = intent.getStringExtra("usuario")

        val sharedPreference = this.getSharedPreferences("MiSharedPreference", MODE_PRIVATE)
        val apodo = sharedPreference.getString("apodo", "")

        tv_bienvenida.append(" " + apodo + ":)")
    }
}