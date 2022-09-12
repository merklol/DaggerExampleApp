package com.maximapps.feature.core.di

import com.maximapps.feature.core.domain.GetLastUnreadMessageUseCase

interface FeatureCoreApi {
    val getLastUnreadMessageUseCase: GetLastUnreadMessageUseCase
}

fun FeatureCoreApi(dependencies: FeatureCoreDependencies): FeatureCoreApi {
    return DaggerFeatureCoreComponent.builder()
        .featureCoreDependencies(dependencies)
        .build()
}