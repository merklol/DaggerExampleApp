package com.maximapps.feature.core.di.modules

import com.maximapps.feature.core.data.MessageRepositoryImpl
import com.maximapps.feature.core.domain.GetLastUnreadMessageUseCase
import com.maximapps.feature.core.domain.GetLastUnreadMessageUseCaseImpl
import com.maximapps.feature.core.domain.MessageRepository
import dagger.Binds
import dagger.Module

@[Module Suppress("unused")]
internal interface FeatureCoreModule {
    @Binds
    fun bindMessageRepository(repository: MessageRepositoryImpl): MessageRepository

    @Binds
    fun bindGetLastUnreadMessageUseCase(
        useCase: GetLastUnreadMessageUseCaseImpl
    ): GetLastUnreadMessageUseCase
}