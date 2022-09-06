package com.elshafee.classd

object RegistrationUtil {

    private val existingUsers = listOf("ahmad","ali","yasser")

    fun validatioRegistratioInput(
        username: String,
        password: String,
        confirmationpassword: String
    ): Boolean {

        if (username.isEmpty() ){
            return false
        }
        if (password.isEmpty()){
            return false
        }
        if (password != confirmationpassword){
            return false
        }
        if (password.count(){ it.isDigit()} < 2){
            return false
        }
        if(username in existingUsers){
            return false
        }

        return true

    }
}