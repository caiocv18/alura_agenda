package br.com.caiocv18

import android.app.Activity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast

class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Toast.makeText(this,"Jesus Alive!!! Caio Vinicius", Toast.LENGTH_LONG).show()

    }
}