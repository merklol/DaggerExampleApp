package com.maximapps.feature.a.di.modules

import com.maximapps.core.Messenger
import com.maximapps.feature.core.di.FeatureCoreApi
import com.maximapps.feature.core.di.FeatureCoreComponentHolder
import com.maximapps.feature.core.di.FeatureCoreDependencies
import dagger.Module
import dagger.Provides

@Module
internal object FeatureAModule {
    @Provides
    fun featureCoreDependencies(messenger: Messenger) = object : FeatureCoreDependencies {
        override val messenger: Messenger = messenger
    }

    @Provides
    fun featureCoreApi(dependencies: FeatureCoreDependencies): FeatureCoreApi {
        FeatureCoreComponentHolder.init(dependencies)
        return FeatureCoreComponentHolder.get()
    }
}