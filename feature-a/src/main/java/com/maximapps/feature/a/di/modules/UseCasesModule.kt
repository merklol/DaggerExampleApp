package com.maximapps.feature.a.di.modules

import com.maximapps.feature.core.di.FeatureCoreApi
import dagger.Module
import dagger.Provides

@Module
object UseCasesModule {
    @Provides
    fun getLastUnreadMessageUseCase(api: FeatureCoreApi) = api.getLastUnreadMessageUseCase
}