package com.example.finpocket

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText

class FinpocketLogin : AppCompatActivity() {

    lateinit var EditText: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finpocket_login)
    }

    fun phoneNumberActivity(view: View) {
       val intent = Intent(this,PhoneNumberActivity::class.java)
        startActivity(intent)
    }

    fun numberActivity(view: View) {
        val intent = Intent(this,PhoneNumberActivity::class.java)
        startActivity(intent)
    }
}