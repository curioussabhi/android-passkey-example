package com.dashlane.dashlanepasskeydemo

sealed class LoginState {
    object Initial : LoginState()

    /**
     * Enter email to create account
     */
    data class EmailSuccess(val email: String) : LoginState()
    object EmailError : LoginState()

    /**
     * Create account
     */
    object CreateAccountSuccess : LoginState()

    data class CreateAccountError(val message: String, val random: Long = System.currentTimeMillis()) : LoginState()

    /**
     * Login to a created account
     */
    data class LoginSuccess(val email: String, val creationDate: Long) : LoginState()
    data class LoginError(val message: String, val random: Long = System.currentTimeMillis()) : LoginState()

    object Disconnected : LoginState()
}