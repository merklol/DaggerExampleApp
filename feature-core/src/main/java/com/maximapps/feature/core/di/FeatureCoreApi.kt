package com.maximapps.feature.core.di

import com.maximapps.feature.core.domain.GetLastUnreadMessageUseCase

interface FeatureCoreApi {
    val getLastUnreadMessageUseCase: GetLastUnreadMessageUseCase
}