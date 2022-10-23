package com.maximapps.dagger.multi.module.common

import android.app.Application
import com.maximapps.dagger.multi.module.di.DaggerAppComponent
import javax.inject.Inject

class App : Application() {
    override fun onCreate() {
        super.onCreate()
        DaggerAppComponent.builder().build().inject(this)
    }

    @Inject
    fun launchFeatures(launchers: Set<@JvmSuppressWildcards FeatureLauncher>) {
        launchers.forEach { it.onLaunch(this) }
    }
}