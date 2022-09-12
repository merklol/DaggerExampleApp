package com.maximapps.feature.core.domain

import com.maximapps.feature.core.data.MessageRepository
import javax.inject.Inject

interface GetLastUnreadMessageUseCase {
    operator fun invoke(): String
}

internal class GetLastUnreadMessageUseCaseImpl @Inject constructor(
    private val messageRepository: MessageRepository
) : GetLastUnreadMessageUseCase {

    override fun invoke() = messageRepository.getLastUnreadMessage()
}