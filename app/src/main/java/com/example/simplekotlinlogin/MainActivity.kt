package com.example.simplekotlinlogin

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.textfield.TextInputEditText


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onclick(view: View) {
        login(
            findViewById<TextInputEditText>(R.id.edtUserName).text.toString(),
            findViewById<TextInputEditText>(R.id.edtPassword).text.toString()
        )
    }

    private fun login(userName: String, password: String) =
        if (userName == "saya" && password == "1234") {

            Toast.makeText(this, "Login Success!", Toast.LENGTH_SHORT).show()
        } else {
            Toast.makeText(this, "Login Failed!", Toast.LENGTH_SHORT).show()
        }
}