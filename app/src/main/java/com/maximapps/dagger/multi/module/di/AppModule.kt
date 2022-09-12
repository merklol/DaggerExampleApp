package com.maximapps.dagger.multi.module.di

import com.maximapps.core.DefaultMessenger
import com.maximapps.core.Messenger
import com.maximapps.feature.a.di.FeatureAApi
import com.maximapps.feature.a.di.FeatureAComponentHolder
import com.maximapps.feature.a.di.FeatureADependencies
import dagger.Module
import dagger.Provides

@Module
object AppModule {
    @Provides
    fun provideMessenger(): Messenger = DefaultMessenger()

    @Provides
    fun provideFeatureDependencies(messenger: Messenger) = object : FeatureADependencies {
        override val messenger: Messenger = messenger
    }

    @Provides
    fun provideFeatureComponent(featureADependencies: FeatureADependencies): FeatureAApi {
        FeatureAComponentHolder.init(featureADependencies)
        return FeatureAComponentHolder.get()
    }
}