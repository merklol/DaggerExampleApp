package com.maximapps.feature.core.di

import com.maximapps.feature.core.di.modules.FeatureCoreModule
import dagger.Component

@[FeatureCoreScope Component(
    modules = [FeatureCoreModule::class],
    dependencies = [FeatureCoreDependencies::class]
)]
internal interface FeatureCoreComponent : FeatureCoreApi