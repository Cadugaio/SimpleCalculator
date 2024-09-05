package com.example.mykotlinapp

import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() , View.OnClickListener() {

    lateinit var btnAdd : Button
    lateinit var btnSub : Button
    lateinit var btnMult : Button
    lateinit var btnDivi : Button
    lateinit var etA : EditText
    lateinit var etB : EditText
    lateinit var ResultTv : TextView



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        btnAdd = findViewById (R.id.btnAdd)
        btnSub = findViewById (R.id.btnSub)
        btnMult = findViewById (R.id.btnMult)
        btnDivi = findViewById (R.id.btnDivi)
        etA = findViewById(R.id.et_a)
        etB = findViewById(R.id.et_b)
        resultTv = findViewById(R.id.result_tv)

        btnAdd.setOnClickListener(this)
        btnSub.setOnClickListener(this)
        btnMult.setOnClickListener(this)
        btnDivi.setOnClickListener(this)

    }
    override fun onClick(p0: View?){
        var a = etA.text.toString().toDouble()
        var b = etB.text.toString().toDouble()
        var result : 0.0
        when(v?.id){
            R.id.btn_Add ->{
                result = a+b
            }
            R.id.btn_Sub ->{
                result = a-b
            }
            R.id.btn_Mult ->{
                result = a*b
            }
            R.id.btn_Divi ->{
                result = a/b
            }
        }
        resultTv.text = "Result is $result"
    }
    }
