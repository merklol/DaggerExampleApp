package com.maximapps.feature.core.data

import com.maximapps.core.Messenger
import com.maximapps.feature.core.di.FeatureCoreScope
import com.maximapps.feature.core.domain.MessageRepository
import javax.inject.Inject

@FeatureCoreScope
internal class MessageRepositoryImpl @Inject constructor(
    private val messenger: Messenger
) : MessageRepository {
    override fun getLastUnreadMessage() = messenger.getLastUnreadMessage()
}