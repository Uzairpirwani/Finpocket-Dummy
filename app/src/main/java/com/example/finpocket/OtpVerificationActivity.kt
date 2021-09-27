package com.example.finpocket

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class OtpVerificationActivity : AppCompatActivity() {

    lateinit var otp1: EditText
    lateinit var otp2: EditText
    lateinit var otp3: EditText
    lateinit var otp4: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_otpverification)



    otp1=findViewById(R.id.Otp_1)
    otp2=findViewById(R.id.Otp_2)
    otp3=findViewById(R.id.Otp_3)
    otp4=findViewById(R.id.Otp_4)
        otp1.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
            }

            override fun afterTextChanged(s: Editable?) {
                otp2.requestFocus()
            }

        })
        otp2.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
            }

            override fun afterTextChanged(s: Editable?) {
                otp3.requestFocus()
            }

        })
        otp3.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
            }

            override fun afterTextChanged(s: Editable?) {
                otp4.requestFocus()
            }

        })
        otp4.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
            }

            override fun afterTextChanged(s: Editable?) {
                if(otp1.text.isNotEmpty() && otp2.text.isNotEmpty() && otp3.text.isNotEmpty() && otp4.text.isNotEmpty() ) {
                    val intent = Intent(this@OtpVerificationActivity,FinpocketLogin::class.java)
                    startActivity(intent)
                } else {
                    Toast.makeText(this@OtpVerificationActivity, "OTP Field,s can't be empty.", Toast.LENGTH_SHORT).show()
                }
            }

        })

    }
    }