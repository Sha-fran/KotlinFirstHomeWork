package com.example.helloworldkotlin

import android.app.Activity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_layout)

        val buttonPlus:Button = findViewById(R.id.buttonPlus)
        val buttonMinus:Button = findViewById(R.id.buttonMinus)
        var number:Int = 0

        buttonPlus.setOnClickListener {
            number++
            Toast.makeText(this, "${number}", Toast.LENGTH_LONG).show()
        }

        buttonMinus.setOnClickListener {
            if (number == 0) {
                Toast.makeText(this, "Число не може бути менше 0!", Toast.LENGTH_LONG).show()
            } else {
                number--
                Toast.makeText(this, "${number}", Toast.LENGTH_LONG).show()
            }

        }
    }
}
