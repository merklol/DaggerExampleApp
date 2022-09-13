package com.maximapps.feature.core.domain

internal interface MessageRepository {
    fun getLastUnreadMessage(): String
}