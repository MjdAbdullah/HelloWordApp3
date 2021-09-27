/*
-- Hello World App3 --
-- author : Mjd Abdullah --
 */
package com.example.helloword

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    lateinit var myText : TextView
    lateinit var myButton: Button
    lateinit var myET : EditText
    lateinit var ButtonEnter : Button
    var arr = arrayListOf<String>()
    lateinit var ViewInput : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        myText = findViewById(R.id.tvHi)
        myText.text = "Hello There"
        changeText()
        myButton = findViewById(R.id.bClick)
        myButton.setOnClickListener { changeColor() }
        ButtonEnter = findViewById(R.id.bEnter)
        myET = findViewById(R.id.ETforArray)
        ViewInput = findViewById(R.id.tvInput)
        ButtonEnter.setOnClickListener{ EntertoArray() }

    }
    fun  changeText(){
        myText.text="Hello ... !"
    }
    fun changeColor(){
        var num1 = Random.nextInt(0,256)
        var num2 = Random.nextInt(0,256)
        var num3 = Random.nextInt(0,256)
        var num4 = Random.nextInt(0,256)
        myText.setTextColor(Color.argb(num1,num2,num3,num4))
    }
    fun EntertoArray(){
        var UserInput = myET.getText().toString()
        arr.add(UserInput)
        tvInput.text = UserInput
        print("the Arraylist : ")
        for (i in arr){
            print("$i ")
        }
        println()
    }

}