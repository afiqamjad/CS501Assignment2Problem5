package com.example.afiqamjadassignment2problem5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val one = findViewById<Button>(R.id.num1)
        val two = findViewById<Button>(R.id.num2)
        val three = findViewById<Button>(R.id.num3)
        val four = findViewById<Button>(R.id.num4)
        val five = findViewById<Button>(R.id.num5)
        val six = findViewById<Button>(R.id.num6)
        val seven = findViewById<Button>(R.id.num7)
        val eight = findViewById<Button>(R.id.num8)
        val nine = findViewById<Button>(R.id.num9)

        val text = findViewById<EditText>(R.id.editText)

        one.setOnClickListener{
            text.append("1")
        }
        two.setOnClickListener{
            text.append("2")
        }
        three.setOnClickListener{
            text.append("3")
        }
        four.setOnClickListener{
            text.append("4")
        }
        five.setOnClickListener{
            text.append("5")
        }
        six.setOnClickListener{
            text.append("6")
        }
        seven.setOnClickListener{
            text.append("7")
        }
        eight.setOnClickListener{
            text.append("8")
        }
        nine.setOnClickListener{
            text.append("9")
        }

    }
}