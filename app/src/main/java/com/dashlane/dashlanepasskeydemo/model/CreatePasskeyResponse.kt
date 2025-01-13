package com.dashlane.dashlanepasskeydemo.model

data class CreatePasskeyResponse(
    val response: Response,
    val authenticatorAttachment: String,
    val id: String,
    val rawId: String,
    val type: String
) {
    data class Response(
        val clientDataJSON: String,
        val attestationObject: String,
        val transports: List<String>
    )
}