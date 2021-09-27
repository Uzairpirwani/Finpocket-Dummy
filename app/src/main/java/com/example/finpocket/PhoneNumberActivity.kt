package com.example.finpocket
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.example.finpocket.databinding.ActivityPhoneNumberBinding
import com.example.finpocket.utils.Utils.validatePhoneNumber

class PhoneNumberActivity : AppCompatActivity() {

    lateinit var binding: ActivityPhoneNumberBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_phone_number)

    }

    fun otpVerification(view: View) {

        if (validatePhoneNumber(binding.phoneNumber.text.toString()))
        {

            val intent = Intent(this, OtpVerificationActivity::class.java)
            startActivity(intent)
        } else {
            Toast.makeText(this,"Invalid phone number", Toast.LENGTH_SHORT).show()
        }

    }
    }

