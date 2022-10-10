package com.maximapps.feature.a.di

object FeatureAComponentHolder {
    private var component: FeatureAComponent? = null

    fun init(dependencies: FeatureADependencies) {
        component = DaggerFeatureAComponent.builder()
            .featureADependencies(dependencies)
            .build()
    }

    internal fun getComponent(): FeatureAComponent = checkNotNull(component)

    fun get(): FeatureAApi = checkNotNull(component)

}