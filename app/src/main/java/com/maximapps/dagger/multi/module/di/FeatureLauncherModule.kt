package com.maximapps.dagger.multi.module.di

import com.maximapps.dagger.multi.module.common.FeatureLauncher
import com.maximapps.feature.a.di.FeatureAApi
import dagger.Module
import dagger.Provides
import dagger.multibindings.IntoSet

@Module
object FeatureLauncherModule {
    @[Provides IntoSet Suppress("unused_parameter")]
    fun provideFeatureAApi(featureAApi: FeatureAApi) = FeatureLauncher { }
}