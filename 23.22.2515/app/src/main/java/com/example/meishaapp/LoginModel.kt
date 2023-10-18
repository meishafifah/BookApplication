package com.example.meishaapp

class LoginModel {
    var username = ""
    var password = ""

    fun loginCek():Boolean{
        if (username.equals("Username") &&
            password.equals("Password")) {
            return true
        } else {
            return false
        }
    }
}