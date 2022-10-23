package com.maximapps.dagger.multi.module.di

import com.maximapps.dagger.multi.module.common.App
import dagger.Component

@[AppScope Component(modules = [AppModule::class, FeatureLauncherModule::class])]
interface AppComponent {
    fun inject(app: App)
}