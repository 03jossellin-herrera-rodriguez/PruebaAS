package com.example.actividad11

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val btn_siguiente = findViewById<Button>(R.id.btn_siguiente)
        val ptUsuario = findViewById<EditText>(R.id.pt_usuario)
        val ptContrasenia = findViewById<EditText>(R.id.pt_contrasenia)
        val ptApodo=findViewById<EditText>(R.id.pt_apodo)

        btn_siguiente.setOnClickListener {
            val usuario = ptUsuario.text.toString()
            val contrasenia = ptContrasenia.text.toString()
            val apodo = ptApodo.text.toString()

            if (usuario == "Joss") {

                if (contrasenia == "123") {
                    //  val intent = android.content.Intent(this, com.example.Actividad11.Actividad2::class.java)
                    val intent = android.content.Intent(this, com.example.actividad11.MainActivity2::class.java)
                    intent.putExtra("usuario", usuario)

                    val sharedPreferences = this.getSharedPreferences("MiSharedPreference", MODE_PRIVATE)
                    with(sharedPreferences.edit()){
                        putString("apodo", apodo)
                        apply()
                        //holiwis

                    }

                    startActivity(intent)
                } else {
                    Toast.makeText(this, "Contraseña incorrecta", Toast.LENGTH_SHORT).show()
                }

            } else {
                Toast.makeText(this, "Usuario incorrecto", Toast.LENGTH_SHORT).show()
            }
        }


    }




}