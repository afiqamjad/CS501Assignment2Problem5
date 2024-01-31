package com.example.afiqamjadassignment2problem5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import kotlin.math.sqrt

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
        val zero = findViewById<Button>(R.id.num0)
        val dot = findViewById<Button>(R.id.numdot)
        val plus = findViewById<Button>(R.id.plus)
        val times = findViewById<Button>(R.id.times)
        val minus = findViewById<Button>(R.id.minus)
        val divide = findViewById<Button>(R.id.divide)
        val sqrt = findViewById<Button>(R.id.sqrt)
        val equals = findViewById<Button>(R.id.equals)

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
        zero.setOnClickListener{
            text.append("0")
        }
        dot.setOnClickListener {
            text.append(".")
        }
        plus.setOnClickListener{
            text.append("+")
        }
        times.setOnClickListener{
            text.append("*")
        }
        minus.setOnClickListener{
            text.append("-")
        }
        divide.setOnClickListener{
            text.append("/")
        }
        sqrt.setOnClickListener{
            text.append("√")
        }
        equals.setOnClickListener{
            val wholeThing = text.text.toString()
            if (wholeThing != "") {
                val splitted = wholeThing.split("+", "-", "*", "/", "√")
                if (splitted[0] == "√") {
                    if (splitted.size > 1) {
                        val num = splitted[1].toDouble()
                        val ans = sqrt(num)
                        text.setText(ans.toString())
                    } else {
                        text.error = "Bro"
                    }
                }
            }

        }

    }
}