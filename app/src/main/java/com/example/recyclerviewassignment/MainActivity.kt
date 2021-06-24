package com.example.recyclerviewassignment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.math.BigInteger

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rvnumbers=findViewById<RecyclerView>(R.id.rvnumbers)
        rvnumbers.layoutManager = LinearLayoutManager(baseContext)
        val numbersAdapter = NumbersARAdapter(fibonacci(maxNumber = 100))
         rvnumbers.adapter = numbersAdapter
        fibonacci(10)
    }
}
fun fibonacci(maxNumber:Int):MutableList<BigInteger> {
    var count = 0
    var firstNumber = 0.toBigInteger()
    var secondNumber = 1.toBigInteger()
    val fibNumbers = mutableListOf<BigInteger>()
    while (count <= maxNumber) {
        val sum = firstNumber + secondNumber
        firstNumber = secondNumber
        secondNumber = sum
        count++
        fibNumbers.add(firstNumber)
    }
    return fibNumbers
}


