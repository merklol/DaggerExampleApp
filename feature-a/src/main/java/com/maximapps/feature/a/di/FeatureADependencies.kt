package com.maximapps.feature.a.di

import com.maximapps.core.Messenger
import com.maximapps.feature.core.di.FeatureCoreDependencies

interface FeatureADependencies {
    val messenger: Messenger
}

internal fun FeatureADependencies.toFeatureCoreDependencies(): FeatureCoreDependencies =
    FeatureCoreDependenciesImpl(this)

private class FeatureCoreDependenciesImpl(
    dependencies: FeatureADependencies
) : FeatureCoreDependencies {
    override val messenger: Messenger = dependencies.messenger
}