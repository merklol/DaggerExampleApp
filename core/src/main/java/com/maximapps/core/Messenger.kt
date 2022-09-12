package com.maximapps.core

import kotlin.random.Random

interface Messenger {
    fun getLastUnreadMessage(): String
}

class DefaultMessenger : Messenger {
    override fun getLastUnreadMessage(): String {
        val companyName = listOf("Facebook", "Amazon", "Apple", "Netflix", "Google").random()
        val version = Random.nextInt(0, 10)

        return "$companyName has just announced version #$version of their app."
    }
}