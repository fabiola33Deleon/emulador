package com.Deleon.emulador_20230033_fabiola

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Activity_login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_login)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val txtuser = findViewById<EditText>(R.id.txtUser).text
        val txtpass = findViewById<EditText>(R.id.txtPass).text
        val btnSing = findViewById<Button>(R.id.btninicio)

        btnSing.setOnClickListener{


            val intent = Intent (this, MainActivity::class.java)
            startActivity(intent)

        }
    }
}
