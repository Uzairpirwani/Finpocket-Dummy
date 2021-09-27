package com.example.finpocket.utils


object Utils
{
    fun validatePhoneNumber(phoneNumber: String): Boolean
    {
        if (phoneNumber.length >= 10) {
            if (phoneNumber.startsWith("03") || phoneNumber.startsWith("3"))
            {
                return true
            }
        }
        return false
    }

    }
