package com.mauriciolomba.trilhasoftex

data class User(val firstName: String?, val lastName: String?)

// função de extensão
fun User.getFormattedName(): String {
    return if (lastName != null) {
        if (firstName != null) {
            "$firstName $lastName"
        } else {
            lastName ?: "Unknown"
        }
    } else {
        firstName ?: "Unknown"
    }
}