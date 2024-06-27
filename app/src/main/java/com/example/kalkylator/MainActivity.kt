package com.example.kalkylator

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.EditText
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val etSide1 = findViewById<EditText>(R.id.etSide1)
        val etSide2 = findViewById<EditText>(R.id.etSide2)
        val btnCalculate = findViewById<Button>(R.id.btnCalculate)

        btnCalculate.setOnClickListener {
            val side1 = etSide1.text.toString().toDouble()
            val side2 = etSide2.text.toString().toDouble()

            val hypotenuse = kotlin.math.sqrt(side1 * side1 + side2 * side2)

            val toastMessage = "Длина гипотенузы: $hypotenuse"
            val toast = Toast.makeText(applicationContext, toastMessage, Toast.LENGTH_SHORT)
            toast.show()
        }
    }
}

