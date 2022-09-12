package com.maximapps.feature.a.di

import com.maximapps.feature.core.di.FeatureCoreApi

object FeatureAComponentHolder {
    private var component: FeatureAComponent? = null

    fun init(dependencies: FeatureADependencies) {
        component = DaggerFeatureAComponent.builder()
            .featureADependencies(dependencies)
            .featureCoreApi(FeatureCoreApi(dependencies.toFeatureCoreDependencies()))
            .build()
    }

    internal fun getComponent(): FeatureAComponent = checkNotNull(component)

    fun get(): FeatureAApi = checkNotNull(component)

}