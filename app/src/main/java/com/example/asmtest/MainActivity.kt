package com.example.asmtest

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private var btn1: Button? = null
    private var btn2: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn1 = findViewById(R.id.btn1)
        btn1?.setOnClickListener {
            supportFragmentManager.beginTransaction().add(R.id.for_frag_1, Fragment1(), null).commit()
        }
        btn2 = findViewById(R.id.btn2)
        btn2?.setOnClickListener {
            supportFragmentManager.beginTransaction().add(R.id.for_frag_2, Fragment2(), null).commit()
        }
    }
}