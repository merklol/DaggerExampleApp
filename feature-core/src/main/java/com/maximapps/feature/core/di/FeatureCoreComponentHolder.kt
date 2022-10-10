package com.maximapps.feature.core.di

object FeatureCoreComponentHolder {

    private var component: FeatureCoreComponent? = null

    fun init(dependencies: FeatureCoreDependencies) {
        component = DaggerFeatureCoreComponent.builder()
            .featureCoreDependencies(dependencies)
            .build()
    }

    internal fun getComponent(): FeatureCoreComponent = checkNotNull(component)

    fun get(): FeatureCoreApi = checkNotNull(component)
}