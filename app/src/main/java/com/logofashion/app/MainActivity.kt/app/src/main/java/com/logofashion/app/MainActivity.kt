package com.logofashion.app

import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val layout = LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL
            setPadding(60, 100, 60, 60)
        }

        val title = TextView(this).apply {
            text = "LOGO FASHION"
            textSize = 32f
            setTextColor(android.graphics.Color.BLACK)
        }

        val sub = TextView(this).apply {
            text = "Premium T-Shirt & Panjabi"
            textSize = 16f
        }

        val btn1 = Button(this).apply { text = "T-Shirt - 499 Tk" }
        val btn2 = Button(this).apply { text = "Panjabi - 999 Tk" }
        val btn3 = Button(this).apply { text = "Order Now" }

        btn1.setOnClickListener { Toast.makeText(this, "T-Shirt Selected", Toast.LENGTH_SHORT).show() }
        btn2.setOnClickListener { Toast.makeText(this, "Panjabi Selected", Toast.LENGTH_SHORT).show() }
        btn3.setOnClickListener { Toast.makeText(this, "Order Placed! Thank You", Toast.LENGTH_SHORT).show() }

        layout.addView(title)
        layout.addView(sub)
        layout.addView(btn1)
        layout.addView(btn2)
        layout.addView(btn3)

        setContentView(layout)
    }
}
