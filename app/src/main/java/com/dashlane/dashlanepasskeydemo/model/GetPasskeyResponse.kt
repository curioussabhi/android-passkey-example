package com.dashlane.dashlanepasskeydemo.model

data class GetPasskeyResponse(
    val response: Response,
    val authenticatorAttachment: String,
    val id: String,
    val rawId: String,
    val type: String
) {
    data class Response(
        val clientDataJSON: String,
        val authenticatorData: String,
        val signature: String,
        val userHandle: String
    )
}