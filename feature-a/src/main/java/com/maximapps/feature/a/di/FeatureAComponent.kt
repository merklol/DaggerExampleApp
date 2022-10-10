package com.maximapps.feature.a.di

import com.maximapps.core.Messenger
import com.maximapps.feature.a.ui.FeatureAFragment
import com.maximapps.feature.a.di.modules.FeatureAModule
import com.maximapps.feature.a.di.modules.UseCasesModule
import dagger.Component

@[FeatureAScope Component(
    modules = [FeatureAModule::class, UseCasesModule::class],
    dependencies = [FeatureADependencies::class]
)]
internal interface FeatureAComponent : FeatureAApi {
    val messenger: Messenger

    fun inject(fragment: FeatureAFragment)
}