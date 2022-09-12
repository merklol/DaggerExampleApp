package com.maximapps.feature.core.data

import com.maximapps.core.Messenger
import com.maximapps.feature.core.di.FeatureCoreScope
import javax.inject.Inject

internal interface MessageRepository {
    fun getLastUnreadMessage(): String
}

@FeatureCoreScope
internal class MessageRepositoryImpl @Inject constructor(
    private val messenger: Messenger
) : MessageRepository {
    override fun getLastUnreadMessage() = messenger.getLastUnreadMessage()
}