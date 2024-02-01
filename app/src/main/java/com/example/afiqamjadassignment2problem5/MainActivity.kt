package com.example.afiqamjadassignment2problem5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
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
        var ans = "0.0"
        val text = findViewById<EditText>(R.id.editText)

        one.setOnClickListener{
            if (ans != "0.0") {
                text.setText("1")
                ans = "0.0"
            } else {
                text.append("1")
            }
        }
        two.setOnClickListener{
            if (ans != "0.0") {
                text.setText("2")
                ans = "0.0"
            } else {
                text.append("2")
            }
        }
        three.setOnClickListener{
            if (ans != "0.0") {
                text.setText("3")
                ans = "0.0"
            } else {
                text.append("3")
            }
        }
        four.setOnClickListener{
            if (ans != "0.0") {
                text.setText("4")
                ans = "0.0"
            } else {
                text.append("4")
            }
        }
        five.setOnClickListener{
            if (ans != "0.0") {
                text.setText("5")
                ans = "0.0"
            } else {
                text.append("5")
            }
        }
        six.setOnClickListener{
            if (ans != "0.0") {
                text.setText("6")
                ans = "0.0"
            } else {
                text.append("6")
            }
        }
        seven.setOnClickListener{
            if (ans != "0.0") {
                text.setText("7")
                ans = "0.0"
            } else {
                text.append("7")
            }
        }
        eight.setOnClickListener{
            if (ans != "0.0") {
                text.setText("8")
                ans = "0.0"
            } else {
                text.append("8")
            }
        }
        nine.setOnClickListener{
            if (ans != "0.0") {
                text.setText("9")
                ans = "0.0"
            } else {
                text.append("9")
            }
        }
        zero.setOnClickListener{
            if (ans != "0.0") {
                text.setText("0")
                ans = "0.0"
            } else {
                text.append("0")
            }
        }
        dot.setOnClickListener {
            if (ans != "0.0") {
                text.setText(".")
                ans = "0.0"
            } else {
                text.append(".")
            }
        }
        plus.setOnClickListener{
            if (ans != "0.0") {
                text.setText("+")
                ans = "0.0"
            } else {
                text.append("+")
            }
        }
        times.setOnClickListener{
            if (ans != "0.0") {
                text.setText("*")
                ans = "0.0"
            } else {
                text.append("*")
            }
        }
        minus.setOnClickListener{
            if (ans != "0.0") {
                text.setText("-")
                ans = "0.0"
            } else {
                text.append("-")
            }
        }
        divide.setOnClickListener{
            if (ans != "0.0") {
                text.setText("/")
                ans = "0.0"
            } else {
                text.append("/")
            }
        }
        sqrt.setOnClickListener{
            if (ans != "0.0") {
                text.setText("√")
                ans = "0.0"
            } else {
                text.append("√")
            }
        }
        equals.setOnClickListener{
            val wholeThing = text.text.toString()
            val listNum: MutableList<String> = mutableListOf()
            var letterBefore = "]"
            for (letter in wholeThing) {
                if (letter in "0123456789.") {
                    if (letterBefore in "+-*/√") {
                        listNum += letter.toString()
                    } else {
                        if (listNum.isEmpty()) {
                            listNum += letter.toString()
                        } else {
                            listNum[listNum.lastIndex] = listNum.last().plus(letter.toString())
                        }
                    }
                    letterBefore = letter.toString()
                } else {
                    if (letterBefore in "+-*/.") {
                        Toast.makeText(this, "Invalid Operation Sequence!",Toast.LENGTH_SHORT).show()
                        text.text.clear()
                        return@setOnClickListener
                    } else {
                        listNum += letter.toString()
                        letterBefore = letter.toString()
                    }
                }
            }
            if (listNum.size == 1 && listNum[0] == ".") {
                Toast.makeText(this, "You can't have only a decimal in the equation!",Toast.LENGTH_SHORT).show()
                text.text.clear()
                return@setOnClickListener
            }
            val checking = listNum[listNum.lastIndex]
            if (checking in  "+-/*√" || checking == ".") {
                if (checking == ".") {
                    Toast.makeText(this, "You can't end the equation with only a decimal!",Toast.LENGTH_SHORT).show()
                } else {
                    Toast.makeText(this, "You can't end the equation with an operator!",Toast.LENGTH_SHORT).show()
                }
                text.text.clear()
                return@setOnClickListener
            }
            var firstNum = 0.0
            var operator = ""
            var first = true
            for(i in listNum) {
                if (i in "+-*/" && listNum[0] == i) {
                    Toast.makeText(this, "You can't start the equation with the $i operator!",Toast.LENGTH_SHORT).show()
                    text.text.clear()
                    return@setOnClickListener
                }
                if (i !in "+-*/√") {
                    if (firstNum == 0.0 && operator == "") {
                        first = false
                        firstNum = i.toDouble()
                    } else if (operator != "") {
                        when (operator) {
                            "+" -> {
                                first = false
                                firstNum += i.toDouble()
                                operator = ""
                            }
                            "-" -> {
                                first = false
                                firstNum -= i.toDouble()
                                operator = ""
                            }
                            "*" -> {
                                first = false
                                firstNum *= i.toDouble()
                                operator = ""
                            }
                            "/" -> {
                                first = false
                                if (i.toDouble() == 0.0) {
                                    Toast.makeText(this, "You can't divide by 0!",Toast.LENGTH_SHORT).show()
                                    text.text.clear()
                                    return@setOnClickListener
                                }
                                firstNum /= i.toDouble()
                                operator = ""
                            }
                            else -> {
                                if (first) {
                                    firstNum = sqrt(i.toDouble())
                                    first = false
                                } else {
                                    firstNum *= sqrt(i.toDouble())
                                }
                                operator = ""
                            }
                        }
                    }
                } else {
                    if (operator == "") {
                        operator = i
                    }
                }
            }
            ans = firstNum.toString()
            text.setText(ans)
            ans += "s"

        }

    }
}