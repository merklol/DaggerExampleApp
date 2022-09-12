package com.maximapps.feature.a.di

import com.maximapps.feature.a.ui.FeatureAFragment
import com.maximapps.feature.a.di.modules.FeatureAModule
import com.maximapps.feature.core.di.FeatureCoreApi
import dagger.Component

@[FeatureAScope Component(
    modules = [FeatureAModule::class],
    dependencies = [FeatureADependencies::class, FeatureCoreApi::class]
)]
internal interface FeatureAComponent : FeatureAApi {
    fun inject(fragment: FeatureAFragment)
}