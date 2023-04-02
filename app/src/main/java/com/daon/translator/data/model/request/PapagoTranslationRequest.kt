package com.daon.translator.data.model.request

data class PapagoTranslationRequest(
    val source: String,
    val target: String,
    val text: String
)